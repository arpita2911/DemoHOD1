package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.Hod1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HOD1ResponseDTO {

	private Integer id;
	private String name;
	private String email;
	private Float exp;
	private String address;
	private String mob;
	private List<String> subjects;

	public static HOD1ResponseDTO toResponse(Hod1 hod) {
		HOD1ResponseDTO dto = new HOD1ResponseDTO();
		dto.address = hod.getAddress();
		dto.name = hod.getName();
		dto.email = hod.getEmail();
		dto.exp = hod.getExp();
		dto.mob = hod.getMob();
		dto.id = hod.getId();
		dto.subjects = hod.getSubjects();

		return dto;
	}
}
