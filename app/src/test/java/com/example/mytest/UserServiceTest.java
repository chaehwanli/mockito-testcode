package com.example.mytest;

import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

// UserServiceTest 클래스
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
        //MockitoAnnotations.initMocks(this);
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUserById() {
        // given
        User user = new User("John", "Doe");

        // UserRepository 의 getUserById()가 호출될 때, 위에서 생성한 user 객체를 반환 하도록 설정
        when(userRepository.getUserById(1)).thenReturn(user);

        // when
        User result = userService.getUserById(1);

        // then
        // UserRepository 의 getUserById 메소드 호출 결과가 예상한 대로 인지 확인
        assertEquals(user, result);
    }
}
