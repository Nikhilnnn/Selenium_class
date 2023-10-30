package Web_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ch_Fr_Ed_Close {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.close();
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.close();
		
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		WebDriver driver2=new EdgeDriver();
		driver2.close();
	}
}
