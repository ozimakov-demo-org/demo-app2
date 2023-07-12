package com.redhat.demo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello. I am app2";
    }

    @Path("/{name}")
    @GET
    public String greet(@PathParam("name") String name) {
        return "Hello " + name;
    }

}