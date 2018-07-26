package krossover.QA.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Lemo {
	@Test
	public void run()
	{
		try {
			System.setProperty("webdriver.gecko.driver","./Data/geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.freecrm.com");
			//WebDriverWait wait= new WebDriverWait(driver, 30);
			//wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//button[.= 'Sign Up']/../..//button[2]"))));
			WebElement element =driver.findElement(By.xpath("//form[@class='navbar-form']/..//input[@type='submit']"));
		Thread.sleep(10000);
			
		//	Actions action= new Actions(driver);
			//action.moveToElement(element).click().build().perform();
			
			String color= element.getCssValue("backgroundColor");
			Lemo.changecolor("rgb(0,0,0)", element, driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static void changecolor(String color, WebElement element, WebDriver driver) {
		//JavascriptExecutor jse= ((JavascriptExecutor)driver);
		((JavascriptExecutor) driver).executeScript("document.getElementByxpath('//form[@class='navbar-form']/..//input[@type='submit']').style.backgroundColor = 'lightblue';");
		//jse.executeScript("arguments[0].style.backgroundColor'"+color+"'"  , element);
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
	
