package qa.Tests;

import Pages.ManageProjectPage.AddProject;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.utils.Constants;
import pageobjects.utils.PageBase;
import qa.utils.TestBase;

public class AddProjectTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddProjectTest.class);


    @Test(groups = "REGRESSION", priority = 1, testName = "AddProTestFirst")
    public void AddProTestFirst() {
        extentTest = extentReport.startTest("add project test");
        softAssert = new SoftAssert();
        AddProject.clickManageBtn();
        extentTest.log(LogStatus.PASS, "click manage button");
        AddProject.clickAddBtn();
        extentTest.log(LogStatus.PASS, "click Add button");
        AddProject.AddProjectDplay();
        extentTest.log(LogStatus.PASS, "AddProjectDisplay");
        AddProject.setSetProjectId(Constants.projectid);
        extentTest.log(LogStatus.PASS, "SetProjectID");

        AddProject.setSetProjectName(Constants.projectname);
        extentTest.log(LogStatus.PASS, "set project name");
        AddProject.setSetType(Constants.type);
        extentTest.log(LogStatus.PASS, "setType");
        AddProject.setSetStartDate();
        extentTest.log(LogStatus.PASS, "StartDate");
        AddProject.SetinputStartDate(Constants.startdate);
        extentTest.log(LogStatus.PASS, "inputStartDate");
        AddProject.setSetEndDateDate();
        extentTest.log(LogStatus.PASS, "Enddate");
        AddProject.setinputEndDateDate(Constants.enddate);
        extentTest.log(LogStatus.PASS, "inputenddate");
        AddProject.setSetDuration(Constants.duration);
        extentTest.log(LogStatus.PASS, "setDuration");
        AddProject.setSetStatus(Constants.status);
        extentTest.log(LogStatus.PASS, "setStatus");
        PageBase.implicitWait(2);

        AddProject.clickOkbtn();
        extentTest.log(LogStatus.PASS, "click ok button");
        softAssert.assertTrue(AddProject.getAddTexttt().contains(Constants.type),
                "Invlaid Message");
        LOGGER.info("teaxt are equals");

        extentTest.log(LogStatus.PASS, "text are equals");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }


}
