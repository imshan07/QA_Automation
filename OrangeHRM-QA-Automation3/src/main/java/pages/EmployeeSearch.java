package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.PageBase;

public class EmployeeSearch extends PageBase {
    private static By btnPIM = By.xpath("//*[@id=\"menu_pim_viewPimModule\"]");
    private static By btnEmployeeList= By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]");
    private static By employeeName= By.xpath("//*[@id=\"empsearch_employee_name_empName\"]");
    private static By empId= By.xpath("//*[@id=\"empsearch_id\"]");
    private static By empStatus= By.xpath("//*[@id=\"empsearch_employee_status\"]");
    private static By include=By.xpath("//*[@id=\"empsearch_termination\"]");
    private static By superviorName=By.xpath("//*[@id=\"empsearch_supervisor_name\"]");
    private static By jobTitle=By.xpath("//*[@id=\"empsearch_job_title\"]");
    private static By subUnit=By.xpath("//*[@id=\"empsearch_sub_unit\"]");
    private static By btnSearch=By.xpath("//*[@id=\"searchBtn\"]");



    public static void clickPIM(){
        getDriver().findElement(btnPIM).click();
    }
    public static void clickEmployeeList(){
        getDriver().findElement(btnEmployeeList).click();
    }
    public static void setEmployeeName(String setemployeeName){
        getDriver().findElement(employeeName).sendKeys(setemployeeName);
    }
    public static void setEmpId(String setId){
        getDriver().findElement(empId).sendKeys(setId);
    }
    public static void setEmpStatusDropdown(String setStatus){
        Select dropdownOption= new Select(getDriver().findElement(empStatus));
        dropdownOption.selectByVisibleText(setStatus);
    }
    public static void setInclude(String setInclude){
       Select dropdownOption = new Select(getDriver().findElement(include));
       dropdownOption.selectByVisibleText(setInclude);
    }
    public static void setSuperviorName(String Supname){
        getDriver().findElement(superviorName).sendKeys(Supname);
    }
    public static void setJobTitle(String setInclude){
        Select dropdownOption = new Select(getDriver().findElement(jobTitle));
        dropdownOption.selectByVisibleText(setInclude);
    }
    public static void setSubUnit(String setsubunit){
        Select dropdownOption=new Select(getDriver().findElement(subUnit));
        dropdownOption.selectByVisibleText(setsubunit);
    }
    public static void clickSearch(){
        getDriver().findElement(subUnit).click();
    }
}
