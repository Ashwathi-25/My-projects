package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty( "webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("rose");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		
		exe.executeScript("window.scrollBy(0,1000)");
		
		//List<WebElement> search = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']"));
		
		//List<WebElement> search = driver.findElements(By.cssSelector("h2[class='a-size-mini a-spacing-none a-color-base s-line-clamp-4'] span"));
		
		List<WebElement> search = driver.findElements(By.cssSelector("h2.a-size-mini.a-spacing-none.a-color-base.s-line-clamp-4 span"));
		//List<WebElement> search = driver.findElements(By.className("a-size-mini").className("a-spacing-none").className("a-color-base").className("s-line-clamp-4"));
		System.out.println(search.size());
		
		for(int i = 0 ; i<search.size(); i++) {
			
			System.out.println(search.get(i).getText());
			
		}
		
		driver.quit();
	}

}
