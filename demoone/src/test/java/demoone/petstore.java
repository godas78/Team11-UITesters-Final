package demoone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class petstore {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		WebElement item1 = driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]"));
		item1.click();
		WebElement shark = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
		shark.click();
		WebElement cart1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		cart1.click();
		WebElement backtofish = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img"));
		backtofish.click();
		WebElement angel1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		angel1.click();
		WebElement cart2 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		cart2.click();
		//WebElement angel2 = driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
		//angel2.click();
		
		//WebElement cart3 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a"));
		//cart3.click();
		
		//WebElement checkout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
		//checkout.click();
	}

}
