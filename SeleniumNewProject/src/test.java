import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	      String url = "http://amazon.com";
	      driver.get(url);
	      
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("rose");
	      driver.findElement(By.cssSelector("input[value=Go]")).click();		

	}

}
