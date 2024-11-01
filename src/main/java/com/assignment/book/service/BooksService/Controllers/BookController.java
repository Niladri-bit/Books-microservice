package com.assignment.book.service.BooksService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.assignment.book.service.BooksService.DTOS.BookDTO;
import com.assignment.book.service.BooksService.DTOS.StockUpdateRequestDTO;
import com.assignment.book.service.BooksService.Entities.BookEntity;
import com.assignment.book.service.BooksService.Services.BookService;

import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookDTO>> getAllBooks() {
        List<BookDTO> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable Long id) {
    	BookDTO book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @PostMapping
    public ResponseEntity<BookDTO> addBook(@RequestBody BookEntity book,HttpServletRequest request) {
    	BookDTO createdBook = bookService.addBook(book,request);
        return ResponseEntity.status(201).body(createdBook);
    }

    @PutMapping("/{id}/stock")
    public ResponseEntity<String> updateStock(@PathVariable Long id, @RequestBody StockUpdateRequestDTO stockUpdateRequestDTO,HttpServletRequest request) {
        bookService.updateStock(id, stockUpdateRequestDTO.getStock(),request);
        return ResponseEntity.status(200).body("Stock has been updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id,HttpServletRequest request) {
        bookService.deleteBook(id,request);
        return ResponseEntity.status(200).body("Book has been successfully deleted");
    }
}

