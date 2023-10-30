package Chrome_RTP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_clse {
	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_F4);

}
}