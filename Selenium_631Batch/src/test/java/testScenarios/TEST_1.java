package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST_1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Owner/Downloads/QE%20-%20index%20(1).html");
		Thread.sleep(3000);
		
		if (driver.findElement(By.id("inputEmail")).isDisplayed()) {
			System.out.println("The given element is displayed");
		} else {
			System.out.println("The given element is not displayed");

		}
		if (driver.findElement(By.id("inputPassword")).isDisplayed()) {
			System.out.println("The given element is displayed");
		} else {
			System.out.println("The given element is not displayed");

		}
		if (driver.findElement(By.xpath("//*[@id=\"test-1-div\"]/form/button")).isDisplayed()) {
			System.out.println("The given element is displayed");
		} else {
			System.out.println("The given element is not displayed");

		}
		driver.findElement(By.id("inputEmail")).sendKeys("sreenivas631batch@yopmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputPassword")).sendKeys("123456");
		Thread.sleep(2000);
		
		System.out.println("Test-1 pass");
		
		
		}
	}


