package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_8 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://myaccount.greenmountain.com/en_US/register");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"frmRegister\"]/div[10]/div[2]/a")).click();
		
		Thread.sleep(5000);
		//close current window
		
		driver.close();
		
		

	}

}
