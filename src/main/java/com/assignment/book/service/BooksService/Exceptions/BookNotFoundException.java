package com.assignment.book.service.BooksService.Exceptions;


public class BookNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -879346758518365735L;


    public BookNotFoundException(String message) {
        super(message);
    }
}

