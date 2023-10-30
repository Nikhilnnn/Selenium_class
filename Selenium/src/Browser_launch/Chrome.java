package Browser_launch;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver= new ChromeDriver();
		//driver.get(url);
		driver.manage().window().maximize();
		Dimension d = new Dimension(800,400);
		driver.manage().window().setSize(d);
		new Point(0, 0);
		
	
	}

}
