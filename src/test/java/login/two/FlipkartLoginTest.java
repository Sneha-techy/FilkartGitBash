package login.two;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class FlipkartLoginTest {
		
	    WebDriver driver;

	    @Parameters("browser")
	    @Test
	    public void loginToFlipkart(String browser) throws InterruptedException {
	    	
	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	        } else if (browser.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        }
	       
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	        driver.get("https://www.flipkart.com");
	        Thread.sleep(2000);
	        
	        
	        // Flipkart login popup appears on load
	        System.out.println("Title: " + driver.getTitle());

	        driver.quit();
	    }
	}


