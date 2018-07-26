package krossover.QA.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest 
{ static String x ="tra";
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Data/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys(x);
		Thread.sleep(500);
		List<WebElement> sugg=driver.findElements(By.xpath("//ul[@role='listbox']//b"));
		
		for(WebElement options : sugg) {
			
			String suggestion=options.getText();
			System.out.println(x+suggestion);
			if((x+suggestion).equalsIgnoreCase("train timings"))
			{
				options.click();
			}
			
		}
			
			
		
		
		
		
		
	}

}
