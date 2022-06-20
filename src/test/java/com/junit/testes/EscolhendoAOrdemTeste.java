package com.junit.testes;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// @TestMethodOrder(MethodOrderer.MethodName.class) executa os testes ordenando pelo nome
// @TestMethodOrder(MethodOrderer.Random.class) executa os testes aleatoriamente
//@TestMethodOrder(MethodOrderer.DisplayName.class) personaliza o nome do teste
public class EscolhendoAOrdemTeste {

	@Order(4)
	@Test
	void validaFluxoA() {
		
	}
	
	@Order(3)
	@Test
	void validaFluxoB() {
		
	}
	
	@Order(1)
	@Test
	void validaFluxoC() {
		
	}
	
	@Order(2)
	@Test
	void validaFluxoD() {
		
	}
}
