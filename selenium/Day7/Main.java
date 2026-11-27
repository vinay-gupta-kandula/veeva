package mani;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        // Launch Browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open Website
        driver.get("https://the-internet.herokuapp.com/windows");

        Thread.sleep(4000);

        // Get Parent Window ID
        String parentWindow = driver.getWindowHandle();
        // Click Click Here Link
        driver.findElement(By.linkText("Click Here")).click();

        Thread.sleep(5000);

        // Get All Window IDs
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to Child Window
        for (String window : allWindows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo().window(window);

                System.out.println("Child Window Title: "
                        + driver.getTitle());

                // Close Child Window
                driver.close();

                break;
            }
        }

        // Switch Back to Parent Window
        driver.switchTo().window(parentWindow);

        System.out.println("Parent Window Title: "
                + driver.getTitle());

        // Close Browser
        driver.quit();
    }
}
