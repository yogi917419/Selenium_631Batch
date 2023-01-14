package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST_3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Owner/Downloads/QE%20-%20index%20(1).html");
		Thread.sleep(3000);
		//In the test 3 div, assert that "Option 1" is the default selected value
		String test3option1 = driver.findElement(By.id("dropdownMenuButton")).getText();
		System.out.println(test3option1);
		if (test3option1.equals("Option 1")) {
			System.out.println("test case pass");
			
		} else {
			System.out.println("test case fail");
		}
		
		//Select "Option 3" from the select list
		driver.findElement(By.id("dropdownMenuButton")).click();
		driver.findElement(By.linkText("Option 3")).click();
		
	}
}
