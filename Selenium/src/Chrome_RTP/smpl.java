package Chrome_RTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class smpl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.get("file:///C:/Users/LB561LN/OneDrive%20-%20EY/Desktop/Fb.html");
//		Thread.sleep(2000);
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("a1")).click();
		//driver.findElement(By.name("n1"));
		//driver.findElement(By.className("c1"));
		//driver.get("https://www.youtube.com");
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		//driver.get("https://www.facebook.com");
//		driver.findElement(By.id("email")).sendKeys("nikhil123@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("nikhil123");
//		driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("P")).click();
		//driver.findElement(By.cssSelector("input[id='search']")).sendKeys("salaar teaser");
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("a[class=['yt-simple-endpoint metadata-snippet-timestamp style-scope ytd-video-renderer']")).click();
		//driver.findElement(By.cssSelector("img[src='https://i.ytimg.com/vi/bUR_FKt7Iso/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLC7O2DInxLLArM2QqBx79Uy_ZlfKw']")).click();
		//driver.findElement(By.cssSelector("button[class='yt-spec-button-shape-next yt-spec-button-shape-next--tonal yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-leading yt-spec-button-shape-next--segmented-start ']")).click();
	    //Thread.sleep(2000);
	    //driver.findElement(By.cssSelector("a[aria-label='Sign in']")).click();
	   //driver.findElement(By.cssSelector("button[aria-label='like this video along with 2,352,736 other people']")).click();
	    //driver.findElement(By.cssSelector("div[id='segmented-like-button']")).click();
	    //driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hii");
		driver.findElement(By.xpath("//td[.='300 Crore']/../../tr[2]/td[1]/strong[1]")).click();
		
	}
}
 