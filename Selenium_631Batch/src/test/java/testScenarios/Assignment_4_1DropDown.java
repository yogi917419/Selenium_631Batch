package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_1DropDown {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		new Select(driver.findElement(By.name("speed"))).selectByVisibleText("Fast");
		new Select(driver.findElement(By.name("files"))).selectByVisibleText("PDF file");
		new Select(driver.findElement(By.id("number"))).selectByVisibleText("4");
		new Select(driver.findElement(By.id("products"))).selectByVisibleText("Iphone");
		new Select(driver.findElement(By.id("animals"))).selectByVisibleText("Baby Cat");
	}

}
