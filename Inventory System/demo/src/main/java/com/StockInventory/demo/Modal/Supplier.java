package com.StockInventory.demo.Modal;

import java.util.ArrayList;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



import com.StockInventory.demo.Modal.Address;


@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer id;
String name;
@OneToOne(cascade = CascadeType.ALL)
Address address;
@OneToMany(mappedBy = "suppliers", cascade = CascadeType.ALL)
ArrayList<Telephone> telephones;


public ArrayList<Telephone> getTelephones() {
	return telephones;
}
public void setTelephones(ArrayList<Telephone> telephones) {
	this.telephones = telephones;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
