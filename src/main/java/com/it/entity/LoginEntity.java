package com.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="login")
public class LoginEntity {
@Id
@Column(name="ID")
	private int id;

@Column(name="NAME")
	private String name;

@Column(name="PASSWORD")
	private String password;
	
}
