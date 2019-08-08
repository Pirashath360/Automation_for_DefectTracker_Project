package qa.testdata;


import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import qa.utils.ExcelDataConfig;


/**
 * UserDetailsDataProvider.java - To Manage User related Data Set
 * Created by SrirankanK on 10/3/2018.
 */
public class UserDetailsDataProvider extends ExcelDataConfig {
    private static final Logger LOGGER = Logger.getLogger(UserDetailsDataProvider.class);

    public UserDetailsDataProvider () {
        super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");
    }

    @DataProvider
    public Object[][] AddUser() {
        int rows = getRowCount("UserAdd");
        int col = getColumnCount("UserAdd");


        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("UserAdd", i, j);
            }
        }
        return data;
    }
}
