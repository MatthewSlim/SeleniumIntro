package SeleniumIntro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travels {

    private static WebDriver driver;

    @Before
    public void setup() {
        //System.setProperty("webdriver.chrome.driver", "C:/development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void exampleSelenium() throws InterruptedException {
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("https://www.phptravels.net/");
        Thread.sleep(1000);

        WebElement enterSearch = driver.findElement(By.tagName("input"));
        enterSearch.sendKeys("London");
        Thread.sleep(1000);
        WebElement completeSearch = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]"));
        completeSearch.click();
        Thread.sleep(3000);

        WebElement checkIn = driver.findElement(By.name("checkin"));
        checkIn.click();
        checkIn.clear();
        checkIn.sendKeys("20/05/2018");
        Thread.sleep(3000);

        WebElement checkOut = driver.findElement(By.name("checkout"));
        checkOut.click();
        checkOut.clear();
        checkOut.sendKeys("22/05/2018");
        Thread.sleep(3000);

        WebElement adultNumber = driver.findElement(By.id("adults"));
        adultNumber.click();
        adultNumber.sendKeys("3");
        adultNumber.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        WebElement search = driver.findElement(By.xpath("//*[@id=\"HOTELS\"]/form/div[3]/div[3]/button"));
        search.click();
        Thread.sleep(5000);

        WebElement details = driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div[3]/div/table/tbody/tr/td/div[2]/div/div[5]/a/button"));
        details.click();
        Thread.sleep(2000);


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
