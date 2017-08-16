package main;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class webdriverdemo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement DynamicElement = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.id("DynamicElement")));
		//Launch website
		driver.navigate().to("http://www.calculator.net/interest-calculator.htmll");
		driver.manage().window().maximize();
		 
	    // Selecting an item from Drop Down list Box
		Select dropdown = new Select(driver.findElement(By.id("ccompound")));
		dropdown.selectByVisibleText("semiannually");
		//  you can also use dropdown.selectByIndex(1) to select second element as index starts with 0.
		//  You can also use dropdown.selectByValue("annually");    
		Thread.sleep(5000);
	    System.out.println("The Output of the IsSelected " + driver.findElement(By.id("ccompound")).isSelected());
	   Thread.sleep(3000);
	    System.out.println("The Output of the IsEnabled " + driver.findElement(By.id("ccompound")).isEnabled());
	    Thread.sleep(2000);
	    System.out.println("The Output of the IsDisplayed " + driver.findElement(By.id("ccompound")).isDisplayed());
	    Thread.sleep(9000);
	    driver.close(); 
	  }
}
