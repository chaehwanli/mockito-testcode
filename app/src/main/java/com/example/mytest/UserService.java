package com.example.mytest;

public class UserService {
    private UserRepository userRepository;

    // UserRepository 주입
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 특정 ID에 해당하는 User 반환
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }
}
