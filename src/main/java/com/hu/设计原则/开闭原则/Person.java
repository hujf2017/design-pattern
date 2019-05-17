package com.hu.设计原则.开闭原则;

public class Person {
 
	private String name;
	private int age;
	private  String meml;
	
	public Person(String name, int age, String meml) {
		this.name = name;
		this.age = age;
		this.meml = meml;
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
 
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
