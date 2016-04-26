package Tests;

import Pages.RozetkaLoginPage;
import SetUp.SetUp;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Игорь on 19.04.2016.
 */
public class RozetkaLogin {
    WebDriver driver;
    String expectedUserName = "testjavaqa";
    String userEmail = "utes4all@gmail.com";
    String userPassword = "test12345";

    @Before
    public void setUp(){
        SetUp setUp = new SetUp();
        driver = setUp.getDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void RozetkaLogin() throws InterruptedException {
        //this is login test for Rozetka
        //Second commit
        RozetkaLoginPage loginPage = new RozetkaLoginPage(driver);
        loginPage.login(userEmail, userPassword);
        Thread.sleep(1000);
        Assert.assertTrue(loginPage.checkUserNameAfterLogin(expectedUserName));
    }

}
