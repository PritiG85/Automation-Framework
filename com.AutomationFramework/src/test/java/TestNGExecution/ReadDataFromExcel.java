package TestNGExecution;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	
	public String [][] invalidcreds() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidcreds");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
		String[][] arr= new String[rowCount][cellCount];	
		for(int i=1,k=0;i<=rowCount;i++)
		{
			for(int j=0;j>cellCount;j++)
			{
				arr[k][j]=sheet.getRow(j).getCell(j).getStringCellValue().toString();
			}
			
		}
		return arr;
	}
	
  @Test(dataProvider = "invalidcreds")
  public void invalidLogin(String [] arr) throws InterruptedException {
	  WebDriver driver= new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("http://desktop-t1ogao3/login.do");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(arr[0]);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(arr[1]);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
  }
}
