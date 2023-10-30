package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cht_g {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LB561LN/OneDrive%20-%20EY/Desktop/file.html");
		WebElement fileInput = driver.findElement(By.id("a1")); // Replace with the actual ID or other locator of the file input element
		Thread.sleep(2000);
		fileInput.click();

	}

}
