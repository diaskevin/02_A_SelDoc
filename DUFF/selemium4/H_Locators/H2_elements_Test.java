package selemium4.H_Locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class H2_elements_Test {
        @Test
        public void elements_Test() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Family\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            try {
                driver.get("https://example.com");
                //driver.get("https://www.bbc.co.uk/");


                // Get element with tag name 'div'
                WebElement element = driver.findElement(By.tagName("div"));

                // Get all the elements available with tag name 'p'
                List<WebElement> elements = element.findElements(By.tagName("p"));
                for (WebElement e : elements) {
                    System.out.println(e.getText()+"\n");
                }
            } finally {
                driver.quit();
            }
        }
    }