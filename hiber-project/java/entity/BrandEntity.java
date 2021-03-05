package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "brand")
public class BrandEntity {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "COMPANY_NAME")
	private String companyName;
	@Column(name = "TYPE_OF_BRAND")
	private String typeOfBrand;
	@Column(name="PRICE")
	private double price;

}
