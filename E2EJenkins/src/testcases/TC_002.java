package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {
	@Test
	public static void TestCase()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()=\"English (UK)\"]")).click();;
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Hello");;
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Hellopass");
		driver.quit();
	}
}
