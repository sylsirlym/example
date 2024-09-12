package com.skills.blog.controller.services;

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
    public Users createUser() {
        Users user = new Users();
        user.setUsername("test");
        user.setPassword("123456");
        user.setEmail("test@test.com");
        user.setBio("My big bio");
        user.setCreatedAt(new Date());
        user.setAvatar("link");
        usersRepository.persist(user);
        return user;
    }

}
