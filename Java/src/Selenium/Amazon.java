package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	      String url = "http://amazon.com";
	      driver.get(url);
	      
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
	      driver.findElement(By.cssSelector("input[value=Go]")).click();
	      
	      //using JavaScriptExecutor to scroll the page
	      JavascriptExecutor executorjs = (JavascriptExecutor) driver;
	      
	      executorjs.executeScript("window.scrollBy(0,1000)");
	      
	      
	      System.out.println(driver.findElement(By.cssSelector("#p13n-asin-index-0 >div >span >div")).getText());
	      
	      
	     // System.out.println(results.size());
	      
	     //System.out.println(results.get(0).getText());
	      
	     //driver.findElement(By.xpath("//span/div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated']")); 
	     
	     //List<WebElement> results = driver.findElements(By.xpath("//span/div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated']"));
	     
	     //System.out.println(results.size());

	}

}
