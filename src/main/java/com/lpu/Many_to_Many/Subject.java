package com.lpu.Many_to_Many;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subject {

	@Id
	private int id;
	private String name;
	private String trainerName;
	
	public Subject()
	{
		
	}
	
	public Subject(int id, String name, String trainerName)
	{	
		super();
		this.id = id;
		this.name = name;
		this.trainerName = trainerName;
	}

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

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
}
