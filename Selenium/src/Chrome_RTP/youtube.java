package Chrome_RTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kadalanu");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@href='/watch?v=i_vRoQGIc6Y&pp=ygUIa2FkYWxhbnU%3D']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='segmented-like-button']")).click();
	}
}
