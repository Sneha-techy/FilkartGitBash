package BaseUtility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	/*Create Object*/
	
	public WebDriver driver;
	public static WebDriver sdriver ;
	
	
	
	@BeforeSuite(alwaysRun = true)
	 public void configBS() throws SQLException  {
		System.out.println("=====Connec to DB,Report Config=====");
		
		
}
	@Parameters("BROWSER")  //Multiple key parameter we can receive
	@BeforeClass(alwaysRun = true)
	public void configBC(@Optional("chrome") String browser) throws Throwable 
 {
		System.out.println("=====Launch the browser=====");
		
		String BROWSER = browser;
				//fLib.getDataFromPropertiesFile("browser");
		if (BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		                              }
		else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		sdriver=driver;
		
	}
	@BeforeMethod(alwaysRun = true)
	 public void configBM() throws Throwable  {
		System.out.println("=====login=====");
		

}
	@AfterMethod(alwaysRun = true)
	 public void configAM() throws Throwable  {
		System.out.println("=====logout=====");
		

		
	}
	@AfterClass(alwaysRun = true)
	 public void configAC() throws Throwable  {
		System.out.println("=====Close the Browser=====");
		
	}
		
	@AfterSuite(alwaysRun = true)
	 public void configAS() throws Throwable  {
		System.out.println("=====Close DB,Report backup=====");
		
	}	
}
