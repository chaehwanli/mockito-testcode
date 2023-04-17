package com.example.mytest;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private Map<Integer, User> users = new HashMap<>();

    public UserRepositoryImpl() {
        User user1 = new User("John", "Doe");
        User user2 = new User("Jane", "Doe");
        users.put(1, user1);
        users.put(2, user2);
    }

    // 특정 ID에 해당하는 User 반환
    public User getUserById(int id) {
        return users.get(id);
    }
}
