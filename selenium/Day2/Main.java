package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Login']")).click();
        Thread.sleep(3000);
        JavascriptExecutor vinay=(JavascriptExecutor) driver;
        vinay.executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);
        driver.findElement(By.name("roll_no")).sendKeys("23P31A05G5");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("K4242vinay@");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        Thread.sleep(1500);

        driver.quit();
    }
}