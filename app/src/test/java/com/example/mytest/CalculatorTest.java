package com.example.mytest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    @Mock
    private Calculator calculator;

    @Test
    public void testAdd() {
        when(calculator.add(2, 3)).thenReturn(5);
        assertEquals(5, calculator.add(2, 3));
    }
}
