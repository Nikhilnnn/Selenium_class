package Chrome_RTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopper {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shoppersstack.com/");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[@href='/electronics']")).click();	

	}

}
