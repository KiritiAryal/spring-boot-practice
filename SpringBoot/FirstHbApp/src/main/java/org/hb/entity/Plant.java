package org.hb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//JPA -> Java Persistence API

@Entity
@Table(name = "plant_tb")
public class Plant {
	
	@Id
	private int id; // PK
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
