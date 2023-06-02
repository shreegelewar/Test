package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	WebElement ut=	driver.findElement(By.id("email"));
	ut.clear();
	ut.sendKeys("9922154568");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Shree@1994");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
  // Title Validation		
		String act=driver.getTitle();
		System.out.println(act);
		String exp="Facebook – log in or sign up";
		if(act.equals(exp)) {
			System.out.println("TC Passes");
		}else {
			System.out.println("Tc Failed");
	} 
		
		
		
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();

	}}
