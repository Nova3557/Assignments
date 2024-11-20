package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginHW {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	void loginHW() throws InterruptedException 
	
	{
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("sheila123@yopmail.com");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("HighFive05");
		
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
		loginButton.click();
}
}


