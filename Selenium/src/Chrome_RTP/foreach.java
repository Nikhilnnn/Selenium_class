package Chrome_RTP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class foreach {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LB561LN/OneDrive%20-%20EY/Desktop/chk.html");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    List<WebElement> checks = driver.findElements(By.xpath("//input[@ type='checkbox']"));
	    int count = checks.size();
	    System.out.println(count);
	    
	    for (WebElement check: checks) 
	    {
	    	 check.click();
		}
	    
	     for(int i=count-1; i>=0;i--)
	    {
	    	WebElement check = checks.get(i);
	    	Thread.sleep(500);
	    	 check.click();
	    }
	    driver.quit();
	}

}
