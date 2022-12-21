package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\eclipse\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();

	    JavascriptExecutor executorjs = (JavascriptExecutor) driver;
	    executorjs.executeScript("window.scrollBy(0,350)");
	      
		driver.switchTo().frame("frame1");
		
		WebElement f1 = driver.findElement(By.id("sampleHeading"));
		String f1_text = f1.getText();
		System.out.println(f1_text);
		
		driver.switchTo().parentFrame();
		
		String text =driver.findElement(By.xpath("//div[@id ='framesWrapper']/child::div")).getText();
		System.out.println(text);
		
		executorjs.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement fr2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(fr2);
		
		System.out.println(f1_text);
		
		driver.quit();
		
		
		
	}

}
