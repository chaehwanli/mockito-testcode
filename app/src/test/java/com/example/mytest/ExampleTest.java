package com.example.mytest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ExampleTest {
    @Test
    public void testSpyingObject() {
        // Create a new list object and spy on it
        List<String> list = new ArrayList<>();
        List<String> spyList = Mockito.spy(list);

        // Call the add() method on the spy object
        spyList.add("hello");

        // Verify that the add() method was called on the spy object
        verify(spyList).add("hello");

        // Verify that the size of the spy object is 1
        assertEquals(1, spyList.size());

        // Replace the second element of the spy object
        doReturn("world").when(spyList).get(1);

        // Verify that the second element of the spy object was replaced
        assertEquals("world", spyList.get(1));
    }
}
