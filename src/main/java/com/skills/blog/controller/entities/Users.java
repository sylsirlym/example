package com.skills.blog.controller.entities;

import com.skills.blog.controller.Roles;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

/**
 * Created by sylvester
 * Email: musyokisyl81@gmail.com
 * Date: 12/09/2024
 * Time: 22:20
 */

@Entity
@Setter
@Getter
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    private String bio;
    private String avatar;
    private Roles role;
    @Column(name = "created_at")
    private Date createdAt;
}



