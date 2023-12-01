package demoone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ninja2 {

	//private static WebDriverWait wait1;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Launch the application
		driver.get("https://tutorialsninja.com/demo/index.php");
		//Select the currency in the left top corner to Euro
		WebElement currencymenu = driver.findElement(By.xpath("//form[@id='form-currency']"));
		currencymenu.click();
		WebElement selectcurrency = driver.findElement(By.xpath("//*[text()='€Euro']"));
		selectcurrency.click();
		//Try to order a canon EOS 5 D camera and collect the error message occurred due to a bug in select option
		WebElement canon = driver.findElement(By.xpath("//*[text()='Canon EOS 5D']"));
		canon.click();
		WebElement sel = driver.findElement(By.xpath("//*[@id='input-option226']"));
		sel.click();
		
		Select opt =new Select(sel);
		
		List <WebElement> element = opt.getOptions();
		if(+element.size()>1) {
			System.out.println("Under Select dropdown it has "+element.size()+ " options.........");	
		}
		else {
		System.out.println("Under Select dropdown it has NO options.........");
		}
				
		//Move to the home screen, Click on iphone and go to details screen, change the quantity to two then add to cart.
		driver.navigate().back();
		WebElement iph = driver.findElement(By.xpath("//*[text()='iPhone']"));
		iph.click();
		WebElement iphq = driver.findElement(By.xpath("//div[@id='product']/div/input"));
		iphq.clear();
		iphq.sendKeys("2");
		WebElement cart = driver.findElement(By.xpath("//*[text()='Add to Cart']"));
		cart.click();
		
		//Print the success message in the console
		WebElement success = driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
		success.click();
		String s=success.getText();
		System.out.println("Print the Status:"+s);
		
		//6. Click on the cart icon (black color) in the right side top then click view cart
		WebElement addcart = driver.findElement(By.xpath("//span[@id='cart-total']"));
		addcart.click();
		WebElement viewcart = driver.findElement(By.xpath("//*[text()='View Cart']"));
		viewcart.click();
		
		//7. Change the quantity of iphone to 3 and click update button 
		WebElement updatec = driver.findElement(By.xpath("//*[@id='content']//input"));
		updatec.clear();
		updatec.sendKeys("3");
		
		//8. Print the Eco tax and VAT Amount in console and click Checkout button
		WebElement eco = driver.findElement(By.xpath("//*[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[2]/td[2]"));
		String e=eco.getText();
		System.out.println("Print the Ecotax::"+e);
		WebElement vat = driver.findElement(By.xpath("//*[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[3]/td[2]"));
		String v=vat.getText();
		System.out.println("Print the VAT:"+v);
		
		//Print the error message and remove the product from the cart
		
		WebElement msg = driver.findElement(By.xpath("//*[@id='checkout-cart']/div[1]"));
		String m=msg.getText();
		System.out.println("Print the error:" +m);
		WebElement remove = driver.findElement(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[2]"));
		remove.click();
		
		//Move to the home screen and click on Mac book, check the default quantity is 1 
		//and click add to cart then verify success message
		
		driver.navigate().back();
		driver.navigate().back();
		
		//driver.navigate().to("https://tutorialsninja.com/demo/index.php");
		
		WebElement mac = driver.findElement(By.xpath("//*[text()='MacBook']"));
		mac.click();
		WebElement macq = driver.findElement(By.xpath("//*[@id='product']/div/input"));
		macq.clear();
		macq.sendKeys("1");
		WebElement mcart = driver.findElement(By.xpath("//*[@id='button-cart']"));
		
		
		WebElement qty = driver.findElement(By.xpath("//*[@id=\"input-quantity\"]"));
		String ca=qty.getAttribute("value");
		
		if(ca.equals("1")) {
			mcart.click();
			System.out.println("The Quantity of macbook is one, hence adding to cart");
			}
		else {
			System.out.println("The Quantity of macbook is not one");
			
		}
		
		WebElement succs = driver.findElement(By.xpath("//*[contains(text(),'Success')]"));
		String sg=succs.getText();
		if(sg.contains("Success")) {
			  System.out.println("Print the Status:"+sg);
			   }
			   else
			   {
				System.out.println("Issue with Adding to cart..."); 	
			    }
		
		
		// Click on the shopping cart link in the top and apply ABCD123 as coupon code to check, print error message
		WebElement shopc = driver.findElement(By.xpath("//*[@id='top-links']/ul/li[4]/a/i"));
		shopc.click();
		WebElement coupon = driver.findElement(By.xpath("//*[@id='accordion']/div/div/h4/a"));
		coupon.click();
		WebElement enterc = driver.findElement(By.xpath("//*[@id='collapse-coupon']/div/div/input"));
		enterc.sendKeys("ABC123");
		WebElement Applyc = driver.findElement(By.xpath("//*[@id='button-coupon']"));
		Applyc.click();
		WebElement msg1 = driver.findElement(By.xpath("//*[contains(text(),'Warning')]"));
		String m1=msg1.getText();
		System.out.println("coupon error message:" +m1);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@id='accordion']/div[2]/div/h4/a"))).click();
		 
		///Enter AXDFGH123 as gift certificate and perform apply to check, print error message

		WebElement giftc = driver.findElement(By.xpath("//*[@id='accordion']/div[2]/div/h4/a"));
		giftc.click();
		WebElement enterg = driver.findElement(By.xpath("//*[@id='collapse-voucher']/div/div/input"));
		enterg.sendKeys("AXDFGH123");
		WebElement Applyg = driver.findElement(By.xpath("//*[@id='button-voucher']"));
		Applyg.click();
		WebElement msg2 = driver.findElement(By.xpath("//*[contains(text(),'Warning')]"));
		String m2=msg2.getText();
		System.out.println("Gift error message:" +m2);
					
		//13. Clear both textbox values and proceed to checkout
        
        
		driver.findElement(By.xpath("//*[@id=\"input-voucher\"]")).clear();
		driver.findElement(By.xpath("//*[@class='accordion-toggle collapsed']")).click();
		driver.findElement(By.xpath("//*[@id=\"input-coupon\"]")).clear();
		
		}
}