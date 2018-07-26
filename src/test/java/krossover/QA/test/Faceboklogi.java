package krossover.QA.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Faceboklogi {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Data/chromedriver.exe");
		ChromeOptions options= new ChromeOptions();///////***********************
		options.addArguments("window-size(1400,800)");///HeadlessChrome
		options.addArguments("Headless");////*******************
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.facebook.com");
        String bgcolor=		driver.findElement(By.xpath("//label[@id='loginbutton']")).getCssValue("backgroundColor");
       WebElement element= driver.findElement(By.xpath("//label[@id='loginbutton']"));
		System.out.println(bgcolor);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String colour = "rgba(128,0,128,1.0)";
		//js.executeScript("arguments[0].style.backgroundColor='"+colour+"'",element);
		js.executeScript("arguments[0].style.border='5px solid red'",element );
		Thread.sleep(5000);
		
		
	}

}
