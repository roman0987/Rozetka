package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by utest4all on 21.04.16.
 */
public class SetUp {
    WebDriver driver;

    public WebDriver getDriver(){
        if(driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
