package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
  @Test(priority=-1)
  public void loginAdmin() {
	  Reporter.log("login as admin", true);
 
  }
  @Test(priority=0)
  public void createCustomer() {
	  Reporter.log("create customer", true);
  }
  @Test(priority=1)
  public void cretaeProjectUnderCustomer() {
	  Reporter.log("create project", true);
  }
  @Test(priority=2)
  public void logoutadmin() {
	  Reporter.log("logot as admin", true);
  }
}
