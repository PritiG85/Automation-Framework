package TestNGExecution;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActitimeSoftAssert {
  @Test
  public void loginMethod() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
		String expectedLoginPageTitle = "actiTIME -  Login ";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Login Page is not displayed");
		
		WebElement usn = driver.findElement(By.name("username"));
		sa.assertEquals(usn.isDisplayed(), true, "Username Textbox is not displayed");
		usn.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		sa.assertEquals(pwd.isDisplayed(), true, "Password textbox is not displayed");
		pwd.sendKeys("manager");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		sa.assertEquals(loginButton.isDisplayed(), true, "Login Button is not displayed");
		loginButton.click();
		
	//	sa.assertAll();
		

	}
}
