package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() throws Exception {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//wait statement
		Thread.sleep(5000);
	
		// type some text to username edit box 
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//click on login button
		driver.findElement(By.tagName("button")).click();
		
		//wait statement
		Thread.sleep(5000);
		
		//click on profile icon 
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		Thread.sleep(5000);
		
		//click on logout link
		driver.findElement(By.linkText("Logout")).click();
		
  }
}
