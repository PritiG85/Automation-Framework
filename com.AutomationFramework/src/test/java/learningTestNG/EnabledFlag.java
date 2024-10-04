package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
	 @Test(enabled=true)
	  public void login() {
		  Reporter.log("for login", true);
	  }
	  @Test(enabled=false)
	  public void addToCast() {
		  Reporter.log("for addToCrt", true);
		  
	  }
	  @Test(enabled=true)
	  public void logout() {
		  Reporter.log("for logout", true);
	  }
}
