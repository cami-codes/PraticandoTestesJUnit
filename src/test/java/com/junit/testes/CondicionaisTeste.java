package com.junit.testes;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


public class CondicionaisTeste {

	@Test
	@EnabledIfEnvironmentVariable(named = "USER", matches = "camila m")
	void validarAlgoSomenteNoUsuarioCamila() {
		Assertions.assertEquals(10, 5 + 5);
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void validarAlgoSomenteNoWindows() {
		Assertions.assertEquals(10, 5 + 5);
	}
	
	@Test
	@EnabledOnOs({OS.MAC, OS.WINDOWS})
	void validarSistemaOperacionalArray() {
		Assertions.assertEquals(10, 5 + 5);
	}
	
	@Test
	@EnabledOnJre(JAVA_17)
	void validarSomenteEmUmaJREespecifica() {
		Assertions.assertEquals(10, 5 + 5);
	}
	
	@Test
	@EnabledForJreRange(min = JAVA_11, max = JAVA_17)
	void validarJrePorMinEMax() {
		Assertions.assertEquals(10, 5 + 5);
	}
	
}
