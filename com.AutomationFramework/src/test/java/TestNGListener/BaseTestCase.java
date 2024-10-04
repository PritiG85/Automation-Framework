package TestNGListener;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;



public class BaseTestCase extends Flib implements IAutoConstant {
	
	public static WebDriver driver;
	@BeforeMethod
	public void setUp() throws IOException
	{
	Flib flib = new Flib();
	String browservalue=flib.readDataFromProperty(PROP_PATH, "browser1");
	String url = flib.readDataFromProperty(PROP_PATH, "url");
	
	
	if(browservalue.equalsIgnoreCase("chrome"))
	{
		driver =new ChromeDriver();
	}
	else if(browservalue.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browservalue.equalsIgnoreCase("edge"))
	{
	driver=new EdgeDriver();
	}
	else
	{
		System.out.println("enter valid Browser name !!!");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
	driver.get(url);
	}
	public void failedMethodSS(String failedMethod) {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOT_PATH+failedMethod+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
}
