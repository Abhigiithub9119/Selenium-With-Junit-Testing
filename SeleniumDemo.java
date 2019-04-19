import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo
{
	WebDriver driver = null;
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
    
	  @Test
    	public void testSearch()
    	{
    		driver.get("https:www.google.com");
    		driver.findElement(By.className("gLFyf")).sendKeys("pagalworld.com");
    		//driver.findElement(By.name("btnK")).click();
    		driver.findElement(By.name("btnK")).submit();
    		driver.findElement(By.className("LC20lb")).click();
    	}
		
		@After
		public void end()
		{
			driver.close();
		}
		 public static void main(String[] args)
		   {
			   SeleniumDemo sd =  new SeleniumDemo();
			   sd.testSearch();
		   }
  
}
