package com.chimera.registration.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class RegisterDTO implements Serializable{
	
public RegisterDTO() {
	System.out.println("created" +this.getClass().getSimpleName());
}	
	private int id;
	private String name;
	private String mail;
	private String password;
	private String cpassword;

}
