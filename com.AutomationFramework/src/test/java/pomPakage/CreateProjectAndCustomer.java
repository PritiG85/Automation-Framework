package pomPakage;

import java.io.IOException;

public class CreateProjectAndCustomer extends BaseTestCase {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTestCase bt = new BaseTestCase();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		String usn = lp.readDataFromProperty(PROP_PATH, "username");
		String pwd = lp.readDataFromProperty(PROP_PATH, "password");
		lp.validLoginMethod(usn, pwd);

		HomePage hp = new HomePage(driver);
		hp.getTaskTab().click();
		TaskPage tp = new TaskPage(driver);
		tp.createCutomer(flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 0));
		tp.creadProject(flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 0),flib.readExcelData(EXCEL_PATH, "taskpagedetails", 1, 1));

		Thread.sleep(2000);
		tp.deleteProjectAndCutomer();
		

	}

}