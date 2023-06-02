package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Tshirt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
