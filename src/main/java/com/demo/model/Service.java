package com.demo.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.demo.model.Alert;
//the entity for service
@Entity
public class Service {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String service_id;
	private String service_name;
	public List<Alert> alerts;


	public String getId() {
		return service_id;
	}

	public void setId(String id) {
		this.service_id = id;
	}
	public String getname() {
		return service_name;
	}

	public void setName(String name) {
		this.service_name =name;
	}

	public Service() {
		alerts=new ArrayList<>();
	}

}