package com.spboot.SpringbootWithJdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.SpringbootWithJdbc.dto.LaptopDTO;
import com.spboot.SpringbootWithJdbc.service.LaptopService;

@RestController
public class LaptopController {

	@Autowired
	private LaptopService laptopService;

	@GetMapping("/getLaptop/{laptopId}")
	public LaptopDTO getlaptop(@PathVariable String laptopId) {
		return laptopService.getLaptop(Integer.parseInt(laptopId));
	}

}