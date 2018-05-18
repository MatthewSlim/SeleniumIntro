package SeleniumIntro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Widgets {
    private static WebDriver driver;

    @Before
    public void setup() {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test

    public void Accordion() throws InterruptedException {
        driver.get("http://demoqa.com/accordion/");
        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        WebElement section2 = driver.findElement(By.id("ui-id-6"));
        section2.click();
        Thread.sleep(2000);

        WebElement section3 = driver.findElement(By.id("ui-id-8"));
        section3.click();
        Thread.sleep(2000);

        WebElement section4 = driver.findElement(By.id("ui-id-10"));
        section4.click();
        Thread.sleep(2000);
    }

    @Test

    public void Autocomplete() throws InterruptedException {

        driver.get("http://demoqa.com/autocomplete/");
        driver.manage().window().fullscreen();

        WebElement input = driver.findElement(By.id("tagss"));
        input.sendKeys("J");
        Thread.sleep(2000);
        input.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
        Thread.sleep(3000);



      /*  WebElement selectTag = driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]"));
        selectTag.click();
        Thread.sleep(2000); */
    }

    @Test

    public void Datepicker() throws InterruptedException {
        driver.get("http://demoqa.com/datepicker/");
        driver.manage().window().fullscreen();
        Actions builder = new Actions(driver);

        WebElement showCalendar = driver.findElement(By.id("datepicker1"));
        showCalendar.click();
        Thread.sleep(1000);

        WebElement selectDate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a"));
        selectDate.click();
        Thread.sleep(3000);


    }


    @After
    public void tearDown() {
        driver.quit();
    }

}

