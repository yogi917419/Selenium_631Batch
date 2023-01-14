package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST_5 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Owner/Downloads/QE%20-%20index%20(1).html");
		Thread.sleep(10000);
		
		
		//In the test 5 div, wait for a button to be displayed (note: the delay is random) and then click it
		
		if (driver.findElement(By.id("test5-button")).isDisplayed()) 
		{
			System.out.println("locator has displayed in current page,test case pass");
			driver.findElement(By.id("test5-button")).click();
		} else {

			System.out.println("locator has not displayed in current page,test case fail");
		}
		//Once you've clicked the button, assert that a success message is displayed
		
		if (driver.findElement(By.id("test5-alert")).isDisplayed())
		{
			System.out.println("alert has displayed in current page,test case pass");
			
		} else {
			System.out.println("alert has not displayed in current page,test case fail");
			
		}
		
		//Assert that the button is now disabled
		
		if (driver.findElement(By.id("test5-button")).isEnabled()) 
		{
			System.out.println("given locator is enabled state ,test case fail");
			
		} else {

			System.out.println("given locator is disabled state ,test case pass");
		}

	}

}
