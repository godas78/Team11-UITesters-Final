package demoone;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;

@Test
public class juiceshop_pomodel {
	
	public static WebDriver driver = new ChromeDriver();
	String URL =  "https://juice-shop.herokuapp.com/#/register";
	
	By dismissBtn = By.xpath("//button//span[text()='Dismiss']");
	By emailId = By.id("emailControl");
	By passwordtxt = By.id("passwordControl");
	By confirmpassword = By.id("repeatPasswordControl");
	By secQnbox = By.xpath("//*[@id=\"mat-select-value-1\"]/span");
	By secQn = By.xpath("//span[text()='Name of your favorite pet?']");
	By answer = By.id("securityAnswerControl");
	By reg = By.xpath("//span[@text()='Register']");
	
	
	public void register() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver.get(URL);
		
		driver.findElement(dismissBtn).click();
		driver.findElement(emailId).sendKeys("godashrav@gmail.com");
		driver.findElement(passwordtxt).sendKeys("Junnu112233##");
		driver.findElement(confirmpassword).sendKeys("Junnu112233##");
		driver.findElement(secQnbox).click();
		driver.findElement(secQn).click();
		driver.findElement(answer).sendKeys("scooby");
		driver.findElement(reg).click();		
		}
	public static void main(String[] args) {
		

	}

}
