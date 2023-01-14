package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_9 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://collegeweeklive.com/go-signup/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		
		String errormsg = driver.findElement(By.xpath("//*[@id=\"firstNameError\"]/span")).getText();
		System.out.println(errormsg);
		
		String invalid = driver.findElement(By.xpath("//*[@id=\"lastNameError\"]/span")).getText();
		System.out.println(invalid);
		
		String email = driver.findElement(By.xpath("//*[@id=\"emailAddressError\"]/span")).getText();
		System.out.println(email);
		
		String mobile = driver.findElement(By.xpath("//*[@id=\"phoneNumberError\"]/span")).getText();
		System.out.println(mobile);
		
		String pwd = driver.findElement(By.xpath("//*[@id=\"passwordError\"]/span")).getText();
		System.out.println(pwd);
		
		String confirmpass = driver.findElement(By.xpath("//*[@id=\"ConfirmPasswordError\"]/span")).getText();
		System.out.println(confirmpass);
		
		String country = driver.findElement(By.xpath("//*[@id=\"nationalityError\"]/span")).getText();
		System.out.println(country);
		
		String student = driver.findElement(By.xpath("//*[@id=\"attendeeTypeError\"]/span")).getText();
		System.out.println(student);
		
		
		String terms = driver.findElement(By.xpath("//*[@id=\"questions_137Error\"]/span")).getText();
		System.out.println(terms);
		
		
		
		
	}

}
