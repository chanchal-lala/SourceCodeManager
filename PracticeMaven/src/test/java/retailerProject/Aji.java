package retailerProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Aji {
  @Test
  public void ajiotest() throws InterruptedException
  {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening ajio", true);
	  driver.get("https://www.ajio.com/");
	  Thread.sleep(7000);
	  driver.close();
  }
}
