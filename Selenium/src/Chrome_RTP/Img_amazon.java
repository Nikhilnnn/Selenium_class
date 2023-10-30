package Chrome_RTP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Img_amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    List<WebElement> imgs = driver.findElements(By.xpath("//img"));
	    int count = imgs.size();
	    System.out.println(count);
	    
	    for (WebElement  img: imgs) 
	    {
	    	 String imga = img.getAttribute("src");
	    	 System.out.println(imga);
	    }
	   
	   
	}
}


