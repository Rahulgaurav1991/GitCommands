package krossover.QA.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCalByJS 
{
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Data/chromedriver.exe");
			ChromeOptions options= new ChromeOptions();///////***********************
			options.addArguments("window-size(1400,800)");
			options.addArguments("Headless");
			WebDriver driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://www.spicejet.com");
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']/..//button"));
			element.click();
			List<WebElement> datepicker=driver.findElements(By.xpath("//div[@class='ui-datepicker-title']/../../..//td/a"));
			
			for (int i=0;i<datepicker.size();i++) {
				String s=datepicker.get(i).getText();
				if(s=="17") {
					datepicker.get(i).click();}
				System.out.println(s);
			}
			
			
			
			
		//	String datevalue="25-052018";
			//datepicker(element, datevalue, driver);
		
		
	}
	public static void datepicker(WebElement element,String datevalue,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].setAttribute('value','"+datevalue+"')", element);
	}

}
