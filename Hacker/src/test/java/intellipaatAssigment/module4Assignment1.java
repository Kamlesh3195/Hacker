package intellipaatAssigment;
/*1. Automate Facebook Registration Page using Direct Locator's in Chrome
Browser https://www.facebook.com/
2. Automate dropdowns part of Facebook Registration Page using Direct
Locator's in Firefox Browser- https://www.facebook.com/*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class module4Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
        Thread.sleep(10);
        driver.findElement(By.name("firstname")).sendKeys("Kamlesh");
        driver.findElement(By.name("lastname")).sendKeys();
    }

}
