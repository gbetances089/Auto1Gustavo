package auto1Pack;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	
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

	 
	 static void CompareList(ArrayList A, ArrayList B) {
			if (A.equals(B)) { 
				return;}
			
			else {
				System.out.println("Prices are not sorted correctly");
			return;}
		}	
}

