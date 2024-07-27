package com.mautech.service;

import com.mautech.config.JwtProvider;
import com.mautech.model.User;
import com.mautech.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo userRepo;
    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public User findUserByJwtToken(String jwt) throws Exception {
        String email = jwtProvider.getEmailFromJwtToken(jwt);
            User user = findUserByEmail(email);

        return user;
    }

    @Override
    public User findUserByEmail(String email) throws Exception {

        User user = userRepo.findByEmail(email);

        if (user== null) {
            throw new Exception("USER NOT FOUND");
        }
        return user;
    }
}
