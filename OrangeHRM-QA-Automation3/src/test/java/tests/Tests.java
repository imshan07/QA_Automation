package tests;


import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import utils.TestBase;

public class Tests extends TestBase {

    @Test(priority = 1,enabled=true)

    public static void testGenderlInformation() throws Exception {
        Logger LOGGER = Logger.getLogger(TestBase.class);
        {

            SoftAssert softAssert = new SoftAssert();
            //  softAssert.assertEquals(driver.findElement(By.xpath("//div[text()=\"LOGIN Panel\"]")).getText());
            softAssert.assertEquals(driver.findElement(By.xpath("//div[text()=\"LOGIN Panel\"]")).getText(), "Invalid First Element Text 1");
            LOGGER.info("login panel detected");

            LoginPage.setUserName("Admin");
            extentTest.log(LogStatus.PASS, "Enter The Username");
            LOGGER.info("admin entered");
            LoginPage.setPassword("admin123");
            extentTest.log(LogStatus.PASS, "Enter Password");
            LOGGER.info("Password entered");
            LoginPage.clickLogin();
            extentTest.log(LogStatus.PASS, "Login Button Clicked");
            LOGGER.info("login button clicked");


        }
    }
}
