package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HOD1RequestDTO;
import com.example.demo.model.Hod1;
import com.example.demo.service.HOD1Service;

@RestController
public class HOD1Controller {
	@Autowired
	private HOD1Service hs;

	@PostMapping("add")
	public void addHOd1(HOD1RequestDTO dto) {
		hs.add(dto);
	}
}
