package com.junit.testes;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.praticando.BancoDeDados;
import com.junit.praticando.Pessoa;

public class ConsultarDadosDePessoaTest {
	
	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.iniciarConexao();
	}
	
	@BeforeEach
	void insereDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa ("João", LocalDate.of(2000, 1, 1)));
	}
	
	@AfterEach
	void removeDadosDoTeste() {
		BancoDeDados.removeDados(new Pessoa ("João", LocalDate.of(2000, 1, 1)));
	}
	
	@Test
	void validarDadosDeRetorno() {
		Assertions.assertTrue(true);
	}
	

	@AfterAll
	static void finalizarConexao() {
		BancoDeDados.finalizarConexao();
	}
	
}
