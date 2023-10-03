package com.raphaelrighetti.binarybluff.mensagens.exceptions;

public class MensagemNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public MensagemNaoEncontradaException() {
		super();
	}
	
	public MensagemNaoEncontradaException(String mensagemId) {
		super("Mensagem de id '" + mensagemId + "' não encontrada.");
	}

}
