package com.javanoob.myspringproject.rest.service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Service;

import com.javanoob.myspringproject.rest.dto.CourseDto;

@Service("course")
public class CourseImpl implements Course {

	
	public Response getCourse(Long id) {
		CourseDto courseDto = new CourseDto(id, "CS101", "Intro to CS");
		
		return Response.status(Status.OK).entity(courseDto).type(MediaType.APPLICATION_JSON).build();
	}

	
}