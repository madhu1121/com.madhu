package com.tcs;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;
import static org.junit.Assert.*;


public class GoogleTest {
	protected WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		//trying
	}
	
	@Test
	public void testGoogleSearch() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium testing tools cookbook");
		element.submit();
 
		 }
	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}
}
