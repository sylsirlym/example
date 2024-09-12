package com.skills.blog.controller.repos;

import com.skills.blog.controller.entities.Users;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Created by sylvester
 * Email: musyokisyl81@gmail.com
 * Date: 12/09/2024
 * Time: 22:35
 */
@ApplicationScoped
public class UsersRepository implements PanacheRepository<Users> {
}
