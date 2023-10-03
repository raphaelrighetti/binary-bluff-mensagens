package com.raphaelrighetti.binarybluff.mensagens.dto;

import jakarta.validation.constraints.NotBlank;

public record MensagemAdicionarRespostaDTO(@NotBlank String respostaId) {

}
