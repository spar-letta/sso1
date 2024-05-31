package com.javenock.authserversso.service;

import com.javenock.authserversso.model.User;
import com.javenock.authserversso.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User getByUsername(String username) {
        if (!StringUtils.hasText(username)) {
            return null;
        }
        return repository.findByUsername(username).orElse(null);
    }

    @Override
    public User save(User entity) {
        return repository.save(entity);
    }
}
