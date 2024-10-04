import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("http://desktop-t1ogao3/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(3);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3);
		driver.findElement(By.id("loginButton")).click();
		
		WebElement dropD = driver.findElement(By.xpath("//select[@name='usersSelector.selectedUser']"));
		
		Select sel = new Select(dropD);
		sel.selectByValue("2");
		Thread.sleep(2);
		
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("kshitj bagade");
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("MIT-ADT University");
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		
		
		

	}

}
