package org.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Sample2 {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/account/register/basicdetails");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("(//button[@name='userType'])[2]")).click();
	Thread.sleep(10000);
	WebElement element = driver.findElement(By.xpath("//input[@name='uploadCV']"));
	element.sendKeys("C:\\Users\\91770\\Desktop\\notes\\Extra qsns\\I_Broken Link and Images.pdf");
	Thread.sleep(10000);
	driver.quit();
	
}
}
