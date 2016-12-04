package io.haru.dummer.spring.service;

import io.haru.dummer.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by pheadra on 12/4/16.
 */
public class UserService {
    @Autowired
    UserRepository userRepository;
}
