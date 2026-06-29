package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.HOD1RequestDTO;
import com.example.demo.dto.HOD1ResponseDTO;

public interface HOD1Service {
public void add(HOD1RequestDTO dto);

public List<HOD1ResponseDTO> display();
	
List<HOD1ResponseDTO> searchByName(String name);
List<HOD1ResponseDTO> serachByAddress(String address);
List<HOD1ResponseDTO> searchByExp(Float exp);
HOD1ResponseDTO searchByEmail(String email);
HOD1ResponseDTO searchByMob(String mob);


}
