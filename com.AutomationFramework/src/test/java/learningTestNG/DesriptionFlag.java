package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DesriptionFlag {
  @Test(description="this method for login",priority=1)
  public void login() {
	  Reporter.log("for login", true);
  }
  @Test(description="this method for addTocart",priority=2)
  public void addToCast() {
	  Reporter.log("for addToCrt", true);
	  
  }
  @Test(description="this method for logot",priority=3)
  public void logout() {
	  Reporter.log("for logout", true);
  }
}
