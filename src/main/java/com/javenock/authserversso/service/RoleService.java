package com.javenock.authserversso.service;

import com.javenock.authserversso.model.Role;

public interface RoleService {
    Role getByName(String name);
    Role getDefaultRole();
}
