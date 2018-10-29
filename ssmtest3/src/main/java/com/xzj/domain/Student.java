package com.xzj.domain;

public class Student {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		return this.age;
	}
	@Override
	public boolean equals(Object obj) {
		Student stu=(Student)obj;
		if(this.age==stu.age) {
			return true;
		}
		return false;
	}
}
