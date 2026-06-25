package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.HOD1RequestDTO;
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

}
	