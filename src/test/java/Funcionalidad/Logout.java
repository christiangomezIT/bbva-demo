package Funcionalidad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	 public static void ClickLogout(WebDriver driver) {	    
		 Click(driver);
	 }

	 public static void Click(WebDriver driver) {
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);        
		 driver.findElement(By.xpath("/html/body/div/h2/a")).click();    
	 }
}
