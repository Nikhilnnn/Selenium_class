package Chrome_RTP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Txt_foreach {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LB561LN/OneDrive%20-%20EY/Desktop/Txtfld.html");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    List<WebElement> texts = driver.findElements(By.xpath("//input"));
	    int count = texts.size();
	    System.out.println(count);
	    
	    for (WebElement text: texts) 
	    {
	    	Thread.sleep(500);
	    	text.sendKeys("hi");
	    
		}
	    
	    driver.quit();
	}
	}


