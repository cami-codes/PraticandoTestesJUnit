package com.junit.testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;



import com.junit.praticando.Pessoa;

public class AssertionsTeste {

	@Test
	@Order(1)
	void verificarLancamento() {
		
		int[] primeiroLancamento = {10, 20, 30, 40, 50};
		int[] segundoLancamento = {-1, 5, 2, 3, 10};
		
		// verifica cada posição da array pra ver se é igual
		assertArrayEquals(primeiroLancamento, segundoLancamento);
		
		/* verifica se não é igual
		Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
		*/
	}
	
	
	@Test
	@Order(2)
	void validarSeObjetoEstaNulo() {
		Pessoa pessoa = null;
		
		assertNull(pessoa);
	}
	
	@Test
	@Order(3)
	void validarNumerosDeTiposDiferentes() {
		
		double valor = 5.0;
		double outroValor = 5.0;
		
		assertEquals(valor, outroValor);
	}
}
