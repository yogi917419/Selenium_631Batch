package testScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_12_2 {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	
	String abc = driver.findElement(By.xpath("//span[text()='Required']")).getText();
	System.out.println(abc);
	
	driver.navigate().refresh();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click();
	
	if (driver.findElement(By.xpath("//h6[text()='PIM']")).isDisplayed()) {
		System.out.println("PIM is displayed");
	} else {
		System.out.println("PIM is not displayed");
	}
	
}
}