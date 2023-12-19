package com.sha.springbootmicroservice3gateway.service;

import com.sha.springbootmicroservice3gateway.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;

    
}
