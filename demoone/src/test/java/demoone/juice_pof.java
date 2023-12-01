package demoone;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

@Test
public class juice_pof {
	
	public static WebDriver driver = new ChromeDriver();
	String URL =  "https://juice-shop.herokuapp.com/#/register";
	String URL_login = "https://juice-shop.herokuapp.com/#/login";
	
	@FindBy (xpath = "//button//span[text()='Dismiss']") WebElement dismissBtn;
	@FindBy (id="emailControl") WebElement emailId;
	@FindBy (id="passwordControl")WebElement passwordtxt;
	@FindBy (id="repeatPasswordControl") WebElement confirmpassword;
	@FindBy (xpath= "//*[@class='mat-form-field-infix ng-tns-c22-10']") WebElement secQnbox;
	@FindBy (xpath="//*[@id='mat-option-1']/span") WebElement secQn;
	@FindBy (id="securityAnswerControl") WebElement answer;
	@FindBy (xpath ="//*[@class='cc-compliance']/a") WebElement cookie;
	@FindBy (xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")WebElement reg;
	
	@FindBy (id="email") WebElement email;
	@FindBy (id="password") WebElement pass;
	@FindBy (id="loginButton") WebElement login;
	
	@FindBy (xpath="//button[@class='mat-focus-indicator checkout-button mat-raised-button mat-button-base mat-primary']")WebElement checkout;
	@FindBy (xpath="//button[@class='mat-focus-indicator btn btn-new-address mat-button mat-raised-button mat-button-base mat-primary']") WebElement address;
	@FindBy (xpath="//div[@class='mat-form-field-infix ng-tns-c22-14']/input") WebElement country;	
	@FindBy (xpath="//*[@id=\"mat-input-4\"]") WebElement name;
	@FindBy (xpath="//*[@id=\"mat-input-5\"]") WebElement mobile;
	@FindBy (xpath="//*[@id=\"mat-input-6\"]") WebElement zip;
	@FindBy (xpath="//*[@id='address']") WebElement addr;
	@FindBy (xpath="//*[@id=\"mat-input-8\"]") WebElement city;
	@FindBy (xpath="//*[@id=\"mat-input-9\"]") WebElement state;
	@FindBy (xpath="//button[@id='submitButton']") WebElement submit;
	@FindBy (xpath="//*[@id=\"mat-radio-42\"]/label/span[1]/span[2]") WebElement selectadd;
	@FindBy (xpath="//*[@id=\"card\"]/app-address/mat-card/button/span[1]") WebElement selectcont;
	@FindBy (xpath="//*[@class='mat-radio-label']/span") WebElement deliv;
	@FindBy (xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[4]/button[2]") WebElement delivcont;
	@FindBy (xpath="//*[@id='mat-expansion-panel-header-0']") WebElement addnewcard;
	@FindBy (xpath="//div[@class='mat-form-field-infix ng-tns-c22-24']/input") WebElement newcardname;
	@FindBy (xpath="//div[@class='mat-form-field-infix ng-tns-c22-25']/input") WebElement newcardnum;
	@FindBy (xpath="//div[@class='mat-form-field-infix ng-tns-c22-26']/select/option[8]") WebElement expm;
	@FindBy (xpath="//div[@class='mat-form-field-infix ng-tns-c22-27']/select/option[1]") WebElement expy;
	@FindBy (xpath="//*[@id=\"submitButton\"]") WebElement submitpay;
	@FindBy (xpath="//*[@class='mat-expansion-panel-header mat-focus-indicator detail-divider ng-tns-c42-29 ng-tns-c41-28 ng-star-inserted']/span[2]") WebElement addacoupon;
	@FindBy (xpath="//*[@id='coupon']") WebElement couponnum;
	@FindBy (xpath="//*[@id='applyCouponButton']") WebElement applycoupon;
	
	@FindBy (xpath="//*[@class='mat-radio-container']/span") WebElement selectpay;
	@FindBy (xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card/div/div[2]/button[2]") WebElement cont;
	@FindBy (xpath="//*[@id='checkoutButton']") WebElement placeo;
	@FindBy (xpath="//*[contains(text(),'Track Orders')]") WebElement tracko;
	@FindBy (xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-order-completion/mat-card/div[2]/div/button/span[1]/mat-icon") WebElement printo;
	
	@Test
	public void register() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver.get(URL);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		
		dismissBtn.click();
		emailId.sendKeys("goda2@gmail.com");
		passwordtxt.sendKeys("Test123");
		confirmpassword.sendKeys("Test123");
		secQnbox.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOf(secQn));
		secQn.click();
		answer.sendKeys("scooby");
		cookie.click();
		
		Thread.sleep(6000);
		js.executeScript("arguments[0].scrollIntoView(true);",reg);
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(3000));
		wait1.until(ExpectedConditions.visibilityOf(reg)).click();
		
		}
@Test	
public void login() throws InterruptedException, WebDriverException, IOException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get(URL_login);
		PageFactory.initElements(driver, this);
		dismissBtn.click();
		email.sendKeys("goda2@gmail.com");
		pass.sendKeys("Test123");
		login.click();
		Thread.sleep(6000);
		//login.wait();
		
		WebElement applejuiceaddtobasket = driver.findElement(By.cssSelector("mat-grid-tile:nth-child(1) > div > mat-card > div:nth-child(2) > button"));
		applejuiceaddtobasket.click();
		//WebElement applepomaceaddtobasket = driver.findElement(By.cssSelector("mat-grid-tile:nth-child(2) > div > mat-card > div:nth-child(2) > button"));
		//applepomaceaddtobasket.click();
		//WebElement bananajuiceaddtobasket = driver.findElement(By.cssSelector("mat-grid-tile:nth-child(3) > div > mat-card > div:nth-child(2) > button"));
		//bananajuiceaddtobasket.click();
		//this.wait(300);	
		WebElement tobasket = driver.findElement(By.cssSelector("mat-toolbar-row > button.mat-focus-indicator.buttons.mat-button.mat-button-base.ng-star-inserted"));
		Thread.sleep(6000);
		tobasket.click();
		Thread.sleep(6000);
		cookie.click();
		
		//WebElement applejuiceplus = driver.findElement(By.cssSelector("mat-table > mat-row:nth-child(2) > mat-cell.mat-cell.cdk-cell.content-align.cdk-column-quantity.mat-column-quantity.ng-star-inserted > button:nth-child(3)"));
		//applejuiceplus.click();
		//WebElement applepomaceplus = driver.findElement(By.cssSelector("mat-table > mat-row:nth-child(3) > mat-cell.mat-cell.cdk-cell.content-align.cdk-column-quantity.mat-column-quantity.ng-star-inserted > button:nth-child(3)"));
		//applepomaceplus.click();		
		//WebElement bananajuiceplus = driver.findElement(By.cssSelector("mat-table > mat-row:nth-child(4) > mat-cell.mat-cell.cdk-cell.content-align.cdk-column-quantity.mat-column-quantity.ng-star-inserted > button:nth-child(3)"));
		//bananajuiceplus.click();
		//Thread.sleep(3000);
		//WebElement checkout = driver.findElement(By.xpath("//button[@class='mat-focus-indicator checkout-button mat-raised-button mat-button-base mat-primary']"));
		//js.executeScript("arguments[0].scrollIntoView(true);",checkout);
		//WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='mat-focus-indicator checkout-button mat-raised-button mat-button-base mat-primary']")));
		checkout.click();
		address.click();
		Thread.sleep(500);
		country.sendKeys("usa");
		Thread.sleep(300);
		
		String randname = RandomStringUtils.randomAlphanumeric(5);
		name.sendKeys(randname);
		Thread.sleep(500);
		
		String randmo = RandomStringUtils.randomNumeric(10);
		mobile.sendKeys(randmo);
		Thread.sleep(300);
		
		String randzip = RandomStringUtils.randomNumeric(5);
		zip.sendKeys(randzip);
		Thread.sleep(300);
		
		String randadd = RandomStringUtils.randomAlphanumeric(30);
		addr.sendKeys(randadd);
		Thread.sleep(300);
		
		String randcity = RandomStringUtils.randomAlphanumeric(15);
		city.sendKeys(randcity);
		Thread.sleep(300);
		
		String randstate = RandomStringUtils.randomAlphanumeric(2);
		state.sendKeys(randstate);
		Thread.sleep(300);
		
		js.executeScript("arguments[0].scrollIntoView(true);",submit);
		submit.click();
		Thread.sleep(300);
		selectadd.click();
		Thread.sleep(300);
		selectcont.click();
		Thread.sleep(300);
		deliv.click();
		Thread.sleep(500);
		delivcont.click();
		Thread.sleep(500);
		addnewcard.click();
		Thread.sleep(500);
		newcardname.sendKeys("gs");
		newcardnum.sendKeys("2345678909456565");
		expm.click();
		expy.click();
		submitpay.click();
		addacoupon.click();
		Thread.sleep(500);
		couponnum.sendKeys("2345678909");
		applycoupon.click();
		Thread.sleep(500);
		WebElement msg1 = driver.findElement(By.xpath("//*[contains(text(),'Invalid coupon.')]"));
		String m1=msg1.getText();
		System.out.println("coupon error message:" +m1);
		js.executeScript("arguments[0].scrollIntoView(true);",selectpay);
		selectpay.click();
		js.executeScript("arguments[0].scrollIntoView(true);",cont);
		cont.click();
		placeo.click();
		tracko.click();
		Thread.sleep(500);
		WebElement msg2 = driver.findElement(By.xpath("//*[contains(text(),'Search Results')]"));
		String m2=msg2.getText();
		System.out.println("Tracking order:" +m2);
		File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file1, new File("C:\\Users\\shrav\\Downloads\\screen\\tracking.jpg"));
		driver.navigate().back();
		printo.click();
		File file2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file2, new File("C:\\Users\\shrav\\Downloads\\screen\\printo.jpg"));
				
		//String email = (RandomStringUtils.random(5,"ABCDEFGHIJK1233"));
							
	}

		
	public static void main(String[] args) throws InterruptedException {
		//juice_pof obj = new juice_pof();
		//obj.register();
		//obj.login();		

	}

}
