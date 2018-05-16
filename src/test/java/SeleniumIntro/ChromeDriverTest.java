package SeleniumIntro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.lang.Thread.sleep;

public class ChromeDriverTest {

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
        driver.get("http://thedemosite.co.uk/");
        Thread.sleep(1000);
        WebElement clickDatabase = driver.findElement(By.linkText("3. Add a User"));
        clickDatabase.click();
        Thread.sleep(2000);
        WebElement createUser = driver.findElement(By.name("username"));
        Thread.sleep(1000);
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("hello");
        WebElement createPass = driver.findElement(By.name("password"));
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("4444");
        WebElement submit = driver.findElement(By.name("FormsButton2"));
        submit.click();
        Thread.sleep(5000);
        WebElement clickLogin = driver.findElement(By.linkText("4. Login"));
        clickLogin.click();
        Thread.sleep(2000);
        WebElement loginUser = driver.findElement(By.name("username"));
        Thread.sleep(1000);
        WebElement username2 = driver.findElement(By.name("username"));
        username2.sendKeys("hello");
        WebElement createPass2 = driver.findElement(By.name("password"));
        Thread.sleep(1000);
        WebElement password2 = driver.findElement(By.name("password"));
        password2.sendKeys("4444");
        WebElement submit2 = driver.findElement(By.name("FormsButton2"));
        submit2.click();
        Thread.sleep(1000);

    }

    @After
        public void tearDown(){
        driver.quit();
    }

}
