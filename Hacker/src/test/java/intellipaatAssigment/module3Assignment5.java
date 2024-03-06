package intellipaatAssigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*1. TC-1 launch Chrome browser
2. TC-2 go to test URL - https://www.google.com
3. TC-3 maximize the browser window
4. TC-4 get the URL of page
5. TC-5 navigate to test URL - https://www.selenium.dev/
6. TC-6 get the URL of page
7. TC-7 navigate back to test URL - https://www.google.com
8. TC-8 get the URL of page
9. TC-8 navigate one step forward to test URL - https://www.selenium.dev/
10. TC-9 get the URL of page
11.TC-10 refresh the current page
12. TC-11 get the URL of page
13. TC-12 close the browser*/
public class module3Assignment5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        driver.get("https://www.selenium.dev/");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        driver.quit();


    }
}
