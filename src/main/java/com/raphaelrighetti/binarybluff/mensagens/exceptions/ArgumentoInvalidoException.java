package com.raphaelrighetti.binarybluff.mensagens.exceptions;

public class ArgumentoInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ArgumentoInvalidoException() {
		super();
	}
	
	public ArgumentoInvalidoException(String mensagem) {
		super(mensagem);
	}

}
