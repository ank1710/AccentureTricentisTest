package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Metodos extends Browser  {
	/**
	 * Metodo para clicar em um elemento
	 * 
	 * @author Leonardo Zanatta Ribeiro
	 * @param elemento
	 */

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("------------------erro ao clicar no elemento ---------------" + e.getMessage());
			System.out.println("------------------causa erro-----------------------" + e.getCause());

		}
	}

	/**
	 * Metodo para digitar em um elemento
	 * 
	 * @author Leonardo Zanatta Ribeiro
	 * @param elemento
	 */
	public void digitar(By elemento, String text) {
		try {
			driver.findElement(elemento).sendKeys(text);
		} catch (Exception e) {
			System.out.println("------------------erro ao escrever no elemento ---------------" + e.getMessage());
			System.out.println("------------------causa erro-----------------------" + e.getCause());
		}

	}

	/**
	 * Metodos para enviar algo
	 * 
	 * @author Leonardo Zanatta Ribeiro
	 * @param elemento
	 */
	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.out.println("------------------erro ao escrever no elemento ---------------" + e.getMessage());
			System.out.println("------------------causa erro-----------------------" + e.getCause());
		}
	}

	/**
	 * Metodo para tirar evidencia
	 * 
	 * @author Leonardo Zanatta Ribeiro
	 * @param nomeEvidencia
	 */

	public void screenShot(String nomeEvidencia) {
		try {
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidences/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			System.err.println("--------erro ao tirar screenShot" + e.getMessage());
			System.err.println("--------causa do erro" + e.getCause());
		}
	}

	/**
	 * Metodo para validar o texto esperado
	 * 
	 * @authorLeonardo Zanatta Ribeiro
	 * @param elemento
	 */

	public void validarTexto(By elemento, String textoEsperado) {
		try {
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);
			
		} catch (Exception e) {
			System.err.println("--------erro ao validar texto " + e.getMessage());
			System.err.println("--------causa do erro" + e.getCause());
		}
	}

	/**
	 * Metodo para pausar o teste
	 * 
	 * @author Leonardo Zanatta Ribeiro
	 * 
	 */
	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.err.println("--------erro ao validar texto" + e.getMessage());
			System.err.println("--------causa do erro" + e.getCause());
		}
	}
	/**
	 * Metodo para ver se o elemento � visivel e clicavel
	 * 
	 * @author Leonardo Zanatta Ribeiro
	 * 
	 */
	
	

	
}
