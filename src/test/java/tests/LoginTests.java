package tests;

import dto.UserDTO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    @Test
    public void LoginPositiveTest() {
        searchPage.openLoginPage();
        UserDTO user = UserDTO.builder()
                .email("aaaaa@mail.com")
                .password("123456Aa$")
                .build();
        loginPage.login(user);
      //  Assert.assertTrue();
    }
}
