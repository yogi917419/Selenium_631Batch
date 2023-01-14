package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(3000);
		
		// click on continue to login
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(3000);
		
		// click on login in button without fill any data
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(3000);
		
		//alert handling
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//click on register link without fill any data
		driver.findElement(By.partialLinkText("Register ")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		
		

	}

}
