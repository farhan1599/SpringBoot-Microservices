package com.springboot.entity;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("studentHash") // when we're using RDBMS then we'll use @Entity
public class Student {

	private Integer id;
	private String name;
	private Integer rollno;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

}
