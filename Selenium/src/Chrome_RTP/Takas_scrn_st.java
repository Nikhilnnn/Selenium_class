package Chrome_RTP;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takas_scrn_st {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File temp=tss.getScreenshotAs(OutputType.FILE);
		File prt = new File("./ScreenST/amazon.png");
		FileHandler.copy(temp, prt);
		
		

	}

}
