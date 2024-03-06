package intellipaatAssigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class module3Assignment1 {
/*1. TC-1 launch Chrome browser
2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
3. TC-3 maximize the browser window
4. TC-4 get the title of page
5. TC-5 click on know more link text
6. TC-6 switch from 0th window to 1st window
7. TC-7 after switching get the title of page
8. TC-8 switch from 1st window to 0th window
9. TC-9 after switching, get the title of page
10. TC-10 close all windows of the browser*/
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        driver.manage().window().maximize();
        driver.getTitle();
        driver.switchTo().frame(driver.findElement(By.name("login_page")));
        driver.findElement(By.partialLinkText("Know M")).click();
        ArrayList<String> allWindowHandles  = new ArrayList<>(driver.getWindowHandles());
        for(String handle:allWindowHandles)
        {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
        }
        driver.navigate().back();
        driver.quit();
    }
}
