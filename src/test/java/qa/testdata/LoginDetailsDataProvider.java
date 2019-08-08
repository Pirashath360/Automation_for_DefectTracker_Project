package qa.testdata;



import org.testng.annotations.DataProvider;

public class LoginDetailsDataProvider {
    @DataProvider
    public static Object[][] MultipleLoginDetails(){
        return new Object[][]{
              //  {"jhon","jhon123", Constants.LOGIN_INVALID_MSG},
              //  {"","", Constants.LOGIN_Empty_MSG},
               // {"Admin","Wrongpwd",Constants.LOGIN_INVALID_MSG},
               // {"Wronguasername","admin123",Constants.LOGIN_INVALID_MSG}

        };





}

}
