package tests;

import dto.UserDto;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    @Test
    public void LoginPositiveTest() {
        searchPage.openLoginPage();
        loginPage.login(user);
      //  Assert.assertTrue();
    }
}
