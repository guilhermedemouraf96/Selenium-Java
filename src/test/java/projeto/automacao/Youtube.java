package projeto.automacao;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.MetodosDeTestes;

public class Youtube {

	MetodosDeTestes metodos = new MetodosDeTestes();
	By elemento = By.xpath("//input[@id='search']");

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("https://www.youtube.com/");

	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();
	}

	@Test
	public void validarTitulo() throws IOException {
		metodos.evidenciarTeste("C1 - Youtube");
		metodos.validarTitle("YouTube");

	}

	@Test
	public void escrever() throws IOException {
		metodos.escrever(elemento, "Maron 5");
		metodos.evidenciarTeste("C2 - Escrevendo na barra de pesquisa");
		
	}
	
	
}



