package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Hod1;
@Repository
public interface HOD1Repository extends JpaRepository<Hod1, Integer> {

}
