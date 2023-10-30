package Browser_launch;

import org.openqa.selenium.edge.EdgeDriver;

public class MS_edge {
	public static void main(String[] args) {
		String key ="webdriver.edge.driver";
		String value ="./softwares/msedgedriver.exe";
		System.setProperty(key, value);
		EdgeDriver driver = new EdgeDriver();
	}

}
