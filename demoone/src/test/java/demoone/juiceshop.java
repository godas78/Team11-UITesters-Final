package demoone;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class juiceshop {
	
	static String URL =  "https://juice-shop.herokuapp.com/#/register";
	static String URL_login = "https://juice-shop.herokuapp.com/#/login";
	
	@FindBy (xpath = "//button//span[text()='Dismiss']") WebElement dismissBtn;
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver.get(URL_login);
		
		
	}
}

