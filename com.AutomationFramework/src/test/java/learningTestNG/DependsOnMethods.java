package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	  public void login() {
		  Reporter.log("this is login method", false);
		  
	  }
	  
	  @Test(dependsOnMethods = "login")
	  public void addToCart() {
		  Reporter.log("this is to add to cart method", true);
		  
	  }
	  
	  
	  @Test(dependsOnMethods ="addToCart" )
	  public void logout() {
		  Reporter.log("this is logout method", true);
		  
	  }
}
