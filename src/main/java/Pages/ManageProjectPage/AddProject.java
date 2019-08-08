package Pages.ManageProjectPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageobjects.utils.PageBase;

public class AddProject extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AddProject.class);
    private static By clickManageProject= By.xpath("//*[@href=\"#/project\"]");
    private static By clickAddProject= By.xpath("//*[@class=\"ant-btn ant-btn-primary\"]");
    private static By AddProjectDisplay= By.id("rcDialogTitle0");
    private static By SetProjectId= By.id("projectId");
    private static By SetProjecName= By.id("projectName");
    private static By SetType= By.id("type");
    private static By SetStartDate= By.xpath("//*[@class=\"ant-calendar-picker-input ant-input\"]");
    private static By inputStartDate=By.xpath("/html/body/div[8]/div/div/div/div/div[1]/div/input");
    private static By SetEndDate= By.xpath("//*[@name=\"endDate\"]");
    private static By inputEndDate= By.xpath("/html/body/div[9]/div/div/div/div/div[1]/div/input");
    private static By SetDuration= By.id("duration");
    private static By SetStatus= By.id("status");

    private static By clickOk= By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]");
    private static By getAddText=By.xpath("//*[@id=\"root\"]/div/section/section/main/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[3]");



    public static void clickManageBtn(){
        LOGGER.info("click manage project Button");
        getDriver().findElement(clickManageProject).click();
    }
    public static void clickAddBtn(){
        LOGGER.info("click Add project Button");
        getDriver().findElement(clickAddProject).click();
    }
    public static boolean AddProjectDplay(){
        LOGGER.info("Add project display");
        return getDriver().findElement(AddProjectDisplay).isDisplayed();
    }
    public static void setSetProjectId(String id){
        LOGGER.info("set project id");
        getDriver().findElement(SetProjectId).sendKeys(id);
    }
    public static void setSetProjectName(String defect){
        LOGGER.info("set project name");
        getDriver().findElement(SetProjecName).sendKeys(defect);
    }
    public static void setSetType(String type){
        LOGGER.info("set Type");
        getDriver().findElement(SetType).sendKeys(type);
    }
    public static void setSetStartDate(){
        LOGGER.info("set the start date");
        getDriver().findElement(SetStartDate).click();

    }
    public static void SetinputStartDate(String date){
        LOGGER.info("input  the start date");
        getDriver().findElement(inputStartDate).sendKeys(date);
        getDriver().findElement(inputStartDate).sendKeys(Keys.ENTER);
    }

    public static void setSetEndDateDate(){
        LOGGER.info("set the End date");
        getDriver().findElement(SetEndDate).click();
    }
    public static void setinputEndDateDate(String gt){
        LOGGER.info("input the End date");
        getDriver().findElement(inputEndDate).sendKeys(gt);
        getDriver().findElement(inputEndDate).sendKeys(Keys.ENTER);

    }


    public static void setSetDuration(String duration){
        LOGGER.info("set the duration");
        getDriver().findElement(SetDuration).sendKeys(duration);
    }

    public static void setSetStatus(String status){
        LOGGER.info("set the status");
        getDriver().findElement(SetStatus).sendKeys(status);
    }
    public static void clickOkbtn(){
        LOGGER.info("click ok button");
        getDriver().findElement(clickOk).click();
    }
   public static String getAddTexttt() {

       return getDriver().findElement(getAddText).getText();
  }


}
