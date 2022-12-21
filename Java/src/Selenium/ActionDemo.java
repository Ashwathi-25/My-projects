package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\eclipse\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		Actions obj = new Actions(driver);
		
		WebElement rc = driver.findElement(By.id("rightClickBtn"));
		obj.contextClick(rc);
		
		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
		obj.doubleClick(dc);
		
		
	    JavascriptExecutor executorjs = (JavascriptExecutor) driver;
	    executorjs.executeScript("window.scrollBy(0,100)");
		
		WebElement c = driver.findElement(By.xpath("//button[text() ='Click Me']"));
		obj.moveToElement(c).click();
		
		Action action = obj.build();
		action.perform();
		

		
		
		//driver.quit();
		

	}

}
