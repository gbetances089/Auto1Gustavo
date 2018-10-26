package auto1Pack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Auto1Challenge {

	WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\padres\\eclipse-workspace\\Auto1\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	      
		driver.close();

	}

	@Test
	void test() {		
		//Goto Autohero page
			driver.get("https://www.autohero.com/de/search/");

		//Do the required search (cars from 2015+/Descending order
			driver.findElement(By.xpath("//*[contains(text(), 'Erstzulassung ab')]")).click();
			Methods.waitForLoad (driver);
			driver.findElement(By.name("yearRange.min")).sendKeys("2015");
			Methods.waitForLoad (driver);
			driver.findElement(By.name("sort")).sendKeys("Höchster Preis​");
			Methods.waitForLoad (driver);
		
		//Pagination
			/*String Amount = (driver.findElement(By.cssSelector("[class='resultsAmount___3OrV7'][data-qa-selector='results-amount'")).getText()); 
			This was to get the total of cars and divide by 24 to get the amount of the pagination
			List<WebElement> pagination = driver.findElements(By.xpath("/html//div[@id='app']/div[@class='page']/main/div[4]/div[@class='row']/div[@class='col-md-9']//div[@class='root___19NRv']"));
	        int s = pagination.size();
	        System.out.print(s);
	        This one you got the idea, but it always returned 1
	        This pagination got me, I couldn't break it and above are the some on the ideas I try, 
	        my suggestion for this is do it at the either at unit/API testing level or set unique id class for the pagination, of this could be little pieces of code.
	        */
			
	        
		// Check that cars from 2014 is no present on the page	
			Methods.CheckYearCar(driver);
			
			Methods.waitForLoad (driver);
		
		//Gathering and comparing prices
			Methods.GatherPrices(driver);
	}
		
}



