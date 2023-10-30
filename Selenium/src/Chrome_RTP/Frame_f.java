package Chrome_RTP;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_f {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LB561LN/OneDrive%20-%20EY/Desktop/main.html");
		driver.findElement(By.id("a2")).sendKeys("hii");
		Thread.sleep(2000);
		driver.findElement(By.id("e1")).sendKeys("hello");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("a1")).sendKeys("hii");
		
}
}