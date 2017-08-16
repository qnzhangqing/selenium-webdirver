package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/*import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.cookie.BasicClientCookie;*/
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class webdriverdemo {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		
		
		//使用代理ip测试
/*		String proxyIp = "111.179.12.166";
		int proxyPort = 7671;
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.http", proxyIp);
		profile.setPreference("network.proxy.http_port", proxyPort);
		profile.setPreference("network.proxy.ssl", proxyIp);
		profile.setPreference("network.proxy.ssl_port", proxyPort);
		//所有协议公用一种代理配置，如果单独配置，这项设置为false
		profile.setPreference("network.proxy.share_proxy_settings", true);
		 profile.setPreference("network.proxy.no_proxies_on", "localhost");*/
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver1 = new FirefoxDriver();
		
		
		

		driver.get("https://www.tianyancha.com/login");
//		driver1.get("http://www.baidu.com");
		System.out.println("one--");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/input"))
				.sendKeys("15101562443");
		System.out.println("two--");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div[3]/input"))
				.sendKeys("2602690wxhwzj");
		System.out.println("three--");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div[5]")).click();
		Thread.sleep(5000);
		//登陆cookie保存        
		System.out.println("foure--");
		driver.findElement(By.xpath("//*[@id=\"live-search\"]")).sendKeys("方圆奇正");
		System.out.println("five--");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/div/span"))
				.click();
		System.out.println("six--");
		Thread.sleep(8000);
		List<WebElement> webelement = driver
				.findElements(By.cssSelector(".query_name.search-new-color.sv-search-company"));
		int i = 0;
		List<String> tmp = new ArrayList<String>();
		try {
			for (WebElement webElement2 : webelement) {
				tmp.add(webElement2.getAttribute("href"));
			}
			for (String string : tmp) {	
				i++;
				if(i==1) {
					driver.get(string);
					WebElement web=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]"));
					System.out.println(web.getText());
				}
				System.out.println("---------------"+string);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}