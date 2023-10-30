package Abst_RTP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MS_edge {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
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
