package aprendendo_selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeirosPassos {

	WebDriver driver;

	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com.br");
		driver.manage().window().maximize();
	}

	@Test
	public void teste() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement caixaPesquisa = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		caixaPesquisa.sendKeys("teste");
		//caixaPesquisa.clear(); //nesse caso nem precisa, mas apenas p/ treinar
		WebElement botaoPesquisar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]"));
		botaoPesquisar.click();

	}

	@After
	public void posCondicao() {
		driver.quit();
	}

}

