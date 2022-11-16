package Metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosTeste {
	
	
	
	WebDriver driver;
	
	public void abrirNavegador(String url){
		
		System.setProperty("web.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	
	}
	
	public void fecharNavegador() {
		//driver.quit(); 
	}
	
	public void tirarPrint(String nomePrint) throws IOException {
		TakesScreenshot print = (TakesScreenshot) driver;
		File arquivo = print.getScreenshotAs(OutputType.FILE);
		File destinoArquivo = new File("./Evidencias" + nomePrint +".png");
		FileUtils.copyFile(arquivo, destinoArquivo);
	}
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}

}
