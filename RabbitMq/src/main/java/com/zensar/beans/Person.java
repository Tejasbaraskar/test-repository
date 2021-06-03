package com.zensar.beans;

import java.io.Serializable;

public class Person implements Serializable{

	private long Id;
	private String name;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(long id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", name=" + name + "]";
	}
	
	
}
