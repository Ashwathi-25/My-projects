package Selenium;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\eclipse\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("windowButton")).click();
		//driver.findElement(By.id("messageWindowButton")).click();
		
		WebElement windowBtn = driver.findElement(By.id("messageWindowButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",windowBtn);
		
		String win = driver.getWindowHandle();
		//System.out.println(win);
		
		Set<String> main = driver.getWindowHandles();
		//System.out.println(main);
		
		Iterator <String> itr = main.iterator();
		
		while(itr.hasNext()) 
		{
			String child = itr.next();
			if(!win.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("The text is :" + text.getText());
				
			}
			
		}
		
	}

}
