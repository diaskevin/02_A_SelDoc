package selenium3.d_WebDriver_methods;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class F_driver_findElement_Test_COs {
		WebDriver driver;
		@Test
		public void find_element() {
			System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Family\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeOptions);

			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Family\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();

			driver.get("https://google.com");
	        	driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]")).click();
            	driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);        		
	        String url = driver.getTitle();
	        System.out.println("url :" +url);
	        driver.quit();
	}	
}