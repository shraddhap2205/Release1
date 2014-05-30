package seleniumtest;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class GoogleSearchPageByTagName{ public static void main( String[] args) throws IOException{ 
	FirefoxProfile pf=new FirefoxProfile();
	String json="";
	pf.addExtension(new File("C:\\Users\\swap402\\firebug@software.joehewitt.com.xpi"));
	pf.addExtension(new File("C:\\Users\\swap402\\FireXPath@pierre.tholence.com.xpi"));
	json=pf.toJson();
	System.out.println(json);
	WebDriver driver = new FirefoxDriver(FirefoxProfile.fromJson(json)); 
	driver.get("http://www.google.com");
	
	List < WebElement > buttons = driver.findElements( By.tagName("button"));
	System.out.println( buttons.size()); } 

}


