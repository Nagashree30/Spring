package com.chimera.registration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="register")
public class RegisterEntity {
	public RegisterEntity() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Id
	@Column(name="ID")
	private int id;
	
	@NotEmpty
	@NonNull
	@Size(min = 2, max = 30)
	@Column(name="NAME")
	private String name;
	
	@NotEmpty
	@NonNull
	@Size(min = 2, max = 30)
	@Email
	@Column(name="MAIL")
	private String mail;
	
	@NotEmpty
	@NonNull
	@Size(min = 2, max = 30)
	@Column(name="PASSWORD")
	private String password;
	
	@NotEmpty
	@NonNull
	@Size(min = 2, max = 30)
	@Column(name="CPASSWORD")
	private String cpassword;
}
