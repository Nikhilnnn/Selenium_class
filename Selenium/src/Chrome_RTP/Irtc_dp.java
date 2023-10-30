package Chrome_RTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irtc_dp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p-dropdown [@id='journeyClass']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span [.='AC Chair car (CC)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span [.='GENERAL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span [.='PREMIUM TATKAL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p-calendar[@dateformat='dd/mm/yy']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p-autocomplete[@id='origin']")).sendKeys("ben");
	}

}
