package testScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_13 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://phptravels.com/demo/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Find Last Name locator,
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("rayudu");
		
		// using this following xpath syntax type "Business Name" value
		
		driver.findElement(By.xpath("//input[@name='last_name']//following::input[@name='business_name']")).sendKeys("chowdary");
		
		//using this preceding xpath syntax type "First Name" value
		
		driver.findElement(By.xpath("//input[@name='last_name']//preceding::input[@name='first_name']")).sendKeys("yogi");
	}

}
