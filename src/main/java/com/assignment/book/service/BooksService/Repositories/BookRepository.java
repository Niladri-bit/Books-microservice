package com.assignment.book.service.BooksService.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.book.service.BooksService.Entities.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
	 Optional<BookEntity> findByTitle(String title);
}
