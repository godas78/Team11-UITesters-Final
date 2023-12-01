package demoone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo1 {

	public static void main(String[] args){
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		WebElement item1 = driver.findElement(By.linkText("Sauce Labs Backpack"));
		item1.click();		
		WebElement cart1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		cart1.click();
		WebElement back = driver.findElement(By.id("back-to-products"));
		back.click();
		WebElement item2 = driver.findElement(By.linkText("Sauce Labs Bike Light"));
		item2.click();		
		WebElement cart2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		cart2.click();
		WebElement back1 = driver.findElement(By.id("back-to-products"));
		back1.click();
		WebElement shopping = driver.findElement(By.className("shopping_cart_link"));
		shopping.click();
		WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		
		WebElement dropdown = driver.findElement(By.className("bm-item menu-item"));
        dropdown.findElement(By.xpath("//div[@class='bm-menu']//a[3]")).click();
		}

}
