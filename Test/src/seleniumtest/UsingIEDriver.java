package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UsingIEDriver { public static void main( String... args) { 
	
System.setProperty("webdriver.ie.driver", "C:\\Users\\swap402\\workspace\\IEDriverServer.exe"); 
WebDriver driver = new InternetExplorerDriver();
driver.get("http://www.google.com"); } }