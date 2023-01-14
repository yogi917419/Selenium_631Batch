package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_10 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(8000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		String abc= driver.findElement(By.xpath("//*[@id=\"confirmResult\"]")).getText();
		System.out.println(abc);
		

	}

}
