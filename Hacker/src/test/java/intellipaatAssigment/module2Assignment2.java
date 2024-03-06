package intellipaatAssigment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class module2Assignment2 {
/*1. TC-1 launch Chrome browser
2. TC-2 go to test URL https://www.google.com
3. TC-3 specify wait time for 5 sec
4. TC-4 get the title of page into console
5. TC-5 close the browser*/
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.getTitle());
        driver.quit();

    }

}
