package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosDeTestes {

	WebDriver driver;

	public void abrirNavegador(String url) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	public void validarTitle(String titleEsperado) {

		String title = driver.getTitle();
		System.out.println(title);
		assertEquals(titleEsperado, title);

	}

	public void fecharNavegador() {

		driver.quit();

	}

	public void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void evidenciarTeste(String nomeEvidencia) throws IOException {

		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + " .png");
		FileUtils.copyFile(scrFile, destFile);

	}

}
