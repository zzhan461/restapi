package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//the entity for alerts
@Entity
public class Alert {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String alert_id;
	private String service_id;
	private String service_name;
	private String model;
	private String alert_type;
	private String alert_ts;
	private String severity;
	private String team_slack;

	public String getId() {
		return alert_id;
	}

	public void setId(String id) {
		this.alert_id = id;
	}
	public String getServiceid() {
		return service_id;
	}

	public void setServiceId(String id) {
		this.service_id =id;
	}

	public String getServiceName() {
		return service_name;
	}

	public void setServiceName(String name) {
		this.service_name = name;
	}
	public String getmodel() {
		return model;
	}

	public void setModel(String m) {
		this.model = m;
	}
    
	public String getType() {
		return alert_type;
	}

	public void setType(String m) {
		this.alert_type = m;
	}
	
	public String getTime() {
		return alert_ts;
	}

	public void setTime(String m) {
		this.alert_ts = m;
	}
	
	public String getse() {
		return severity;
	}

	public void setse(String m) {
		this.severity = m;
	}
	
	public String getTeam() {
		return team_slack;
	}

	public void setTeam(String m) {
		this.team_slack = m;
	}
}
