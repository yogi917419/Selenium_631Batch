package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseVsQuit {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("windowButton")).click();
		
		Thread.sleep(5000);
		// close(); close the current window , but the background chrome will not close from task manager
		//driver.close();
		
		//quit(): close the current window as well as related windows
		
		driver.quit();
		
		
		
		
		
		
	}

}
