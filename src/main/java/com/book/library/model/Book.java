package com.book.library.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Book {
	
	@Id
	private int bookId;
	private String bookName;
	private Person person;
	private LocalDateTime issuedDate;
	private boolean isReturned;
	private LocalDateTime returnDate;
	
	

}
