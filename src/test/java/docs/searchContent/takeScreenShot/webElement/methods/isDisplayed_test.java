package docs.searchContent.takeScreenShot.webElement.methods;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_test {
    WebDriver driver;
    @Test
    public void isDisplayed_test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Family\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.GMAIL.COM");
        boolean a = driver.findElement(By.id("identifierId")).isDisplayed();
        System.out.println(a);
        driver.quit();
    }
}