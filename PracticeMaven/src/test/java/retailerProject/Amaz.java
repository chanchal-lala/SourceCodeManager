package retailerProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amaz {
  @Test
  public void amazontest() throws InterruptedException
  {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening amazon", true);
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(7000);
	  driver.close();
	  
  }
}
