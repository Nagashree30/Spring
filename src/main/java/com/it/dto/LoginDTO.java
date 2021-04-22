package com.it.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class LoginDTO implements Serializable{
	
	public LoginDTO() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	private int id;
	
	private String name;
	
	private String password;

}
