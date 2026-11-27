package mani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) throws InterruptedException {

        // Launch Browser (Selenium 4.6+ downloads the driver automatically)
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open Website
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        Thread.sleep(3000);

        // Switch to top frame
        driver.switchTo().frame("frame-top");
        Thread.sleep(5000);

        // Switch to left frame (nested inside top frame)
        driver.switchTo().frame("frame-left");

        // Get text
        String text = driver.findElement(By.tagName("body")).getText();
        System.out.println("Left Frame Text: " + text);
        Thread.sleep(5000);

        // Return to parent frame (top frame)
        driver.switchTo().parentFrame();
        Thread.sleep(5000);

        // Switch to middle frame
        driver.switchTo().frame("frame-middle");

        String middleText = driver.findElement(By.id("content")).getText();
        System.out.println("Middle Frame: " + middleText);
        Thread.sleep(5000);

        // Return to main page
        driver.switchTo().defaultContent();

        // Close Browser
        driver.quit();
    }
}

