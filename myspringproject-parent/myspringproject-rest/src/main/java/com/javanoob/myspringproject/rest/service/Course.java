package com.javanoob.myspringproject.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/course")
@Produces("application/json")
public interface Course {
	
	@GET
	@Path("/{id}")
	public Response getCourse(@PathParam("id") Long id);
}
