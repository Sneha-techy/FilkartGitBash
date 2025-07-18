package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseUtility.BaseClass;

public class GmailLogin extends BaseClass {
	@Test
	public void loginGmail() {
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://mail.google.com/");
driver.findElement(By.id("identifierId")).sendKeys("snehajnj2024@gmail.com");
driver.findElement(By.xpath("//span[text()='Next']")).click();
}
}
