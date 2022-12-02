package com.saulsanchez.universidad.universidadbackend;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UniversidadBackendApplicationTests {

	Calculadora calculadora = new Calculadora();

	@Test
	@DisplayName("Suma de valor A y valor B")
	void sumaDeValores() {
		//given
		int valorA = 3;
		int valorB = 3;

		//when
		int expectativa = calculadora.sumar(valorA, valorB);

		//then
		int resultadoEsperado = 5;
		assertThat(expectativa).isEqualTo(resultadoEsperado);
	}

	@Test
	@DisplayName("Test deprecado")
	@Disabled("Test deprecado")
	void testDesactivado() {

	}

	class Calculadora {
		int sumar(int valor_a, int valor_b) {
			return valor_a + valor_b;
		}
	}

}
