package KeywordDrivenFramework1;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTestCase{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTestCase  bt= new BaseTestCase();
		bt.setUp();
		
		Flib flib = new Flib();
		String usn = flib.readDataFromProperty(PROP_PATH, "username");
		String pwd = flib.readDataFromProperty(PROP_PATH,"password");
		
		driver.findElement(By.name("username")).sendKeys("usn");
		driver.findElement(By.name("pwd")).sendKeys("pwd");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		bt.tearDown();

	}

}
