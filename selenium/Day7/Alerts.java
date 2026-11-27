package mani;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.*;


public class Alerts {

            public static void main(String[] args) throws InterruptedException {

                WebDriver driver = new ChromeDriver();

                driver.manage().window().maximize();
                driver.get("https://the-internet.herokuapp.com/javascript_alerts");

                // 1. Simple alert (OK only)
                driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
                Alert alert = driver.switchTo().alert();
                System.out.println("Alert text: " + alert.getText());
                sleep(3000);
                alert.accept();
                

                // 2. Confirm alert (OK / Cancel)
                driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
                Alert confirm = driver.switchTo().alert();
                System.out.println("Confirm text: " + confirm.getText());
                sleep(3000);
                confirm.dismiss();   // Cancel; use accept() for OK
                

                // 3. Prompt alert (text box + OK / Cancel)
                driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
                Alert prompt = driver.switchTo().alert();
                System.out.println("Prompt text: " + prompt.getText());
                sleep(5000);
                prompt.sendKeys("Hello Selenium");
                sleep(3000);
                prompt.accept();
                
                driver.quit();
            }
        }

