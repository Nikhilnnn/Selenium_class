package Chrome_RTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("7975766103");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nikhildon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='#']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("nikhil_v_ce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='nikhil_v_ce']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Follow']")).click();

	}

}
