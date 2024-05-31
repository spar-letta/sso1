package com.javenock.authserversso.service;

import com.javenock.authserversso.model.Role;
import com.javenock.authserversso.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    public static final String DEFAULT_ROLE = "USER";

    private final RoleRepository repository;

    @Override
    public Role getByName(String name) {
        if (!StringUtils.hasText(name)) {
            return null;
        }

        return repository.findByName(name).orElse(null);
    }

    @Override
    public Role getDefaultRole() {
        return getByName(DEFAULT_ROLE);
    }
}

