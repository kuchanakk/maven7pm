package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maven.pack1.TestBase;

public class HomePage extends TestBase {
	
	//static WebDriver driver;
	
	public   HomePage(WebDriver  driver) {
		
		this.driver=driver;
	}
	
	
	public static WebElement popitems() {
		
		return driver.findElement(By.linkText("POPULAR ITEMS"));
		
		
	}
	
	public static WebElement tabletdetailslink() {
		return driver.findElement(By.id("details_16"));
		
		
	}
	
	public static WebElement laptopdetailslink() {
		return driver.findElement(By.id("details_10"));
		
		
	}
	
	public static WebElement spkdetailslink() {
		return driver.findElement(By.id("details_21"));
		
		
	}
	
public static WebElement producttext() {
	
	return driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
	
}
}
