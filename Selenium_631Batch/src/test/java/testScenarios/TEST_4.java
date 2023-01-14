package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST_4 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Owner/Downloads/QE%20-%20index%20(1).html");
		Thread.sleep(3000);
		
		//In the test 4 div, assert that the first button is enabled and that the second button is disabled
			
		 if(driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]")).isEnabled())
		{
			System.out.println("given locator is enable state");
		 } else {
			System.out.println("given locator is disable state");
		}
		 
		 if(driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[2]")).isDisplayed())
			{
				System.out.println("given locator is disable state");
			 } else {
				System.out.println("given locator is enable state");
			} 
}
}
