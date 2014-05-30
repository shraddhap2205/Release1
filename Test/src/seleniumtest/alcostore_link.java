package seleniumtest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alcostore_link 
{

	 ArrayList<String> arr1 = new ArrayList<String>();
	 ArrayList<String> arr2 = new ArrayList<String>();
	@Test
		public void checkalllinks()
	{	
		arr1.add("Home Appliances - For the Home");
		arr1.add("Kitchen & Dining - For the Home");
		arr1.add("Furniture - For the Home");
		arr1.add("Bath - For the Home");
		arr1.add("Bedding - For the Home");
		arr1.add("Rugs - For the Home");
		arr1.add("Home Decor - For the Home");
		arr1.add("Home Improvement & Tools - For the Home");
		arr1.add("Storage & Organization - For the Home");
		arr1.add("Outdoor Living - For the Home");
		arr1.add("Outdoor Shelter & Shade - For the Home");
		arr1.add("Garden Center - For the Home");
		try
		{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.alcostores.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try
			{
				WebElement one=	driver.findElement(By.xpath("//*[@id='nav']/li[1]/a/span"));
				Actions builder =new Actions(driver);
				builder.moveToElement(one).perform();
				WebElement ul1=driver.findElement(By.xpath("//*[@id='nav']/li[1]/div/ul[1]"));
				List<WebElement> linkoful1=ul1.findElements(By.tagName("a"));
				int nooflinks1=linkoful1.size();
					for(int i=0;i<nooflinks1;i++)
					{	
						linkoful1.get(i).click();
						String x=driver.getTitle();
						System.out.println(x);
						arr2.add(x);
						driver.navigate().back();
						driver.navigate().to("http://www.alcostores.com/");
						one=	driver.findElement(By.xpath("//*[@id='nav']/li[1]/a/span"));
						builder =new Actions(driver);
						builder.moveToElement(one).perform();
						ul1=driver.findElement(By.xpath("//*[@id='nav']/li[1]/div/ul[1]"));
						linkoful1=ul1.findElements(By.tagName("a"));
						                                                                                                                                                                                                                                                                                               
						
					}
					
				
					one=driver.findElement(By.xpath("//*[@id='nav']/li[1]/a/span"));
					 builder =new Actions(driver);
					builder.moveToElement(one).perform();
					 ul1=driver.findElement(By.xpath("//*[@id='nav']/li[1]/div/ul[2]"));
					 linkoful1=ul1.findElements(By.tagName("a"));
					 nooflinks1=linkoful1.size();
						for(int i=0;i<nooflinks1;i++)
						{
							linkoful1.get(i).click();
							String x=driver.getTitle();
							System.out.println(x);
							arr2.add(x);
							driver.navigate().back();
							driver.navigate().to("http://www.alcostores.com/");
							one=	driver.findElement(By.xpath("//*[@id='nav']/li[1]/a/span"));
							builder =new Actions(driver);
							builder.moveToElement(one).perform();
							ul1=driver.findElement(By.xpath("//*[@id='nav']/li[1]/div/ul[2]"));
							linkoful1=ul1.findElements(By.tagName("a"));
							                                                                                                                                                                                                                                                                                               
							
						}
						
						System.out.println(arr1+"  "+arr2+arr1.contains(arr2));
						for(String st1:arr2){
							
							Assert.assertTrue(arr1.contains(st1));
							
						}
						
						
						
						
				
			}catch(Exception e){
				
			e.printStackTrace();
			
				
			}
		}catch(Exception e){
			
			System.out.println("Unable to open alcostore"+e.getMessage());
			
		}
	}	
}
