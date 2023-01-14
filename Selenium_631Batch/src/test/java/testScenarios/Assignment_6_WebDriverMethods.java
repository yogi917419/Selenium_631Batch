package testScenarios;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_6_WebDriverMethods {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.justrechargeit.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("jriTop_signin9")).click();
		
		driver.findElement(By.name("txtUserName")).sendKeys("h20testingtools@gmail.com");
		
		driver.findElement(By.name("txtPasswd")).sendKeys("savitri");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter captcha");
		String captcha =s.next();
		Thread.sleep(5000);
		
		//refresh 
		
		driver.navigate().refresh();
		Thread.sleep(4000);		
		// back
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		//forward
		
		driver.navigate().forward();
		Thread.sleep(4000);
		
		//quit
		
		driver.quit();
		
		
		

	}

}
