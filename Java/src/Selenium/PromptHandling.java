package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\eclipse\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement click1 = driver.findElement(By.id("promtButton"));
		WebElement click2 = driver.findElement(By.id("confirmButton"));
		
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].click()",click1);
		
		Alert promptalert = driver.switchTo().alert();
		System.out.println(promptalert.getText());
		promptalert.sendKeys("Ashwathi");
		promptalert.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		exe.executeScript("arguments[0].click()",click2);
		System.out.println(promptalert.getText());
		promptalert.accept();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println(promptalert.getText());
		promptalert.accept();
		
		driver.findElement(By.id("alertButton")).click();
		System.out.println(promptalert.getText());
		promptalert.accept();
		
		driver.quit();
		
	}

}
