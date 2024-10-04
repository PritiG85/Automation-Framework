package TestNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToUnderstantDataProvider {
  @Test(dataProvider = "actitimeData")
  public void loginMethid(String usn,String pwd) throws InterruptedException {
	 WebDriver driver= new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("http://desktop-t1ogao3/login.do");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
  }
  
  @DataProvider(name = "actitimeData")
  public Object[][] testData(){
	  Object[][] data=new Object[5][2];
	  data[0][0]="a d m i n";
	  data[0][1]="m a n a g e r";
	  
	  data[1][0]="admin";
	  data[1][1]="admin";
	  
	  data[2][0]="admin_123";
	  data[2][1]="manager_123";
	  
	  data[3][0]="manager";
	  data[3][1]="manager";
	  
	  data[4][0]="admmin";
	  data[4][1]="manager@123";
	return data;
	  
  }
	  
  
}
