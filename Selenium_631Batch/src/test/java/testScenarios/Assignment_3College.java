package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_3College {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup/");
		//wait statement
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Yogeswari");
		driver.findElement(By.name("lastName")).sendKeys("Rayudu");
		driver.findElement(By.id("emailAddress")).sendKeys("yogeswarirayudu@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("612-607-4126");
		driver.findElement(By.id("password")).sendKeys("Yogi@143");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Yogi@143");
		
		//drop down
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("UNITED STATES");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		
		Thread.sleep(3000);
		
		new Select(driver.findElement(By.id("questions[q_134]"))).selectByVisibleText("Spring 2023");
		new Select(driver.findElement(By.id("questions_16_Month"))).selectByVisibleText("February");
		new Select(driver.findElement(By.id("questions_16_DayOfMonth"))).selectByVisibleText("1");
		new Select(driver.findElement(By.id("questions_16_DOBYear"))).selectByVisibleText("2000");
		
		Thread.sleep(3000);
		
		// to open a major of interest
		driver.findElement(By.className("multiselect")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"questions[q_19]\"]/div[2]/div[9]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"questions[q_19]\"]/div[2]/div[1]/label")).click();
		
		Thread.sleep(3000);
		// to close a major of interest
		
		driver.findElement(By.className("multiselect")).click();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		
		
		
		//driver.findElement(By.id("submit")).click();
		
	}

}
