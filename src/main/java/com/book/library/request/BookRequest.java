package com.book.library.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
	
	private int bookId;
	private String bookName;
	private String person;
	private int age;
	private String idNumber;
	

}
