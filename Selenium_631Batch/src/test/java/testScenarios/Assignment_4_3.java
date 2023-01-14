package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_3 {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		
		 Thread.sleep(5000);
		 
		 //to open a country
		 
		 new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
		 new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Goa");
		

	}

	}


