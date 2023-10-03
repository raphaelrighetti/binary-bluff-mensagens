package com.raphaelrighetti.binarybluff.mensagens.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.raphaelrighetti.binarybluff.mensagens.dto.MensagemCadastroDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "mensagens")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mensagem {
	
	@Id
	private String id;
	private String mensagem;
	@DocumentReference
	private List<Mensagem> respostas;
	private Boolean respondida = false;
	
	public Mensagem(MensagemCadastroDTO dto) {
		mensagem = dto.mensagem().toLowerCase();
	}
	
	public List<Mensagem> getRespostas() {
		if (respostas == null) {
			return new ArrayList<>();
		}
		
		return respostas;
	}
	
}
