package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys PhanikumarG");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello Guys PhanikumarG");
		driver.get("https://rahylshettyacademy.azurewebsites.net/webapp/");
		String text =driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("http://localhost:8080/webapp/"));
		driver.close();
		System.out.println("Hello Guys PhanikumarG");
	
		
		
	}
}
