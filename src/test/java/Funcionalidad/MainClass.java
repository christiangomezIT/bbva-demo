package Funcionalidad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Connection.DBconnection;



public class MainClass {
	
	public static WebDriver driver;
	public static String usuario="";
	public static String password="";
	public static String url="";

	public static void StartBrowser(String url) {
		String chromeDriverLocation="C:\\Users\\ivanbermudez\\Documents\\proyecto 2\\demo-bbva\\src\\test\\java\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeDriverLocation);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
        driver.get(url);
	}
	
	public static void Registrar(String User , String Pass, String ConfirmPass) {  
		ClickRegistrar.ClickRes(driver);
		Registrar.RegistrarPage(driver,User,Pass,ConfirmPass);
		Logout();
	}
	
	public static void Login(String User , String Pass) {		
		Login.LoginPage(driver,User,Pass);
	}
	
	public static void Logout() {
		Logout.ClickLogout(driver);
	}
	public static void MysqlConsul() {
		DBconnection.query(DBconnection.connectDB());
	}
	
}