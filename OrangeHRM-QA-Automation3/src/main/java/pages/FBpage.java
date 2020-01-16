package pages;

import org.openqa.selenium.By;
import utils.PageBase;

public class FBpage extends PageBase {

    private static By fname= By.xpath("//*[@id=\"u_0_m\"]");
    private static By sname= By.xpath("//*[@id=\"u_0_o\"]");
    private static By email= By.xpath("//*[@id=\"u_0_r\"]");


    public static void setFname(String firstname){
        getDriver().findElement(fname).sendKeys(firstname);
    }
    public static void setSname(String surname){
        getDriver().findElement(sname).sendKeys(surname);
    }
    public static void setEmail(String email1){
        getDriver().findElement(email).sendKeys(email1);
    }
}
