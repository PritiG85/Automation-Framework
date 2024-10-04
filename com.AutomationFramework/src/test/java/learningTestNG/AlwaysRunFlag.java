package learningTestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag {
	@Test
	  public void login() {
		Assert.fail();
		  Reporter.log("this is login method", false);
		  
	  }
	  
	  @Test(dependsOnMethods = "login")
	  public void addToCart() {
		  Reporter.log("this is to add to cart method", true);
		  
	  }
	  
	  
	  @Test(dependsOnMethods ="addToCart",alwaysRun = true)
	  public void logout() {
		  Reporter.log("this is logout method", true);
		  
	  }
}
