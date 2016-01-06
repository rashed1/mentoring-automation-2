import commonAPI.Base;
import org.testng.annotations.Test;

/**
 * Created by Rashed on 1/5/2016.
 */
public class HomePageSearch extends Base{

    @Test
    public void test() throws InterruptedException{
        System.out.println("Test has started");
        typeByCss("#gh-search-input", "tv");
        sleepFor(3);
        clickOnCss(".search-button");
        System.out.println(driver.getCurrentUrl());
        System.out.println("Test has ended");
    }
    
}
