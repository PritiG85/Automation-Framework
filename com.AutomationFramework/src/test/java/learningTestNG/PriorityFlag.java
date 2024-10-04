package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
  @Test(priority=-1)
  public void login() {
	  Reporter.log("this is login method", false);
	  
  }
  
  @Test(priority=10)
  public void addToCart() {
	  Reporter.log("this is to add to cart method", true);
	  
  }
  
  
  @Test(priority=5)
  public void logout() {
	  Reporter.log("this is logout method", true);
	  
  }
}
