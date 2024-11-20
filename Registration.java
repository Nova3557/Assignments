package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	void regHW() throws InterruptedException 
	{
	
	driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
	WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Sheila");
	WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("Novales");
	WebElement email = driver.findElement(By.id("input-email"));	
		email.sendKeys("sheila123@yopmail.com");
	WebElement telephone = driver.findElement(By.id("input-telephone"));
		telephone.sendKeys("+12190001234");
	WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("HighFive05");
	WebElement confirm = driver.findElement(By.id("input-confirm"));
		confirm.sendKeys("HighFive05");
	WebElement label = driver.findElement(By.cssSelector("label[for='input-agree']"));
		label.click();
		
	Thread.sleep(2000);
	WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']"));
		continueButton.click();
	
	}
}

