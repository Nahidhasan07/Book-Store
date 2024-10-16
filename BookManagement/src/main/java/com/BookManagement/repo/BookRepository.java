package com.BookManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookManagement.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}