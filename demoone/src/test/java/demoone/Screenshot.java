package demoone;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
			public static void takeScreenshot(){
					
			
			
			//TakesScreenshot screenshot = (TakesScreenshot)driver;
			//File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
			
			//String TCName = "TC_001";
			//String dir = System.getProperty("user.dir");
			//Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			//String path = dir + "/src/test/resources/screenshots/"+TCName+"/screenshot_"+stepName+"_"+timestamp+".jpeg";
			
			//File destFile = new File (path);
			
			
			}
		

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("C:\\Users\\shrav\\Downloads\\screen\\fb.jpg"));
		
		
		//FileUtils.copyFile(file, new File("/demoone/src/test/java/demoone"+"/src/test/resources/screenshots"+fileName+".jpg"));
		//takeScreenshot("SeleniumHomePage");
		
	}

}
