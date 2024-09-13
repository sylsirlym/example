package com.skills.blog.controller;

import com.skills.blog.controller.dtos.UserRegistration;
import com.skills.blog.controller.entities.Users;
import com.skills.blog.controller.services.BlogServices;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 * Created by sylvester
 * Email: musyokisyl81@gmail.com
 * Date: 12/09/2024
 * Time: 06:45
 */
@Path("/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BlogController {
    @Inject
    BlogServices blogServices;

    @POST()
    @Path("/users")
    public Users createUser(UserRegistration userRegistration) {
        return blogServices.createUser(userRegistration);
    }
}
