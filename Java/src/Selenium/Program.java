package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Program {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	      String url = "http://adactinhotelapp.com";
	      driver.get(url);
	      
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.id("username")).sendKeys("AshTests");
	      
	      WebElement pass = driver.findElement(By.id("password"));
	      pass.sendKeys("12345678");
	      
	    //Click n the register link by class
	        //driver.findElement(By.cssSelector(".login_register")).click();
	        
	        //Click n the login button link by tag and id
	        //driver.findElement(By.cssSelector("input#login")).click();
	        
	        //Click n the login button link by tag and class
	        //driver.findElement(By.cssSelector("input.login_button")).click();
	        
	        //Click n the login button link by tag and name attribute
	        //driver.findElement(By.cssSelector("input[name=login]")).click();



	       //Click n the login button link by tag and class and 'type' attribute
	        //driver.findElement(By.cssSelector("input.login_button[type=Submit]")).click();
	        
	        //Click n the login button link by tag and class and 'value' attribute
	        driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();
	      
	      new Select(driver.findElement(By.className("search_combobox"))).selectByValue("Sydney");
	      
	      new Select(driver.findElement(By.cssSelector("#hotels[name=hotels]"))).selectByValue("Hotel Creek");
	      
	      //new Select(driver.findElement(By.cssSelector("select.search_combobox[name=hotels]"))).selectByValue("Hotel Creek");
	      
	      new Select(driver.findElement(By.cssSelector("select[name=room_type]"))).selectByValue("Double");
	      
	      driver.findElement(By.id("Submit")).click();
	      
	      driver.findElement(By.id("radiobutton_0")).click();
	        
	        //Click on any hyperlink above
	        driver.findElement(By.linkText("Booked Itinerary")).click();
	        
	        driver.findElement(By.linkText("Search Hotel")).click();
	      
	}

      
      
		

}
