package Funcionalidad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registrar {

	 public static void RegistrarPage(WebDriver driver, String User, String Pass, String ConfirmPass) {	    
		 username(driver,User);
		 password(driver,Pass);
		 passwordConfirm(driver,ConfirmPass);
		 ClickSubmit(driver);
	 }
	 
	 public static void username(WebDriver driver, String User) {
	     driver.findElement(By.id("username")).sendKeys(User);    
	 }
	 public static void password(WebDriver driver, String Pass) {
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);        
	     driver.findElement(By.id("password")).sendKeys(Pass);    
	 }
	 public static void passwordConfirm(WebDriver driver,String ConfirmPass) {
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);        
	     driver.findElement(By.id("passwordConfirm")).sendKeys(ConfirmPass);    
	 }
	 public static void ClickSubmit(WebDriver driver) {
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);        
	     driver.findElement(By.xpath("//*[@id=\"userForm\"]/button")).click();    
	 }
}
