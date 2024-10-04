package pomPakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("http://desktop-t1ogao3/login.do");
		WebElement usn = driver.findElement(By.name("username"));
		WebElement pwd = driver.findElement(By.name("pwd"));
		WebElement logonbutton = driver.findElement(By.id("loginButton"));

		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(1000);
		usn.sendKeys("admin");

	}

}
