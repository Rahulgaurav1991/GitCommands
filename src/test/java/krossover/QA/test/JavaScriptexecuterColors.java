package krossover.QA.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptexecuterColors 
{
public static void blink(WebDriver driver, WebElement element) 
{
	JavascriptExecutor jse= ((JavascriptExecutor)driver);
	String bgcolor= element.getCssValue("backgroundColor");
	for(int i= 0; i<= 100; i++) {
		changecolor("rgba(0,200,0,0)",element,driver);
		changecolor(bgcolor,element,driver);
	}}
public static void changecolor(String color, WebElement element, WebDriver driver) {
	JavascriptExecutor jse= ((JavascriptExecutor)driver);
	jse.executeScript("arguments[0].style.backgroundColor'"+color+"'", element);
	try {
		Thread.sleep(200);
	} catch (Exception e) {
		// TODO: handle exception
	}
	//////***these lines will work Everywhere
	String message="hiii";
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.backgroundColor='red'",driver.findElement(By.xpath("//label[@id='loginbutton']")));// to change background color
	js.executeScript("arguments[0].style.Border='5px solid red'",element );// to highlight borfer
	js.executeScript("alert(message)");// to create javascript alert
	js.executeScript("arguments[0].click();", element);// to click on a element using javascript
	js.executeScript("history.go();"); //to refresh or go to first page in history
	js.executeScript("return document.title;").toString();// it returns the title of the current page
	js.executeScript("return document.ducumentElement.innerText;").toString();// visible text present on webpage
	js.executeScript("window.scrollTo(0, document.body.scrollHight)");// Scroll till the end of page
	js.executeScript("arguments[0].scrollIntoView(true)", element);// Keep scrolling till the element is visible
	
}
}
