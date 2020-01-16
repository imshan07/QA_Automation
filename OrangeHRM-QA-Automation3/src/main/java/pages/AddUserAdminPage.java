package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.PageBase;

public class AddUserAdminPage extends PageBase {
    private static By btnAdmin=By.id("menu_admin_viewAdminModule");
    private static By btnUserManagement=By.id("menu_admin_UserManagement");
    private static By btnUser=By.id("menu_admin_viewSystemUsers");
    private static By btnAddUser=By.xpath("//*[@id=\"btnAdd\"]");
    private static By userRole = By.name("systemUser[userType]");
    private static By empName=By.xpath("//*[@id=\"systemUser_employeeName_empName\"]");
    private static By userName= By.xpath("//*[@id=\"systemUser_userName\"]");
    private static By userStatus=By.xpath("//*[@id=\"systemUser_status\"]");
    private static By password=By.xpath("//*[@id=\"systemUser_password\"]");
    private static By conformPassword=By.xpath("//*[@id=\"systemUser_confirmPassword\"]");
    private static By btnSave=By.xpath("//*[@id=\"btnSave\"]");




    public static void clickAdmin() {
        getDriver().findElement(btnAdmin).click();
    }
    public static void clickUserManagement() {
        getDriver().findElement(btnUserManagement).click();
    }
    public static void setDropDownOption(String option)
    {
        Select dropDownOption = new Select(getDriver().findElement(userRole));
        dropDownOption.selectByVisibleText(option);
    }
    public static void clickUser() {
        getDriver().findElement(btnUser).click();
    }
    public static void clickAddUser() {
        getDriver().findElement(btnAddUser).click();
    }
    public static void setUserRole(String selectUserRole) {

        getDriver().findElement(userRole).sendKeys(selectUserRole);
    }
    public static void setEmpName(String employeeName) {

        getDriver().findElement(empName).sendKeys(employeeName);
    }
    public static void setUserName(String Username){
        getDriver().findElement(userName).sendKeys(Username);
    }
    public static void setUserStatus(String statusType) {
        Select dropDownOption = new Select(getDriver().findElement(userStatus));
        dropDownOption.selectByVisibleText(statusType);
    }
    public static void setPassword(String Password){
        getDriver().findElement(password).sendKeys(Password);
    }
    public static void setConformPassword(String passwordConform){
        getDriver().findElement(conformPassword).sendKeys(passwordConform);
    }
    public static void clickSave() {
        getDriver().findElement(btnSave).click();
    }


}
