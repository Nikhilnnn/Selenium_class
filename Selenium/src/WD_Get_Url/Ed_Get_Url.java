package WD_Get_Url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ed_Get_Url {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}

}
