package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.HOD1RequestDTO;
import com.example.demo.dto.HOD1ResponseDTO;
import com.example.demo.model.Hod1;
import com.example.demo.repository.HOD1Repository;
@Service
public class HOD1ServiceImpl implements HOD1Service {
	
@Autowired
private HOD1Repository hr;

	@Override
	public void add(HOD1RequestDTO dto) {
		// TODO Auto-generated method stub
		Hod1 hod = new Hod1(dto);
		hr.save(hod);
	}

	@Override
	public List<HOD1ResponseDTO> display() {
		// TODO Auto-generated method stub
		List<HOD1ResponseDTO> dto = new ArrayList<>();
		for(Hod1 x : hr.findAll()) {
			dto.add(HOD1ResponseDTO.toResponse(x));
		}
		return dto;
	}

	@Override
	public List<HOD1ResponseDTO> searchByName(String name) {
		// TODO Auto-generated method stub
		List<HOD1ResponseDTO> dto = new ArrayList<>();
		for(Hod1 x : hr.findByName(name)) {
			dto.add(HOD1ResponseDTO.toResponse(x));	
		}
		return dto	;
	}

	@Override
	public List<HOD1ResponseDTO> serachByAddress(String address) {
		// TODO Auto-generated method stub
		List<HOD1ResponseDTO> dto = new ArrayList<>();
		for(Hod1 x : hr.findByaddress(address)) {
			dto.add(HOD1ResponseDTO.toResponse(x));
			
		}
		return dto	;
	}

	@Override
	public List<HOD1ResponseDTO> searchByExp(Float exp) {
		// TODO Auto-generated method stub
		List<HOD1ResponseDTO> dto = new ArrayList<>();
		for(Hod1 x : hr.findByExp(exp)) {
			dto.add(HOD1ResponseDTO.toResponse(x));
		}
		return dto	;	
	}

	@Override
	public HOD1ResponseDTO searchByEmail(String email) {
		// TODO Auto-generated method stub
		Hod1 hod = hr.findByEmail(email);
		return HOD1ResponseDTO.toResponse(hod);
	}

	@Override
	public HOD1ResponseDTO searchByMob(String mob) {
		// TODO Auto-generated method stub
		Hod1 hod = hr.findByMob(mob);
		return HOD1ResponseDTO.toResponse(hod);
	}

}
	