package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Hod1;
@Repository
public interface HOD1Repository extends JpaRepository<Hod1, Integer> {

	List<Hod1> findByName(String name);
	List<Hod1> findByaddress(String address);
	List<Hod1> findByExp(Float exp);
	Hod1 findByEmail(String email);
	Hod1 findByMob(String mob);
	
}
