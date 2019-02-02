package MainPackage;


import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import Objectclasses.LoginClass;
import Objectclasses.LogoutClass;
import Objectclasses.OrderProcess;





public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException, BiffException {

//From Initializing Excel Sheet		
		

//		FileInputStream fs = new FileInputStream("D:\\Selenium Course\\Third Session\\Third Session\\Test.xls");
//		Workbook wb = Workbook.getWorkbook(fs);
//		Sheet AddressSheet = wb.getSheet("User_Login");
//		
//End Excel
		
		
		
	

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Course\\Java 7 Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	
//Getting usernanme and password from excel sheet
		
//		LoginClass log1 = new LoginClass(driver);
//		log1.Login(AddressSheet.getCell(0, 1).getContents(), AddressSheet.getCell(1, 1).getContents());
		
//End getting username password
	
		//For Loop login and logout
	
		for(int x=0; x<3; x++) {
			
		LoginClass loginobjects = new LoginClass (driver);
		loginobjects.Login("mytc5@gmail.com","123456789");
		
		LogoutClass logout = new LogoutClass (driver);
		logout.logout();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		}
		
		
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//		LoginClass loginobjects1 = new LoginClass (driver);
//		loginobjects1.Login("salloo24@yahoo.com","@@sam@@");
//		Thread.sleep(2000);
		
//		OrderProcess processorder = new OrderProcess (driver);
//		processorder.processorder();
//	
		Thread.sleep(2000);
		
//		LogoutClass logout1 = new LogoutClass (driver);
//		logout1.logout();
//	
		driver.close();
		driver.quit();
		
	}

}
