package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
	@Test(priority=-1)
	  public void login() {
		  Reporter.log("this is login method", true);
		  
	  }
	  
	  @Test(priority=2,invocationCount = 5)
	  public void addToCart() {
		  Reporter.log("this is to add to cart method", true);
		  
	  }
	  
	  
	  @Test(priority=5)
	  public void logout() {
		  Reporter.log("this is logout method", true);
		  
	  }
}
