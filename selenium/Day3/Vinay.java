package raju;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class Vinay {
    static WebDriver driver;                                   // current browser
    static List<WebDriver> allDrivers = new ArrayList<>();     // keeps every opened browser

    public static void main(String[] args) throws InterruptedException {
        anjineya();
    }

    static void anjineya() throws InterruptedException {
        driver = new ChromeDriver();
        allDrivers.add(driver);
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        veera();
        kan();
        ram();
    }

    static void veera() throws InterruptedException {
        driver = new EdgeDriver();
        allDrivers.add(driver);
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    static void kan() throws InterruptedException {
        driver = new FirefoxDriver();
        allDrivers.add(driver);
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    static void ram() {
        for (WebDriver d : allDrivers) {
            d.quit();
        }
        allDrivers.clear();
    }
}

