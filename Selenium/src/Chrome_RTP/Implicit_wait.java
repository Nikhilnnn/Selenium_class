package Chrome_RTP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Implicit_wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//amazon
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone13");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		WebElement pr = driver.findElement(By.xpath("//span[.='49,499']"));
		String txt = pr.getText();
		System.out.println(txt);
		//flipkar
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone13");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement pr1 = driver.findElement(By.xpath("//div[.='₹51,999']"));
		String txt1 = pr1.getText();
		System.out.println(txt1);
		
		String a=txt;
		String b=txt1;
	    String c=b.replace("₹","");
	    String c1=a.replace(",","");
	    String c2=c.replace(",","");
	    //System.out.println(c);
	   // System.out.println(c1);
	  //  System.out.println(c2);
	    
	    int c3=Integer.valueOf(c1);
	    int c4=Integer.valueOf(c2);
	    
	    //System.out.println(c3); 
	   // System.out.println(c4);
	    
	    if(c4>c3)
	    	
	    {
	    	System.out.println("lowest price is " + c3);
	    }
	    else
	    {
	    	System.out.println("Highst price is " + c4);
	    }
	   driver.quit();
	   
		
	    }
	
	}
