package tests;

import org.testng.annotations.Test;
import pages.VleLogin;
import utils.TestBase;

import java.util.logging.Logger;

public class VleLoginTest extends TestBase {

    @Test(priority = 1)
    public static void loginTest() throws Exception{
        Logger LOGGER= Logger.getLogger(String.valueOf(TestBase.class));

        VleLogin.clickLogin();
        LOGGER.info("login");
        implicitWait(3000);

        VleLogin.setUserName("iit15033");
        LOGGER.info("username");

        VleLogin.setPassword("Quantum007");
        LOGGER.info("username");

        VleLogin.clickLogin2();
        LOGGER.info("login");




    }
}
