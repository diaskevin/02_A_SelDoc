package api_By_findElement.methods;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geText_test {
    WebDriver driver;
    @Test
    public void geText_test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Family\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.GMAIL.COM");
        String pageHeader = driver.findElement(By.tagName("h1")).getText();
        System.out.println("tagName 'h1': " + pageHeader);
        driver.quit();
    }
}
