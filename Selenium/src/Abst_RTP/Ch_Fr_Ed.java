package Abst_RTP;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ch_Fr_Ed {
	public static void main(String[] args) throws InterruptedException {
		
		//chrome launch
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d = new Dimension(600,300);
		driver.manage().window().setSize(d);
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		String P_src = driver.getPageSource();
		System.out.println(P_src);
		String c_url = driver.getCurrentUrl();
		System.out.println(c_url);
		
		//Firefox launch
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d1 = new Dimension(600,300);
		driver1.manage().window().setSize(d1);
		driver1.get("https://www.facebook.com");
		Thread.sleep(5000);
		String title1 = driver1.getTitle();
		System.out.println(title1);
		String P_src1 = driver1.getPageSource();
		System.out.println(P_src1);
		String c_url1 = driver1.getCurrentUrl();
		System.out.println(c_url1);
		
		//MSedge Launch
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		WebDriver driver2=new EdgeDriver();
		driver2.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d2 = new Dimension(600,300);
		driver1.manage().window().setSize(d2);
		driver2.get("https://www.facebook.com");
		Thread.sleep(5000);
		String title2 = driver2.getTitle();
		System.out.println(title2);
		String P_src2 = driver2.getPageSource();
		System.out.println(P_src2);
		String c_url2 = driver2.getCurrentUrl();
		System.out.println(c_url2);
	}

}
