package com.aestasit.blog.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Date;
import java.util.List;

@Path("blog")
public class BlogServiceRestImpl implements BlogService {

    @GET
    @Path("post/{id}")
    @Produces("application/json")
    public BlogPost getPostById(@PathParam("id") String id) {
        // Database lookup and return the Blog post by ID
        // ...in the meanwhile, just for testing
        BlogPost blogpost = new BlogPost(Long.parseLong(id), "My new car", "I bought a car", new Date(), "me");
        return blogpost;
    }


    public List getTags() {
        return null;
    }

}
