package saniya;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyntraTest {
	

	@Test
    public void loginToMytra() throws InterruptedException {
    	
        
	    WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
        driver.get("https://www.myntra.com");
        Thread.sleep(2000);
        List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
        Actions actions=new Actions(driver);
        
        System.out.println("Main Categories:");
        
       
        	   

            
            try {
                List<WebElement> subCategories = driver.findElements(By.xpath("//div[@class='desktop-paneContent']/div/ul/li/a"));
                for (WebElement subCat : subCategories) {
                    System.out.println("   " + subCat.getText());
                }
            } catch (Exception e) {
                System.out.println("   [!] No submenu found for: " );
            }

            System.out.println("----------------------------------------------------");
        }

        //driver.quit();
    
}

