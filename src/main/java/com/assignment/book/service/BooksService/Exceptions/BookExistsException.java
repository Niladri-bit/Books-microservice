package com.assignment.book.service.BooksService.Exceptions;

public class BookExistsException extends RuntimeException{


	/**
	 * 
	 */
	private static final long serialVersionUID = 5524997567930514968L;

	public BookExistsException(String message) {
        super(message);
    }

}
