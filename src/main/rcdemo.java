package main;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class rcdemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	//Instatiate the RC Server
	Selenium selenium = new DefaultSelenium("localhost", 4444 , "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe", "http://www.baidu.com");
	selenium.start();   // Start
	selenium.open("http://www.baidu.com");  // Open the URL
	selenium.windowMaximize();;

	// Click on Link Math Calculator
	selenium.click("xpath=.//*[@id='menu']/div[3]/a");
	Thread.sleep(2500); // Wait for page load
	
	// Click on Link Percent Calculator
	selenium.click("xpath=.//*[@id='menu']/div[4]/div[3]/a");
	Thread.sleep(4000); // Wait for page load
	
	
	// Focus on text Box
	selenium.focus("name=cpar1");
	// enter a value in Text box 1
	selenium.type("css=input[name=\"cpar1\"]", "10");

	// enter a value in Text box 2
	selenium.focus("name=cpar2");
	selenium.type("css=input[name=\"cpar2\"]", "50");
	
	// Click Calculate button
	selenium.click("xpath=.//*[@id='content']/table/tbody/tr/td[2]/input");
	
	// verify if the result is 5
	String result = selenium.getText(".//*[@id='content']/p[2]");
	System.out.println(result);
		
	if (result == "5")
	{
		System.out.println("Pass");
	}else
	{
		System.out.println("Fail");
	}
		
	}

}