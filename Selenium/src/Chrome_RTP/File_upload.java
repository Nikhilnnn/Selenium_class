package Chrome_RTP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class File_upload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LB561LN/OneDrive%20-%20EY/Desktop/file.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\MAINTENANCE\\New Text Document (6).txt");
//		Thread.sleep(1000);
		driver.quit();
//		Actions ac = new Actions(driver);
//		ac.doubleClick().perform();
//
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_N);
//		r.keyRelease(KeyEvent.VK_N);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
