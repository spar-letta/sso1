package com.javenock.authserversso.service;

import com.javenock.authserversso.model.User;

public interface UserService {
    User getByUsername(String username);
    User save(User user);
}
