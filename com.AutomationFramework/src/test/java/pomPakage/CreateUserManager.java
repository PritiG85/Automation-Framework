package pomPakage;

import java.io.IOException;

public class CreateUserManager extends BaseTestCase{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTestCase bt=new BaseTestCase();
		bt.setUp();
		
		Flib flib= new Flib();
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readDataFromProperty(PROP_PATH, "username"), flib.readDataFromProperty(PROP_PATH, "password"));
HomePage hp = new HomePage(driver);
		hp.getUsers().click();
		
	UserPage up = new UserPage(driver);
	up.getCreateNewUserButton().click();
	
	WorkLib wl = new WorkLib();
	int no = wl.random();
	
	String usn = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 0);
	String pwd = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 1);
	String fname = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 2);
	String lname = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 3);
	
	up.createNewUserMethod(usn+no, pwd+no ,fname+no, lname+no);
	
	
	}

}
