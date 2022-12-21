package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\eclipse\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.id("userName")).sendKeys("Ashwathi Diana");
		driver.findElement(By.id("userEmail")).sendKeys("ashwathprince@gmail.com");
		
	    JavascriptExecutor executorjs = (JavascriptExecutor) driver;
	    executorjs.executeScript("window.scrollBy(0,200)");
	    
	    WebElement address = driver.findElement(By.id("currentAddress"));
	    address.sendKeys("6/34 Bharathi st");
	    
		Actions obj = new Actions(driver);
		obj.keyDown(Keys.CONTROL);//press down
		obj.sendKeys("A");
		obj.keyUp(Keys.CONTROL);//release
		obj.build().perform();
		
		obj.keyDown(Keys.CONTROL);//press down
		obj.sendKeys("C");
		obj.keyUp(Keys.CONTROL);//release
		obj.build().perform();
	    
		obj.sendKeys(Keys.TAB);
		obj.build().perform();
		
		obj.keyDown(Keys.CONTROL);//press down
		obj.sendKeys("V");
		obj.keyUp(Keys.CONTROL);//release
		obj.build().perform();
		

	}

}
