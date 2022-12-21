package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\eclipse\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/menu/");
		
	    JavascriptExecutor executorjs = (JavascriptExecutor) driver;
	    executorjs.executeScript("window.scrollBy(0,150)");
		
		Actions obj = new Actions(driver);
		
		WebElement m1 = driver.findElement(By.linkText("Main Item 1"));
		obj.moveToElement(m1).build().perform();
		
		WebElement m2 = driver.findElement(By.linkText("Main Item 2"));
		obj.moveToElement(m2).build().perform();
		
		WebElement s1 = driver.findElement(By.linkText("Sub Item"));
		obj.moveToElement(s1).build().perform();
		System.out.println(s1.getText());
		
		WebElement s2 = driver.findElement(By.xpath("//ul[@id= 'nav']/child::li[2]/ul/li[2]/a"));
		obj.moveToElement(s2).build().perform();
		System.out.println(s2.getText());
		
		
		WebElement ss1 = driver.findElement(By.xpath("//ul[@id= 'nav']/child::li[2]/ul/li[3]/a"));
		obj.moveToElement(ss1).build().perform();
		System.out.println(ss1.getText());
		
		WebElement ssi1 = driver.findElement(By.linkText("Sub Sub Item 1"));
		obj.moveToElement(ssi1).build().perform();
		System.out.println(ssi1.getText());
		
		WebElement ssi2 = driver.findElement(By.linkText("Sub Sub Item 2"));
		obj.moveToElement(ssi2).build().perform();
		System.out.println(ssi2.getText());
		
	}

}
