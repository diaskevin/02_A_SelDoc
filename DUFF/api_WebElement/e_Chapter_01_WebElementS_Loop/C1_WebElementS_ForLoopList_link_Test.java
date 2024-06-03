package api_WebElement.e_Chapter_01_WebElementS_Loop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C1_WebElementS_ForLoopList_link_Test {
    @Test
    public void WebElementsList() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Family\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://www.google.com");
            // Get all the elements available with tag name of 'anchor links'
            List<WebElement> lotsOfelements = driver.findElements(By.tagName("a"));
            for (WebElement element : lotsOfelements) {
                System.out.println("Paragraph text:" + element.getText());
            }

        }

        catch(Exception e) {System.out.println(e);
        }

        finally {
            driver.quit();
        }
    }
}
