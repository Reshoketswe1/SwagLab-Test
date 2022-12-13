package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class TestMain {

    WebDriver driver;

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "https://www.opencart.com/");
        driver.get("https://www.opencart.com/index.php?route=account/register");
    }


    public void login2() {
        try {
            //driver.findElement(By.id("block-customer-login-heading"));
            driver.findElement(By.id("input-username")).sendKeys("Shoki2");
            Thread.sleep(3000);
            driver.findElement(By.name("input-firstname")).sendKeys("Reshoketswe");
            Thread.sleep(3000);
            driver.findElement(By.name("input-lastname")).sendKeys("Makgamatha");
            Thread.sleep(3000);
            driver.findElement(By.name("input-email")).sendKeys("makgamathareshoketswe@gmail.com");
            Thread.sleep(3000);
            driver.findElement(By.name("input-country")).sendKeys("South Africa");
            Thread.sleep(3000);
            driver.findElement(By.name("input-password")).sendKeys("7777Mercy");
            Thread.sleep(3000);
            driver.findElement(By.id("send2")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }

        public void j (){
            driver.close();//Closes only the opened window
            driver.quit(); // Closes every associated window which was opened by selenium
        }

    }
}