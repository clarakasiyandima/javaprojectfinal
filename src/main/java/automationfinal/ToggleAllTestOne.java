package automationfinal;


	import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;



	public class ToggleAllTestOne {
		// declaring a global variable
		WebDriver driver;

		@Before
		public void init() {
			// getting the webdriver
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get("https://techfios.com/test/101/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

		}

		@Test
			public void toggleClickValidation()  {
				WebElement Toggle_Check_Element;
				Toggle_Check_Element = driver.findElement(By.name("allbox"));
				Toggle_Check_Element.click();
				WebElement Toggle_CAR_MODEL_Element;
				Toggle_CAR_MODEL_Element = driver.findElement(By.name("todo[8]"));
				
				 // Validate when the toggle 
				//all check box is CHECKED, all check boxes for list items are
				//also CHECKED ON
				Assert.assertEquals(true, Toggle_CAR_MODEL_Element.isSelected());
				System.out.println("car model toggle button is selected – Assert passed");
				
		}
		

		@After
		public void tearDown() {
			driver.close();
			driver.quit();
		}

	}

