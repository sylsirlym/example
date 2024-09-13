package com.skills.blog.controller.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sylvester
 * Email: musyokisyl81@gmail.com
 * Date: 13/09/2024
 * Time: 06:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistration {
    private String username;
    private String email;
    private String password;
    private String bio;
    private String avatar;
    private String role;
}
