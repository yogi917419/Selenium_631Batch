package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_2 {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup");
		Thread.sleep(5000);
		
		// choose dropdown
		
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		

	}

}
