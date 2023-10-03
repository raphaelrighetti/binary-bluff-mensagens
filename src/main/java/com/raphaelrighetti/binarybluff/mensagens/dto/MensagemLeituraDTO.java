package com.raphaelrighetti.binarybluff.mensagens.dto;

import java.util.List;

import com.raphaelrighetti.binarybluff.mensagens.models.Mensagem;

public record MensagemLeituraDTO(String id, String mensagem, Boolean respondida, List<String> respostasIds) {
	
	public MensagemLeituraDTO(Mensagem mensagem) {
		this(mensagem.getId(), 
				mensagem.getMensagem(),
				mensagem.getRespondida(),
				mensagem.getRespostas()
				.stream()
				.map(Mensagem::getId)
				.toList());
	}

}
