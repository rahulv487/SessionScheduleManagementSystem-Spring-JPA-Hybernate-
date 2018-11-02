package com.cg.ssms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ssms.dto.Client;
import com.cg.ssms.service.TrainingService;



	@Controller
	public class TrainingController {
		@Autowired
		TrainingService trainingservice;
	@RequestMapping (value="showall",method=RequestMethod.GET)
	public ModelAndView getAllDetails(){
		List<Client> clientData=trainingservice.getAllDetails();
		return new ModelAndView("ScheduledSessions", "data", clientData);
}
	@RequestMapping(value="Success",method=RequestMethod.GET)	
	public ModelAndView dataDisplay(@RequestParam("name")String cname){
			return new ModelAndView("Success","ename",cname);
		}
	}