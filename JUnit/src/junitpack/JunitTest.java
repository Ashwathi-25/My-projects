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

import junit.framework.Assert;

public class JunitTest extends JUnitHTMLReporter {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\eclipse\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
	@Test
	public void test() {
		
	    JavascriptExecutor executorjs = (JavascriptExecutor) driver;
	    executorjs.executeScript("window.scrollBy(0,100)");
			
		Actions obj = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("draggable")); 
		WebElement drop = driver.findElement(By.id("droppable"));	 
	
		obj.dragAndDrop(drag, drop).build().perform();
		
		String dropbox = drop.getText();
		System.out.println(dropbox);
		
		assertEquals(dropbox, "Dropped!");
	
		
	}
	@Test
	public void test1() {
		
	    JavascriptExecutor executorjs = (JavascriptExecutor) driver;
	    executorjs.executeScript("window.scrollBy(0,100)");
			
		Actions obj = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("draggable")); 
		WebElement drop = driver.findElement(By.id("droppable"));	 
	
		obj.dragAndDrop(drag, drop).build().perform();
		
		String dropbox = drop.getText();
		System.out.println(dropbox);
		
		assertEquals(dropbox, "Droped!");
	
		
	}

}
