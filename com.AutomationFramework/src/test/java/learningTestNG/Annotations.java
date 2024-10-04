package learningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void test1() {
	  Reporter.log("this method is for @test 1", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("this method BeforMethod", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("this method AfterrMethod", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("this method Beforclass", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("this method afterClass", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("this method BeforTest", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("this method afterTest", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("this method BeforSuite", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("this method afterSuite", true);
  }
  @Test
  public void test2() {
	  Reporter.log("this method is for @test 2", true);
  }

}
