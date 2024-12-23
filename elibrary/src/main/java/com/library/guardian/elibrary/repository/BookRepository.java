package com.library.guardian.elibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.guardian.elibrary.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByAuthorContainingIgnoreCase(String author);
    List<Book> findByCategoryContainingIgnoreCase(String category);
}
