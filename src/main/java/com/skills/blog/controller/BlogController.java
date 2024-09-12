package com.skills.blog.controller;

import com.skills.blog.controller.entities.Users;
import com.skills.blog.controller.services.BlogServices;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Created by sylvester
 * Email: musyokisyl81@gmail.com
 * Date: 12/09/2024
 * Time: 06:45
 */
@Path("/v1")
public class BlogController {
    @Inject
    BlogServices blogServices;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String welcome() {
        return "Welcome to Blogify! Great things ahead";
    }

    @GET()
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public Users createUser() {
        return blogServices.createUser();
    }
}
