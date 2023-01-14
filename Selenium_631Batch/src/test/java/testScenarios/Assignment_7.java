package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_7 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("h20testing@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("savitri");
		
		driver.findElement(By.name("login")).click();
		
		// print error msg in console
		
		String errormessage = driver.findElement(By.className("_9ay7")).getText();
		System.out.println(errormessage);

	}

}
