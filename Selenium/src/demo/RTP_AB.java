package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class RTP_AB {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		driver.navigate().to("https://github.com/SeleniumHQ/selenium/releases/download/selenium-3.141.5/selenium-server-standalone-3.141.5.jar");
		Thread.sleep(2000);
		driver.navigate().to("https://chromedriver.chromium.org/");
		Thread.sleep(2000);
		driver.navigate().to("https://googlechromelabs.github.io/chrome-for-testing/");
		Thread.sleep(2000);
		driver.navigate().to("https://googlechromelabs.github.io/chrome-for-testing/#stable");
		Thread.sleep(2000);
		driver.navigate().to("	https://edgedl.me.gvt1.com/edgedl/chrome/chrome-for-testing/116.0.5845.96/win64/chromedriver-win64.zip");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.quit();	}

}
