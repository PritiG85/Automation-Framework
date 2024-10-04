package TestNGListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;

@Listeners(CustomListener.class)
public class ValidLogin extends BaseTestCase {
	@Test
	  public void login() throws InterruptedException 
	  {
			
			Thread.sleep(2000);
			WebElement usn = driver.findElement(By.name("username"));
			Assert.assertEquals(usn.isDisplayed(), false, "Username Textbox is displayed");
			usn.sendKeys("admin");
			Thread.sleep(1000);
			
			WebElement pwd = driver.findElement(By.name("pwd"));
			Assert.assertEquals(pwd.isDisplayed(), false, "Password Textbox is displayed");
			pwd.sendKeys("manager");
			Thread.sleep(1000);
			
			WebElement loginButton = driver.findElement(By.id("loginButton"));
			Assert.assertEquals(loginButton.isDisplayed(), false, "Login Button Is Displayed");
			loginButton.click();
			
			Thread.sleep(5000);
	  }
}
