package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    @Test
    public void login() throws Exception {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");
    }
         //Screenshot.takeScreenshot(driver, "LoginTest");
        
        //ExcelUtil.openExcel();

    //     int rows = ExcelUtil.getRowCount();

    //     for(int i = 1; i < rows; i++) {

    //         String username =
    //         ExcelUtil.getData(i,0);

    //         String password =
    //         ExcelUtil.getData(i,1);

    //         login.login(username, password);

    //         driver.navigate().back();
    // }

}



