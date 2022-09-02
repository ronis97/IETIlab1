package com.IETI.codelab.service;

import java.util.List;

import com.IETI.codelab.entities.User;

public interface UserService {
    User create(User user);

    User findById(String id);

    List<User> getAll();

    void deleteById(String id);

    User update(User user, String userId);
}
