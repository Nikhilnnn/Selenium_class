package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.xml.security.stax.securityEvent.KeyValueTokenSecurityEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class form_f {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Nikhil");
		driver.findElement(By.id("lastName")).sendKeys("v");
		driver.findElement(By.id("userEmail")).sendKeys("Nikhi@gmail.com");
		WebElement ele = driver.findElement(By.xpath("//input[@value='Male']"));
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement ele1 = driver.findElement(By.className("react-datepicker__month-select"));
		Select sel = new Select(ele1);
		sel.selectByValue("3");
		WebElement ele2 = driver.findElement(By.className("react-datepicker__year-select"));
		Select sel2 = new Select(ele2);
		sel2.selectByVisibleText("1996");
		//Thread.sleep(500);
		driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, April 16th, 1996']")).click();
		WebElement ele3=driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']"));
		//Thread.sleep(2000);
		ele3.click();
		//Thread.sleep(2000);
		ele3.sendKeys("e");
//		Thread.sleep(2000);
     Robot ro = new Robot();
     //ro.keyPress(KeyEvent.VK_E);
//	     
//	     ro.keyRelease(KeyEvent.VK_E);
//	     
     ro.keyPress(KeyEvent.VK_ENTER);
	     ro.keyRelease(KeyEvent.VK_ENTER);
//	     
		//ele3.sendKeys(Keys.ENTER);
	    // WebElement ele3 = driver.findElement(By.xpath("//input[@type='checkbox' and @id='hobbies-checkbox-2']"));
		//Actions act1 = new Actions(driver);
		//act1.doubleClick(ele3).perform();
		
		
		
		//driver.quit();react-datepicker__year-select
	}

}
