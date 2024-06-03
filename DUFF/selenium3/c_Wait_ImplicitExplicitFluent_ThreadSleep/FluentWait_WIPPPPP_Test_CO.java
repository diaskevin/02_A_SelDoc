
//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html#withTimeout(java.time.Duration)


package selenium3.c_Wait_ImplicitExplicitFluent_ThreadSleep;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

	public class FluentWait_WIPPPPP_Test_CO {
		private WebDriver driver;
		
		@BeforeAll
	    public void fluentWait1() {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Family\\Desktop\\Rakesh\\Resource\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		@Test
		public void Search_Cheese() {
	            driver.get("https://google.com");
	    	   
	    		//WebDriverWait wait = new WebDriverWait(driver,30);
	    		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type = 'submit']")));
	    		
	    		 // Waiting 30 seconds for an element to be present on the page, checking
	    		   // for its presence once every 5 seconds.
	    		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    		       .withTimeout(Duration.ofSeconds(30))
	    		       .pollingEvery(Duration.ofSeconds(5))
	    		       .ignoring(NoSuchElementException.class);

	    		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	    		     public WebElement apply(WebDriver driver) {
	    		       return driver.findElement(By.id("foo"));
	    		     }
	    		   });
	     
	            driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);        		
	    
	            
	            
	            	String url = driver.getTitle();
	            	System.out.println(url);
	            	Assert.assertEquals("Title ok" ,"cheese - Google Search", url);
				}
		
		
		@AfterAll
	     public void quit() {
	            	driver.quit();
	        		}
	    }