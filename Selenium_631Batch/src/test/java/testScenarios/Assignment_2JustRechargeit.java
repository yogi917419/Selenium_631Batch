package testScenarios;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_2JustRechargeit {
	  
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		
		//wait statement
		Thread.sleep(5000);
		
		driver.findElement(By.id("txtUserName")).sendKeys("yogeswarisrinu@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("Yogi@143");
		
		Scanner S = new Scanner(System.in);
		System.out.println("enter captcha");
		String captcha = S.next();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("txtCaptcha")).sendKeys(captcha);
		driver.findElement(By.name("imgbtnSignin")).click();
		
		
		
		

	}

}
