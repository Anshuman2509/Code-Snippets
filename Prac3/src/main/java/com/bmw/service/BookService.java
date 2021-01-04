package com.bmw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmw.dao.BookRepository;
import com.bmw.entity.Book;
@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;	
	
	public void createBook(Book book) {
		bookRepository.save(book);
	}
	
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}
	
	public Book getBookById(int id) {
		return bookRepository.findById(id).get();
	}
	
	public Book update(int bookId,Book book) {
		book.setId(bookId);
		return bookRepository.save(book);
	}
	
	public void delete(int bookId) {
		bookRepository.deleteById(bookId);
	}

}
