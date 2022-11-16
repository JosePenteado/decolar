package automacaoPassagens;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Metodos.MetodosTeste;

public class ExecutaTeste {
MetodosTeste metodos = new MetodosTeste();

	
	By iniciarSessao = By.xpath("//*[@id=\"not-logged\"]");
	By gmail = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[3]/div[2]/a");
	By email = By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]");
	
	
	
	
	@Before
	public void setUp() throws Exception {
	metodos.abrirNavegador("https://decolar.com");
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		
		metodos.clicar(iniciarSessao);
		metodos.clicar(gmail);
		metodos.escrever(email, "massateste12");
		
	
		
		
	}
	

}
