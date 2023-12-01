package OOPConceptpart1;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class juice {
	
	public static WebDriver driver ;
	String URL = "https://juice-shop.herokuapp.com/#/register";
	
	@FindBy (xpath = "//button//span[text()='Dismiss']") WebElement dismissBtn;
	@FindBy (id = "emailControl") WebElement emailID;
	@FindBy (id = "passwordControl") WebElement passwordTxt;
	@FindBy (id = "repeatPasswordControl") WebElement confirmPassword;
	@FindBy (xpath = "//div[@id='mat-select-value-1']/span") WebElement secQnBox;
	@FindBy (xpath = "//span[text()=' Your eldest siblings middle name? ']") WebElement secQn;
	@FindBy (id = "securityAnswerControl") WebElement secQnAns;
	@FindBy (xpath ="//*[@class='cc-compliance']/a") WebElement cookie;
	@FindBy (xpath="//button[@id='registerButton']")WebElement reg;
	
		@Test
		public void register() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(URL);
		
		PageFactory.initElements(driver, this);
		
		dismissBtn.click();
		emailID.sendKeys("godashrav@gmail.com");
		passwordTxt.sendKeys("Test112233##");
		confirmPassword.sendKeys("Test112233##");
		secQnBox.click();
		secQn.click();
		secQnAns.sendKeys("goda");
		cookie.click();	
		Actions actions = new Actions(driver);
		actions.keyUp(Keys.ARROW_DOWN);
		actions.wait(10);
		//reg.click();
				
	}


public static void main(String[] args) throws InterruptedException {
	
	//juice obj = new juice();
		//obj.register();
	}

}