package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HOD1RequestDTO;
import com.example.demo.dto.HOD1ResponseDTO;
import com.example.demo.service.HOD1Service;

import jakarta.validation.Valid;

@RestController
public class HOD1Controller {
	@Autowired
	private HOD1Service hs;
	private Float S;

	@PostMapping("add")
	public void addHOd1(@Valid @RequestBody HOD1RequestDTO dto) {
		hs.add(dto);
	}

	@GetMapping("display")
	public List<HOD1ResponseDTO> displayHOD1() {
		return hs.display();

	}

	@GetMapping("searchByName/{name}")
	public List<HOD1ResponseDTO> searchByName(@RequestParam String name) {
		return hs.searchByName(name);
	}

	@GetMapping("searchByAddress/{address}")
	public List<HOD1ResponseDTO> serachByAddress(@RequestParam String address) {
		return hs.serachByAddress(address);
	}

	@GetMapping("searchByExp/{exp}")
	public List<HOD1ResponseDTO> searchByExperience(@RequestParam Float exp) {
		return hs.searchByExp(exp);
	}

	@GetMapping("searchByEmail/{email}")
	public HOD1ResponseDTO searchByEmail(@RequestParam String email) {
		return hs.searchByEmail(email);
	}

	@GetMapping("searchByMob/{mob}")
	public HOD1ResponseDTO searchByMob(@RequestParam String mob) {
		return hs.searchByMob(mob);
	}

}
