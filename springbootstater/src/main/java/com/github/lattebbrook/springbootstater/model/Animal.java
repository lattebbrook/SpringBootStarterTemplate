package com.github.lattebbrook.springbootstater.model;

public abstract class Animal {
	
	protected String name;
	protected int age;
	protected String description;
	
	public Animal() {

	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", description=" + description + "]";
	}
	
	
	
}
