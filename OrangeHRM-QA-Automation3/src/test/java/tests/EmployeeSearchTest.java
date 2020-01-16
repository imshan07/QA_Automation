package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;
import pages.EmployeeSearch;
import utils.TestBase;

import java.util.logging.Logger;

public class EmployeeSearchTest extends TestBase {
    private static final Logger LOGGER=Logger.getLogger(String.valueOf(AddUserAdminTest.class));
    @Test(priority=1, enabled=true)
    public static void addUserTest()throws Exception{
        Tests.testGenderlInformation();
        LOGGER.info("login");
        extentTest.log(LogStatus.PASS, "Login clicked");


        EmployeeSearch.clickPIM();
        LOGGER.info("PIM clicked");
        extentTest.log(LogStatus.PASS, "PIM clicked");


        EmployeeSearch.clickEmployeeList();
        LOGGER.info("employee list clicked");
        extentTest.log(LogStatus.PASS, "emp list clicked");

        implicitWait(3);

        EmployeeSearch.setEmployeeName("Mithushan");
        LOGGER.info("enter employee name");
        extentTest.log(LogStatus.PASS, "emp name clicked");


        EmployeeSearch.setEmpId("Emp001");
        LOGGER.info("enter employee id");
        extentTest.log(LogStatus.PASS, "emp id clicked");


        EmployeeSearch.setEmpStatusDropdown("Freelance");
        LOGGER.info("set status");

        implicitWait(3);

        EmployeeSearch.setInclude("Past Employees Only");
        LOGGER.info("set include");

        implicitWait(3);

        EmployeeSearch.setSuperviorName("john");
        LOGGER.info("supervisorname");

        implicitWait(3);

        EmployeeSearch.setJobTitle("IT Manager");
        LOGGER.info("job title");

        implicitWait(3);

        EmployeeSearch.setSubUnit("Sales");
        LOGGER.info("subunit");

        implicitWait(3);

        EmployeeSearch.clickSearch();
        LOGGER.info("click search");

        implicitWait(3);
}


}

