package com.book.library.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	private int personId;
	private String name;
	private String location;
	private LocalDate dob;
	private String idProof;
	

}
