package docs.searchContent.takeScreenShot.webElement.methods;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement_Clear_Test_ERR {
    WebDriver driver;
    @Test
    public void clear_test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Family\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.GMAIL.COM");
        driver.findElement(By.id("identifierId")).sendKeys("123ok");
        driver.findElement(By.id("identifierId")).clear();
        driver.quit();
    }
}