package Chrome_RTP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone 14");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//img[@alt='Apple iPhone 14 (128 GB) - Blue']"));
		 ele.click();
		 Thread.sleep(8000);
		 ele.sendKeys(Keys.UP);
		Thread.sleep(2000);
		driver.close();
		

	}

}
