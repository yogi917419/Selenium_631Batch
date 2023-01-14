package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_5_Xpath {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		
		Thread.sleep(3000);
		
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Paris");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London"); 
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[5]/td[1]/input")).click();
		
		Thread.sleep(2000);
	
		driver.findElement(By.name("inputName")).sendKeys("Yogi Rayudu");
		driver.findElement(By.name("address")).sendKeys("66 curv");
		driver.findElement(By.name("city")).sendKeys("Shakopee");
		driver.findElement(By.name("state")).sendKeys("Minnesota");
		driver.findElement(By.name("zipCode")).sendKeys("55369");
		
		new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("Visa");
		
		//driver.findElement(By.name("cardType")).click();
		
		
		driver.findElement(By.name("creditCardNumber")).sendKeys("0123456768859476");
		driver.findElement(By.name("creditCardMonth")).sendKeys("11");
		driver.findElement(By.name("creditCardYear")).sendKeys("2023");
		driver.findElement(By.name("nameOnCard")).sendKeys("yogi");
		
		driver.findElement(By.name("rememberMe")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
		
		}

}
