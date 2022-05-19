package com.maven.pack1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import exceldata.Exceloper;
import objrep.HomePage;
import utils.ScreenShot;

public class PopItemstest extends TestBase{
	
	static HomePage hp ;
	static Exceloper excel;
	static ScreenShot sc;
	@BeforeMethod
	public static void openBrowser() {
		TestBase tb = new TestBase();
		tb.openbrowser("edge");
		
	}
	@AfterMethod
	public static void closebrowser() {
		
		driver.close();
	}
	
	
	
	
	@Test
	public static void tablet() throws InterruptedException, IOException {
		Thread.sleep(10000);
		 hp = new HomePage(driver);
		 excel = new Exceloper();
		hp.popitems().click();
		Thread.sleep(5000);
		hp.tabletdetailslink().click();
		Thread.sleep(5000);

		String actualproducttext=hp.producttext().getText();
		String expectedproducttext=excel.readata(1, 0);
		
		if(actualproducttext.contains(expectedproducttext)) {
			
			System.out.println(" test is pass");
			Assert.assertTrue(true);
			excel.writedata(1, 1, "valid data");
			
		}else {
			

			System.out.println(" test is fail");
			excel.writedata(1, 1, "invalid data");
			 sc = new ScreenShot();
			sc.shot();
			
			
			Assert.assertTrue(false);
			
			
			
		}
	}
	
	
	@Test
	public static void laptop() throws InterruptedException, IOException {
		
		Thread.sleep(10000);
		 hp = new HomePage(driver);
		 excel = new Exceloper();
		hp.popitems().click();
		Thread.sleep(5000);

		hp.laptopdetailslink().click();
		Thread.sleep(5000);

		String actualproducttext=hp.producttext().getText();
		String expectedproducttext=excel.readata(2, 0);
		System.out.println(expectedproducttext);
		if(actualproducttext.contains(expectedproducttext)) {
			
			System.out.println(" test is pass");
			Assert.assertTrue(true);
			excel.writedata(2, 1, "valid data");
			
		}else {
			

			System.out.println(" test is fail");
			excel.writedata(2, 1, "invalid data");
			sc = new ScreenShot();
			sc.shot();
			
			
			Assert.assertTrue(false);
			
		}
		
		
	}
	
	@Test
	public static void spk() throws InterruptedException, IOException {
		
		Thread.sleep(10000);
		 hp = new HomePage(driver);
		 excel = new Exceloper();
		hp.popitems().click();
		Thread.sleep(5000);

		hp.spkdetailslink().click();
		Thread.sleep(5000);

		String actualproducttext=hp.producttext().getText();
		String expectedproducttext=excel.readata(3, 0);
		
		if(actualproducttext.contains(expectedproducttext)) {
			
			System.out.println(" test is pass");
			Assert.assertTrue(true);
			excel.writedata(3, 1, "valid data");
			
		}else {
			

			System.out.println(" test is fail");
			excel.writedata(3, 1, "invalid data");
			sc = new ScreenShot();
			sc.shot();
			
			
			Assert.assertTrue(false);
			
		}
		
	}
	
	
	
	
	
	
	

}
