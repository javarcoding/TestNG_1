package qafox.TestNGListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



@Listeners(qafox.TestNGListener.MyEventHandler.class)
public class Demo 
{
	@Test
	public void testomayoTitle()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://Users/adsul/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.omayo.blogspot.com");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		driver.quit();
	}
	/*
	@Test
	public void testOmayoA() {
		
		Assert.fail();
		
	}
	*/
	@Test
	public void testOmayoB()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.omayo.blogspot.com");
		
		if (driver.getTitle().equals("omayo (QAfox.com)"))
		{
			throw new SkipException(null);
		}
		
		driver.quit();
		
	}
	
	
	
}
