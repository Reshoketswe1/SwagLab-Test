package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
    public class Main {
            WebDriver driver;

            //setup
            public void a() {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }

            //Go to Swaglabs
            //Open homepage
            public void b() throws InterruptedException {
                driver.get("https://www.saucedemo.com/");
                Thread.sleep(2000);
            }
            //Log in with provided credentials
            public void c() {
                try {
                    driver.findElement(By.id("user-name")).sendKeys("standard_user");
                    Thread.sleep(3000);
                    driver.findElement(By.id("password")).sendKeys("secret_sauce");
                    Thread.sleep(3000);
                    driver.findElement(By.id("login-button")).click();
                }catch(Exception e){
                    e.printStackTrace(); //print anything that is wrong
                }
            }

            //verify login successful
            public void d() throws Exception{

                driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
                Thread.sleep(3000);

            }


            //Add item to cart
            public void e() {
                try {
                    driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.className("shopping_cart_link")).click();
                    Thread.sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            //Proceed to checkout
            public void f() throws Exception{
                driver.findElement(By.id("checkout")).click();
                Thread.sleep(3000);
            }

            //Enter checkout information
           public void g(){
               try {
                   driver.findElement(By.id("first-name")).sendKeys("Reshoketswe ");
                   Thread.sleep(3000);
                   driver.findElement(By.id("last-name")).sendKeys("Makgamatha");
                   Thread.sleep(3000);
                   driver.findElement(By.id("postal-code")).sendKeys("1809 ");
                   Thread.sleep(3000);
                   driver.findElement(By.id("continue")).click();
                   Thread.sleep(3000);
               }catch(Exception e){
                   e.printStackTrace(); //print anything that is wrong
               }
           }
          // Verify Checkout
          public void h() throws Exception{

              driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]"));
              Thread.sleep(3000);

          }
          //Finish
          public void i()throws Exception{
              driver.findElement(By.id("finish")).click();
              Thread.sleep(3000);
          }
            //Tear Down
            public void j(){
                driver.close();//Closes only the opened window
                driver.quit(); // Closes every associated window which was opened by selenium
            }

        }




