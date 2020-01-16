package tests;

//import com.relevantcodes.extentreports.LogStatus;
//import org.apache.thrift.TException;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.math3.analysis.function.Add;
import org.testng.annotations.Test;
import pages.AddUserAdminPage;
import utils.TestBase;

import java.util.logging.Logger;

public class AddUserAdminTest extends TestBase {
    private static final Logger LOGGER=Logger.getLogger(String.valueOf(AddUserAdminTest.class));
    @Test(priority=1, enabled=true)
    public static void addUserTest()throws Exception{
        Tests.testGenderlInformation();
       LOGGER.info("login");
        extentTest.log(LogStatus.PASS, "Login Successfully");
        implicitWait(3);

        AddUserAdminPage.clickAdmin();
       LOGGER.info("Admin clicked");
        extentTest.log(LogStatus.PASS, " Admin clicked");


        AddUserAdminPage.clickUserManagement();
        LOGGER.info("User Management clicked");
        extentTest.log(LogStatus.PASS, "User Management clicked");

//        AddUserAdminPage.clickUser();
//        LOGGER.info("User clicked");
//        implicitWait(3);


        AddUserAdminPage.clickAddUser();
        LOGGER.info("Add button clicked");
        extentTest.log(LogStatus.PASS, "Add button clicked");
        implicitWait(5);

        AddUserAdminPage.setDropDownOption("Admin");
        implicitWait(3);
        LOGGER.info("Set user role");
   //     extentTest.log(LogStatus.PASS, "User role selected");

        AddUserAdminPage.setEmpName("Mithshan");
        LOGGER.info("Employee name entered");
        extentTest.log(LogStatus.PASS, "Employee name entered");

        AddUserAdminPage.setUserName("mshan");

        AddUserAdminPage.setUserStatus("Enabled");

        AddUserAdminPage.setPassword("123");

        AddUserAdminPage.setConformPassword("123");

        AddUserAdminPage.clickSave();

        extentReport.endTest(extentTest);
        //softAssert.assertAll();


    }


}
