package com.labouardy.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.labouardy.impl.ContainerImp;
import com.labouardy.model.Container;

@Singleton
@Path("/containers")
public class ContainerResource{
	
	private ContainerImp containerImp=new ContainerImp();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Collection<Container> getContainers(){
		return containerImp.findAll();
	}

	@Path("/test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String message(){
		return "hello world";
	}
}
