package main;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class proxy {
	public static void main(String[] args) throws InterruptedException {

		String proxyIpAndPort = "49.81.26.143:6590";
		DesiredCapabilities cap = new DesiredCapabilities();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(proxyIpAndPort).setFtpProxy(proxyIpAndPort).setSslProxy(proxyIpAndPort);
		cap.setCapability(CapabilityType.ForSeleniumServer.AVOIDING_PROXY, true);
		cap.setCapability(CapabilityType.ForSeleniumServer.ONLY_PROXYING_SELENIUM_TRAFFIC, true);
		System.setProperty("http.nonProxyHosts", "localhost");
		cap.setCapability(CapabilityType.PROXY, proxy);
		WebDriver webDriver = new FirefoxDriver(cap); // 设置代理
		// 访问网址
		try {
			webDriver.get("http://www.baidu.com");// 访问网址
			/*// 标题
			WebElement eleItemTitle = webDriver.findElement(By.id("title"));
			String txtItemTitle = eleItemTitle.getText();
			System.out.println(txtItemTitle);*/
		} catch (Exception e) {
			System.err.println("Exception: " + e);
		}
		Thread.sleep(10000);
		webDriver.close();
		webDriver.quit();
	}
}
