package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1FB_Login {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("email")).sendKeys("yogeswarirayudu@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("savitri");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[aria-label ='your profile']")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).click();
		
		
		
		
		
   
	}

}
