package com.spboot.SpringbootWithJdbc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spboot.SpringbootWithJdbc.dao.LaptopDao;
import com.spboot.SpringbootWithJdbc.dto.LaptopDTO;
import com.spboot.SpringbootWithJdbc.model.Laptop;

@Service
public class LaptopServiceImpl implements LaptopService {

	@Autowired
	private LaptopDao laptopDao;

	@Override
	public LaptopDTO getLaptop(int id) {
		Optional<Laptop> opLaptop = laptopDao.findById(id);
		LaptopDTO laptopDTO = new LaptopDTO();
		if (opLaptop.isPresent()) {
			Laptop laptop = opLaptop.get();
			laptopDTO.setId(laptop.getId());
			laptopDTO.setName(laptop.getName());
			laptopDTO.setBrand(laptop.getBrand());
		}
		return laptopDTO;
	}

}
