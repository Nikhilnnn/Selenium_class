package Chrome_RTP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkey {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LB561LN/OneDrive%20-%20EY/Desktop/xpath.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='a2']"));
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"x");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='a3']"));
		ele1.sendKeys(Keys.CONTROL+"v");
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='a1']"));
		ele2.sendKeys(Keys.CONTROL+"a");
		ele2.sendKeys(Keys.CONTROL+"x");
		ele.sendKeys(Keys.CONTROL+"v");
		ele1.sendKeys(Keys.CONTROL+"ax");
		ele2.sendKeys(Keys.CONTROL+"v");
	}

}
