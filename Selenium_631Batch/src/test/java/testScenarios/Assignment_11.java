package testScenarios;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_11 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		Thread.sleep(3000);
		
		driver.findElement(By.name("txtUserName")).sendKeys("sreenivas631batch@yopmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("123456");
		Scanner S = new Scanner(System.in);
		System.out.println("enter captcha");
		String captcha = S.next();
		driver.findElement(By.name("txtCaptcha")).sendKeys(captcha);
		Thread.sleep(4000);
		
		driver.findElement(By.name("imgbtnSignin")).click();
		Thread.sleep(4000);
		
		//DELETE ANY ROW
		driver.findElement(By.xpath("//*[@id=\"listingtable_btnGridDelete_2\"]")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
