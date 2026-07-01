package com.example.demo.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HOD1RequestDTO {

	@NotNull
	@NotBlank(message = "Name is required cannot be blank")
	@Size(min = 2, max = 30, message = "Name must be between 2 to 30 characters")
	private String name;
	
	@NotBlank(message = "Email is required cannot be blank")
	@Email(message = "Invalid email format")
	private String email;
	
	@NotNull(message = "Experience is required cannot be null")
	@Positive(message = "Experience must be greater than zero")
	@Max(message = "Exprience cannot be greater than 50 years", value = 50)
	private Float exp;
	
	@NotNull(message = "Salary is required cannot be null")
	@Positive(message = "Salary must be greater than 0")
	private Float salary;
	
	@NotNull(message = "Address is required cannot be null")
	@NotBlank(message = "Address is required cannot be blank")
	private String address;
	
	@NotNull(message = "Password is required canot be null")
	@NotBlank(message = "Password is required cannot be blank")
	private String password;
	
	@NotNull(message = "Mobile is required cannot be null")
	@NotBlank(message = "Mobile is required cannot be blank")
	@Pattern(regexp = "^[6-9]\\\\d{9}$", message = "Mobile number must be 10 digit start with 6 to 9")
	private String mob;
	
	
	private List<String> subjects;
}
