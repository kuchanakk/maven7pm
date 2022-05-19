package com.maven.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	
	public static void openbrowser(String Browser) {
		
	//	String Browser ="chrome";
		
		if(Browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			driver.get("http://www.advantageonlineshopping.com/");
		}else if(Browser.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
			driver.get("http://www.advantageonlineshopping.com/");
			driver.manage().window().maximize();

		}else if(Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			driver.get("http://www.advantageonlineshopping.com/");
	
		}else {
			
			System.out.println("No such browser avilable");
		}
		
		
	}
	
	
	
	
	
	

}
