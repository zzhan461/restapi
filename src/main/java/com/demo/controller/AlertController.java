package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Alert;
import com.demo.repository.AlertRepository;

@RestController
public class AlertController {

	@Autowired
	AlertRepository repository;	
    //Service class for return
	public class Service{
		String service_id;
		String service_name;
		List<Alert> al;
		public Service(){
			al=new ArrayList<>();
		}
		public void setId(String id) {
			this.service_id=id;
		}
		public void setName(String name) {
			this.service_name=name;
		}
	}
	//Get alerts from start to end
	@RequestMapping(value = "/alerts", method = RequestMethod.GET)
	public Service getService(@PathVariable("service_id") String id,@PathVariable("start_ts") String start,@PathVariable("end_ts") String end) {
		List<Alert> aa=repository.findAll();
		Service s=new Service();
		s.setId(id);
		for(Alert a:aa) {
			if(a.getServiceid().equals(id)&&Integer.parseInt(a.getTime())<=Integer.parseInt(end)&&Integer.parseInt(a.getTime())>=Integer.parseInt(start)) {
				s.setName(a.getServiceName());
				s.al.add(a);
			}
		}
		System.out.println("success");
		return s;
	}

	// Insert the Data
	@RequestMapping(value = "/alerts", method = RequestMethod.POST)
	public Alert createAlerts(@RequestBody Alert a) {
		System.out.println("success");
		return repository.save(a);
	}


}
