package br.usjt.Veiculos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.usjt.Veiculos.model.utils.Calculadora;

@Configuration
public class AppConfig {
@Bean
public Calculadora getCalcudora() {
	return new Calculadora();
	}
}