package projeto.automacao;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.MetodosDeTestes;

public class PrimeiroTeste {

	MetodosDeTestes metodos = new MetodosDeTestes();
	By escrever = By.xpath("//input[@title = 'Pesquisar']");
	By clicar = By.xpath("//input[@value = 'Pesquisa Google']");
	

	@Before // Executado antes de qualquer teste

	public void setUp() throws Exception {
		metodos.abrirNavegador("https://www.google.com.br/");

	}

	@After // Executado após qualquer teste
	public void tearDown() throws Exception {
		metodos.fecharNavegador();

	}

	@Test
	public void validarTitle() throws IOException {
		metodos.evidenciarTeste("CT1 - Visitar Home Page");
		metodos.validarTitle("Google");
		metodos.escrever(escrever, "Amazon");
		metodos.evidenciarTeste("CT2 - Pesquisar");

	}

	

		

	}


