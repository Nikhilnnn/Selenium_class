package Abst_RTP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		//driver.close();
		//driver.quit();
		//driver.navigate().to("https://www.youtube.com");
		//driver.navigate().to("https://www.youtube.com/watch?v=QBKBrvDt1zo");
		//Thread.sleep(2000);
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		driver.manage().deleteAllCookies();
//		Thread.sleep(9000);
//		driver.quit();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		String P_src = driver.getPageSource();
		System.out.println(P_src);
		String c_url = driver.getCurrentUrl();
		System.out.println(c_url);
		
}
	
	

}
