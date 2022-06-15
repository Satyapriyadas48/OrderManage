package com.example.demo.custom.exception;

public class FetchOrderFailedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FetchOrderFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public FetchOrderFailedException(String message) {
		super(message);
	}

}
