
package automationfinal;




import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestThree {
	
	
	WebDriver driver;
	@Before
	public void init() throws Exception {
	
	
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test
		public void toggleRemoveAllValidation1()  {
			WebElement Toggle_Remove_All_Element;
			Toggle_Remove_All_Element = driver.findElement(By.name("removeAll"));
			Toggle_Remove_All_Element.click();
			WebElement Toggle_Truck_MODEL_Element;
			Toggle_Truck_MODEL_Element = driver.findElement(By.name("removeAll"));
			
			
			Assert.assertEquals(true, Toggle_Truck_MODEL_Element.isSelected());
			System.out.println("remove all truck model – Assert passed");
		}
	
	    @After
	     public void tearDown() {
			
			driver.close();
            driver.quit();
		}


}
