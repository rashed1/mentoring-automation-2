package commonAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Rashed on 1/5/2016.
 */
public class Base {

    public WebDriver driver = null;

    @BeforeMethod

    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to("http://www.bestbuy.com");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

    //helper methods

    //click on css

    public void clickOnCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }

    //type by css

    public void typeByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }



    // sleep methods to add intervals between tests
    public void sleepFor(int sec) throws InterruptedException{
        Thread.sleep(1000*sec);
    }

}
