package com.raphaelrighetti.binarybluff.mensagens.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphaelrighetti.binarybluff.mensagens.exceptions.MensagemNaoEncontradaException;
import com.raphaelrighetti.binarybluff.mensagens.models.Mensagem;
import com.raphaelrighetti.binarybluff.mensagens.repositories.MensagemRepository;

@Service
public class MensagemObterService {
	
	@Autowired
	private MensagemRepository repository;
	
	public Mensagem obterPorId(String id) {
		Mensagem mensagem = repository.findById(id)
				.orElseThrow(() -> new MensagemNaoEncontradaException(id));
		
		return mensagem;
	}
	
	public Mensagem obterPorMensagem(String mensagemConteudo) {
		Mensagem mensagem = repository.findByMensagem(mensagemConteudo);
		
		if (mensagem == null) {
			throw new MensagemNaoEncontradaException();
		}
		
		return mensagem;
	}

}
