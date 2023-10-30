package Browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ch_Fr_Ed {
	
public static void main(String[] args) {
	
	//chrome launch
	String key="webdriver.chrome.driver";
	String value="./softwares/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver = new ChromeDriver();
	
	//firefox launch
	String key1="webdriver.gecko.driver";
	String value1="./softwares/geckodriver.exe";
	System.setProperty(key1, value1);
	FirefoxDriver driver1 = new FirefoxDriver();
	
	//MSedge launch
	String key2="webdriver.edge.driver";
	String value2="./softwares/msedgedriver.exe";
	System.setProperty(key2, value2);
	EdgeDriver driver2 = new EdgeDriver();
}

}
