package com.bmw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmw.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
