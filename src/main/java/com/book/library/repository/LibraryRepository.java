package com.book.library.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.book.library.model.Book;

public interface LibraryRepository extends MongoRepository<Book, Integer> {
	

}
