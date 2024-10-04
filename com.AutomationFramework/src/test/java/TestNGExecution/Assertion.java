package TestNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  public void login() {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
		String expectedLoginPageTitle = "actiTIME -  Login ";
		
		// For Critical Test Case
		Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Login Page is not displayed");
		
		WebElement usn = driver.findElement(By.name("username"));
		Assert.assertEquals(usn.isDisplayed(), true, "Username Textbox is not displayed");
		usn.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		Assert.assertEquals(pwd.isDisplayed(), true, "Password Textbox is not displayed");
		pwd.sendKeys("manager");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		Assert.assertEquals(loginButton.isDisplayed(), true, "Login Button is not displayed");
		loginButton.click();

		
}
}
