package com.inventory.service;

import com.inventory.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(User user);
    User findByUsername(String username);
}