package com.example.mytest;

// UserServiceTest 클래스
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {
    // Mock 객체 생성
    @Mock
    private UserRepository userRepository;

    // UserService 객체에 Mock 객체를 주입
    @InjectMocks
    private UserService userService;

    @Before
    public void setUp() {
        // Mock 객체 초기화
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetUserById() {
        // given
        User user = new User("John", "Doe");

        // UserRepository의 getUserById 메소드가 호출될 때, 위에서 생성한 user 객체를 반환하도록 설정
        when(userRepository.getUserById(1)).thenReturn(user);

        // when
        User result = userService.getUserById(1);

        // then
        // UserRepository의 getUserById 메소드 호출 결과가 예상한 대로인지 확인
        assertEquals(user, result);
    }
}
