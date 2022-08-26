package com.spboot.SpringbootWithJdbc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spboot.SpringbootWithJdbc.model.Laptop;

@Repository
public interface LaptopDao extends JpaRepository<Laptop, Integer> {

}
