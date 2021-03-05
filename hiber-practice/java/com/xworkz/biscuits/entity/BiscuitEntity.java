package com.xworkz.biscuits.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "biscuit")
public class BiscuitEntity {
	@Id
	@Column(name = "ID")
	@GenericGenerator(name = "b", strategy = "increment")
	@GeneratedValue(generator = "b")
	private int id;
	@Column(name = "BISCUIT_NAME")
	private String name;
	@Column(name = "COMPANY")
	private String companyName;
	@Column(name = "BISCUIT_TYPE")
	private String biscuitType;
	@Column(name = "SHAPE")
	private String shape;
	@Column(name = "PRICE")
	private int price;

	
	
	
	public BiscuitEntity(String name, String companyName, String biscuitType, String shape, int price) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.biscuitType = biscuitType;
		this.shape = shape;
		this.price = price;
	}

}
