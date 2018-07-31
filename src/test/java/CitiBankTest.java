import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CitiBankTest
{
	WebDriver driver;
	
	@Test
	public void Start() {
		System.setProperty("webdriver.gecko.driver", "./Data/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.online.citibank.co.in/ ");
		
			}

}
