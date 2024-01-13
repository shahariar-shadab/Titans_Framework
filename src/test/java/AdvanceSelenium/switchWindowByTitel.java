package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchWindowByTitel {
	
	public static void main (String []args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement clickHereButton = driver.findElement(By.xpath("//*[contains(text(),'Click Here')]"));
		
		clickHereButton.click();
		
		windowByTitel(driver,"New Window");
		
	}
	// amazon.com amazon prime
	public static void windowByTitel(WebDriver driver, String titel) {
		
		String currentWindow = driver.getWindowHandle();
		
		for (String winName: driver.getWindowHandles()) {    //return set of window name 

			// Window Name
			//1. 34985799698658
			//2.894389386698698
			//3.964348689789768
			
			// Title name:
			//1.amazon.com spend less , smile more
			//2.amazon.com best seller item 
			// 3.amazon.com amazon basic 
			//4.amazon.com  amazon sing
			
			if(!driver.switchTo().window(winName).getTitle().equals(titel)){
				
				driver.switchTo().window(currentWindow);
				System.out.println("Sorry can't find your Window");
			}
			
		}
		
		
	}

}
