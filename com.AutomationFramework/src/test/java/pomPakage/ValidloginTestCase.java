package pomPakage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidloginTestCase  extends BaseTestCase{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		  BaseTestCase tb = new BaseTestCase();
		  tb.setUp();
		  
		 Flib flib = new Flib();
		LoginPage lb = new LoginPage(driver);
		 lb.validLoginMethod(flib.readDataFromProperty(PROP_PATH,"username"),flib.readDataFromProperty(PROP_PATH,"password"));
		 
		 
		 
			HomePage hp= new HomePage(driver);
			hp.getUsers().click();
		 hp.getLogout().click();
	}

}
