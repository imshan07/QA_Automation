package pages;

import org.openqa.selenium.By;
import utils.PageBase;

import java.util.logging.Logger;

public class VleLogin extends PageBase {
    private static final Logger LOGGER=Logger.getLogger(String.valueOf(VleLogin.class));

    private static By btnLogin= By.xpath("//*[@id=\"yui_3_17_2_1_1576765783829_216\"]");
    private static By  userName= By.xpath("//*[@id=\"username\"]");
    private static By password=By.xpath("//*[@id=\"password\"]");
    private static By btnLogin2=By.xpath("//*[@id=\"loginbtn\"]");


    public static void clickLogin(){
        getDriver().findElement(btnLogin).click();
        LOGGER.info("clicked main login");
    }

    public static void setUserName(String username){
        getDriver().findElement(userName).sendKeys(username);
        LOGGER.info("enter user name");
    }

    public static void setPassword(String mypassword){
        getDriver().findElement(password).sendKeys(mypassword);
        LOGGER.info("enter user password");
    }

    public static void clickLogin2(){
        getDriver().findElement(btnLogin2).click();
        LOGGER.info("clicked login");
    }

}
