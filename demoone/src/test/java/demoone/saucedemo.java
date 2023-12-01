package demoone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v117.debugger.Debugger.ContinueToLocationTargetCallFrames;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrav\\eclipse-workspace\\demoone\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		//WebElement item1 = driver.findElement(By.linkText("Sauce Labs Backpack"));
		//item1.click();		
		WebElement cart1 = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		cart1.click();
		//WebElement backto = driver.findElement(By.name("back-to-products"));
		//backto.click();
		//WebElement item2 = driver.findElement(By.linkText("Sauce Labs Bike Light"));
		//item2.click();		
		WebElement cart2 = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
		cart2.click();
		WebElement shopping = driver.findElement(By.className("shopping_cart_link"));
		shopping.click();
		WebElement checkout = driver.findElement(By.name("checkout"));
		checkout.click();
		//WebElement cancel = driver.findElement(By.name("cancel"));
		///cancel.click();
		
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("fn");
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("ln");
		WebElement zipcode = driver.findElement(By.id("postal-code"));
		zipcode.sendKeys("94566");
		WebElement cbutton = driver.findElement(By.id("continue"));
		cbutton.click();
		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();
		
		//WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
		//menu.click();
		//WebElement item = driver.findElement(By.id("inventory_sidebar_link"));
		//item.click();
		//WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		//logout.click();
		}

}
