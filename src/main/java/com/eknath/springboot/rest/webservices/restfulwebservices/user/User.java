package com.eknath.springboot.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All details about user.")
public class User {
	
	private Integer id;
	
	@Size(min=2, message="Name must be atleast 2 characters")
	@ApiModelProperty(notes="should be 2 characters")
	private String name;
	
	@Past
	@ApiModelProperty(notes="Dob should be in the past")
	private Date dob;
	
	public User() {
	}
	
	public User(Integer id, String name, Date dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
}
