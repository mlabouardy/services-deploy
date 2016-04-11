package com.labouardy.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

import com.labouardy.dao.ContainerDAO;
import com.labouardy.model.Container;

public class ContainerImp implements ContainerDAO{
	
	private Collection<Container> containers=new ArrayList();
	
	public ContainerImp(){
		Stream.of("Apache","MySQL","Neo4J","Artifactory")
			  .forEach(name -> save(new Container(name)));
	}

	public Collection<Container> findAll() {
		return containers;
	}

	public Container update(Container container) {
		if(containers.contains(container)){
			
			return container;
		}
		throw new RuntimeException("Container not found");
	}

	public void save(Container container) {
		containers.add(container);
	}

	public Container delete(Container container) {
		containers.remove(container);
		return container;
	}

	public Container findById(final Long id) {
		return containers.stream()
				  .filter(c -> c.getId()==id)
				  .findAny()
				  .get();
	}
	
	
}
