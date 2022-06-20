package com.junit.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.junit.praticando.Conta;
import com.junit.praticando.TransferenciaEntreContas;

public class ExceptionsTeste {

	@Test
	void validaCenarioDeExcecaoNaTransferencia() {
		Conta contaOrigem = new Conta("123456", 0);
		Conta contaDestino = new Conta("456789", 100);
		
		TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
		
		// espera que a exceção seja lançada
		Assertions.assertThrows(IllegalArgumentException.class, () ->
		transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
		
		
		// não espere que a exceção seja lançada
		// Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
	}
	
}
