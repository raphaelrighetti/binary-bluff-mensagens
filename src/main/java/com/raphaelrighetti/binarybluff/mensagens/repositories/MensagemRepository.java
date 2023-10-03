package com.raphaelrighetti.binarybluff.mensagens.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.raphaelrighetti.binarybluff.mensagens.models.Mensagem;

public interface MensagemRepository extends MongoRepository<Mensagem, String> {
	
	Mensagem findByMensagem(String mensagem);

}
