package SeleniumIntro;

import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import org.junit.experimental.theories.Theories;
        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.interactions.Actions;

        import static org.junit.Assert.assertEquals;

public class MouseActions {

    private static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void draggableMouseActionOne() throws InterruptedException {
        driver.get("http://demoqa.com/");
        driver.manage().window().fullscreen();

        WebElement draggableMenuButton = driver.findElement(By.id("menu-item-140"));
        draggableMenuButton.click();
        Thread.sleep(2000);
        WebElement draggableBox = driver.findElement(By.id("draggable"));

        Actions builder = new Actions(driver);
        builder.clickAndHold(draggableBox).moveByOffset(50,50).perform();
        Thread.sleep(3000);
    }

    @Test
    public void dropMouseAction() throws InterruptedException {
        driver.get("http://demoqa.com/");
        driver.manage().window().fullscreen();

        WebElement dropMouseAction = driver.findElement(By.id("menu-item-141"));
        dropMouseAction.click();
        Thread.sleep(2000);

        WebElement draggable = driver.findElement(By.id("draggableview"));
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(draggable, 160,48).perform();
        Thread.sleep(2000);
    }

    @Test
    public void resizableAction() throws InterruptedException {
        driver.get("http://demoqa.com/");
        driver.manage().window().fullscreen();

        WebElement locateResizable = driver.findElement(By.id("menu-item-143"));
        locateResizable.click();
        Thread.sleep(2000);

        WebElement resize = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        resize.click();
        Actions builder = new Actions(driver);
        builder.clickAndHold().moveByOffset(100, 100).perform();
        Thread.sleep(2000);
    }

    @Test
    public void selectableAction() throws InterruptedException {
        driver.get("http://demoqa.com/");
        driver.manage().window().fullscreen();

        WebElement locateSelectable = driver.findElement(By.id("menu-item-142"));
        locateSelectable.click();
        Thread.sleep(1000);

        WebElement selectOne = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
        selectOne.click();
        Thread.sleep(1000);
        WebElement selectTwo = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
        selectTwo.click();
        Thread.sleep(1000);
        WebElement selectThree = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
        selectThree.click();
        Thread.sleep(1000);
        WebElement selectFour = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
        selectFour.click();
        Thread.sleep(2000);

        WebElement selectFive = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]"));

        Actions builder = new Actions(driver);
        builder.dragAndDropBy(selectFive, 90,90).release().perform();
        Thread.sleep(2000);

    }

    @Test

    public void sortableAction() throws InterruptedException {

        driver.get("http://demoqa.com/sortable/");
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        Actions builder = new Actions(driver);

        WebElement Item1 = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
        builder.clickAndHold(Item1).moveByOffset(0,80).release().perform();
        Thread.sleep(5000);

        WebElement Item7 = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[7]"));
        builder.clickAndHold(Item7).moveByOffset(0, -70).release().perform();
        Thread.sleep(6000);
    }



    @After
    public void tearDown() {
        driver.quit();
    }

}