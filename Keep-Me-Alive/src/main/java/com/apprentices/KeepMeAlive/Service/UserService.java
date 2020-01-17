package com.apprentices.KeepMeAlive.Service;

import com.apprentices.KeepMeAlive.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



}
