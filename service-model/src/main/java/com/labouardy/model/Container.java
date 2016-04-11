package com.labouardy.model;

import java.util.Random;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Container {

	private Long id;

	private String name;

	private String description;

	private int port;
	
	public Container(){}
	
	public Container(String name){
		this.id=new Random().nextLong();
		this.name=name;
		this.description="No available description";
		this.port=new Random().nextInt(5000);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
