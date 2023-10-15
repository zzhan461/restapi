package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Alert;
import com.demo.model.Service;
import com.demo.repository.AlertRepository;

@RestController
public class AlertController {

	@Autowired
	AlertRepository repository;	
    //Find every alerts between start and end time
	@RequestMapping(value = "/alerts", method = RequestMethod.GET)
	public Service getService(@PathVariable("service_id") String id,@PathVariable("start_ts") String start,@PathVariable("end_ts") String end) {
		List<Alert> al=repository.findAll();
		Service s=new Service();
		s.setId(id);
		for(Alert a:al) {
			if(a.getServiceid().equals(id)&&Integer.parseInt(a.getTime())<=Integer.parseInt(end)&&Integer.parseInt(a.getTime())>=Integer.parseInt(start)) {
				s.setName(a.getServiceName());
				s.alerts.add(a);
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
