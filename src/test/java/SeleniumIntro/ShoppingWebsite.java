package SeleniumIntro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.lang.Thread.sleep;


public class ShoppingWebsite {

        private static WebDriver driver;

        @Before
        public void setup(){
            //System.setProperty("webdriver.chrome.driver", "C:/development/web_driver/chromedriver.exe");
            driver = new ChromeDriver();
        }

        @Test
        public void exampleSelenium() throws InterruptedException {
            driver.manage().window().fullscreen();
            Thread.sleep(1000);
            driver.get("http://automationpractice.com/index.php");
            Thread.sleep(1000);
            WebElement enterSearch = driver.findElement(By.id("search_query_top"));
            enterSearch.sendKeys("Blouse");
            Thread.sleep(1000);
            WebElement clickSearch = driver.findElement(By.name("submit_search"));
            clickSearch.click();
            Thread.sleep(2000);
            driver.get("http://automationpractice.com/index.php?id_product=2&controller=product&search_query=Blouse&results=1");
            Thread.sleep(5000);

        }

        @After
        public void tearDown(){
            driver.quit();
        }

    }




