package Funcionalidad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {


	 public static void LoginPage(WebDriver driver ,String User, String Pass) {	    
		 
		 username(driver,User);
		 password(driver,Pass);
		 ClickLogIn(driver);
	 }

	 public static void username(WebDriver driver,String User) {
		 driver.findElement(By.xpath("/html/body/div/form/div/input[1]")).sendKeys(User);   
	 }
	 public static void password(WebDriver driver, String Pass) {
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);        
		 driver.findElement(By.xpath("/html/body/div/form/div/input[2]")).sendKeys(Pass);    
	 }
	 public static void ClickLogIn(WebDriver driver) {
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);        
		 driver.findElement(By.xpath("/html/body/div/form/div/button")).click();   
	 }
}