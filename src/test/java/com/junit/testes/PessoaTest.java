package com.junit.testes;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.junit.praticando.Pessoa;

public class PessoaTest {

	@Test
	@Order(1)
	public void validarCalculoIdade() {
		Pessoa pessoa = new Pessoa("Joaozinho", LocalDate.of(2020, 1, 1));
		Assertions.assertEquals(2, pessoa.getIdade());
	}
	
	@Test
	@Order(2)
	public void deveCalcularIdadeCorretamente() {
		Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000, 1, 1));
		Assertions.assertEquals(22, jessica.getIdade());
	}
	
	@Test
	@Order(3)
	public void deveRetornarSeEhMaiorDeIdade() {
		Pessoa maria = new Pessoa("Maria", LocalDate.of(2000, 1, 1));
		Assertions.assertTrue(maria.ehMaiorDeIdade());
		
		Pessoa joao = new Pessoa("Joao", LocalDate.now());
		Assertions.assertFalse(joao.ehMaiorDeIdade());
	}
	
	
}
