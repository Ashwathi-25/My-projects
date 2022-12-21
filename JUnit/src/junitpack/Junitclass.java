package junitpack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Junitclass {

	WebDriver driver;
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\eclipse\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/menu/");
        driver.manage().window().maximize();
	
	}
	@After
	public void teardown() 
	{
		driver.quit();
	}
	@Test
	public void myFirstTest() 
	{
		JavascriptExecutor executorjs = (JavascriptExecutor) driver;
	    executorjs.executeScript("window.scrollBy(0,150)");
		
		Actions obj = new Actions(driver);
		
		WebElement m1 = driver.findElement(By.linkText("Main Item 1"));
		obj.moveToElement(m1).build().perform();
		
		WebElement m2 = driver.findElement(By.linkText("Main Item 2"));
		obj.moveToElement(m2).build().perform();
		
		WebElement s1 = driver.findElement(By.linkText("Sub Item"));
		obj.moveToElement(s1).build().perform();
		String text1 = s1.getText();
		
		WebElement s2 = driver.findElement(By.xpath("//ul[@id= 'nav']/child::li[2]/ul/li[2]/a"));
		obj.moveToElement(s2).build().perform();
		String text2 = s2.getText();
		
		
		WebElement ss1 = driver.findElement(By.xpath("//ul[@id= 'nav']/child::li[2]/ul/li[3]/a"));
		obj.moveToElement(ss1).build().perform();
		String text3 = ss1.getText();
		
		WebElement ssi1 = driver.findElement(By.linkText("Sub Sub Item 1"));
		obj.moveToElement(ssi1).build().perform();
		String text4 =ssi1.getText();
		
		WebElement ssi2 = driver.findElement(By.linkText("Sub Sub Item 2"));
		obj.moveToElement(ssi2).build().perform();
		String text5 = ssi2.getText();
		
		//assertNotEquals(text1,text2,text3,text4,text5, null);
		
		assertNotEquals(text1, null);
	}

}
