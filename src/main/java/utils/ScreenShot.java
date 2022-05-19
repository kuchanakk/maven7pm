package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.maven.pack1.TestBase;

public class ScreenShot extends TestBase {
	
	
	public static void shot() throws IOException {
		
		File screshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screshot,new File( "C:\\Users\\kiran\\eclipse-workspace\\mavenproject\\resources\\screenshot\\error.png"));
	}

}
