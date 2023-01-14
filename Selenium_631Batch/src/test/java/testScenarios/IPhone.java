package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IPhone {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opencart-prf.exense.ch/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("search")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		Thread.sleep(2000);
		
		////*[@id="content"]/div[3]/div/div/div[2]/div[2]/button[1]/span
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cart-total")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"button-account\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("sem");
		driver.findElement(By.name("lastname")).sendKeys("asdg");
		driver.findElement(By.id("input-payment-email")).sendKeys("sem123@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9876543210");
		driver.findElement(By.name("company")).sendKeys("sem LLC");
		driver.findElement(By.name("address_1")).sendKeys("21355 SDEFCSD ST.");
		driver.findElement(By.name("address_2")).sendKeys("apt2");
		driver.findElement(By.name("city")).sendKeys("SOIASCA");
		driver.findElement(By.name("postcode")).sendKeys("2346775");
		new Select(driver.findElement(By.name("country_id"))).selectByVisibleText("United States");
		Thread.sleep(2000);
		new Select(driver.findElement(By.name("zone_id"))).selectByVisibleText("Alabama");
		driver.findElement(By.name("agree")).click();
		//driver.findElement(By.id("button-guest")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("comment")).sendKeys("Thank You");
		Thread.sleep(5000);
		
		driver.findElement(By.id("button-shipping-method")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/p[3]/textarea")).click();
		driver.findElement(By.id("button-payment-method")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.id("button-confirm")).click();
		
		////*[@id="collapse-payment-method"]/div/p[3]/textarea
	}

}
