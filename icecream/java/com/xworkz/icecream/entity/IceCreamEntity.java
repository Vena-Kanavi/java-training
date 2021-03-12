package com.xworkz.icecream.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ice_cream")
public class IceCreamEntity {
	
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "FLAVOUR")
	@Enumerated(EnumType.STRING)
	private Flavour flavour;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "COLOR")
	@Enumerated(EnumType.STRING)
	private Color color;
	
	public enum Flavour{
		CHOCOLATE,VENILLA,STRAWBERRY,PISTA,REDVELVET,BLACKCURRENT,MIXED
	}
	
	public enum Color{
		BLUE,WHITE,PINK,BROWN,YELLOW,GREEN,MIXED,ORANGE
	}

}
