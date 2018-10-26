package auto1Pack;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	
	static void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }
	
	
	static void CheckYearCar(WebDriver driver) {
		if (driver.getPageSource().contains("2014"))
		{
				return;		}
		else
		{
			System.out.println("A car from 2014 is present on this page");
				return;
	
		}
	}
	
		 
	 static void GatherPrices (WebDriver driver) {
			List<WebElement> price = driver.findElements(By.cssSelector("[class='totalPrice___3yfNv'][data-qa-selector='price'")); 
			ArrayList strings = new ArrayList<String>();
				for(int i=0; i<price.size(); i++){
					strings.add(price.get(i).getText()); 
					
			ArrayList<String> copystrings = new ArrayList(strings);
			Collections.sort(copystrings, Collections.reverseOrder());
			
			if (copystrings.equals(strings)) {
				return;
			}
			
			else
				System.out.println("Prices are not sorted correctly");
				return; }
		return;
		 
		 
		 
	 }
	 
	 
}

