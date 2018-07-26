package interviewPreps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebooklogotest {
	WebDriver driver;
	@Test
		public void fbstart(){
			System.setProperty("webdriver.chrome.driver","./Data/chromedriver.exe");
			
			 driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com");
			}
//	@Test
//	public void tests() {
//		driver.get("https://www.facebook.com");
//		Boolean b= driver.findElement(By.xpath("//i[@class='fb_logo img sp_lQnvSzqUkvK sx_b7adef']")).isDisplayed();
//Assert.assertTrue(b, "logo is not present");	}


@Test
public void omayotest() throws InterruptedException {
	Thread.sleep(10000);
	
 //	driver.findElement(By.xpath("//aside//select[@id='multiselect1']")).click();;
	Select dd= new Select(driver.findElement(By.xpath("//select[@id='multiselect1']")));
	Boolean b=dd.isMultiple();
	Assert.assertTrue(b, "Dropdown is not multiselect");
  List <WebElement> li= dd.getOptions();
  
 List<String> al = new LinkedList<String>();
	for (WebElement el: li) {
	al.add(el.getText());
		
	}
	Collections.sort(al);
	for (String s: al) {
	System.out.println(s);
}}}
