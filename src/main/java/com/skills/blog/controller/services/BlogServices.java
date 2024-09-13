package com.skills.blog.controller.services;

import com.skills.blog.controller.dtos.UserRegistration;
import com.skills.blog.controller.entities.Users;
import com.skills.blog.controller.repos.UsersRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.Date;

/**
 * Created by sylvester
 * Email: musyokisyl81@gmail.com
 * Date: 12/09/2024
 * Time: 22:37
 */
@ApplicationScoped
public class BlogServices {
    @Inject
    UsersRepository usersRepository;

    @Transactional
    public Users createUser(UserRegistration userRegistration) {

        Users user = new Users();
        user.setUsername(userRegistration.getUsername());
        user.setPassword(userRegistration.getPassword());
        user.setEmail(userRegistration.getEmail());
        user.setBio(userRegistration.getBio());
        user.setCreatedAt(new Date());
        user.setAvatar(userRegistration.getAvatar());
        user.setRole(userRegistration.getRole());
        usersRepository.persist(user);
        return user;
    }

}
