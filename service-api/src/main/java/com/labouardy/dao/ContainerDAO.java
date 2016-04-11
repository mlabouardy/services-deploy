package com.labouardy.dao;

import java.util.Collection;
import com.labouardy.model.Container;

public interface ContainerDAO {

	Collection<Container> findAll();
	
	Container update(Container container);
	
	void save(Container container);
	
	Container delete(Container container);
	
	Container findById(Long id);
}
