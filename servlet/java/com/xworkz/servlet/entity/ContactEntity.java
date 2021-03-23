package com.xworkz.servlet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "contact")
@Entity

@NamedQueries({
	@NamedQuery(name = "findByName", query = "select entity from ContactEntity entity where name=:nm")
})
public class ContactEntity {
	
	public ContactEntity(int id, String name, String phone, String company, String email, String about) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.company = company;
		this.email = email;
		this.about = about;
	}
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ABOUT")
	private String about;

}
