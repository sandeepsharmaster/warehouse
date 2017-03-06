package com.warehouse.auth.service;

import com.warehouse.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
