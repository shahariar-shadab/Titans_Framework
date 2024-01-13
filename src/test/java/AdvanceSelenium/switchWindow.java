package AdvanceSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchWindow {
	
	
	public static void main (String[]args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement clickHereButton = driver.findElement(By.xpath("//*[contains(text(),'Click Here')]"));
		
		clickHereButton.click();
		
		String mainWindow = driver.getWindowHandle();
		
		System.out.println("MainWindow"+ mainWindow);
		
		Set<String> allWindow = driver.getWindowHandles();
		
		Iterator<String> i = allWindow.iterator();
		
		while(i.hasNext()) {
			String childWindow = i.next();
			
			System.out.println(childWindow);
			
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
			}
		}
		
	}

}
