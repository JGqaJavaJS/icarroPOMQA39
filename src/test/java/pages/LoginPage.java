package pages;

import dto.UserDTO;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[resource-id='com.telran.ilcarro:id/editLoginEmail']")
    MobileElement inputEmail;

    @FindBy(xpath = "//*[resource-id='com.telran.ilcarro:id/editLoginPassword']")
    MobileElement inputPassword;

    @FindBy(xpath = "//*[resource-id='com.telran.ilcarro:id/loginBtn']")
    MobileElement btnYalla;

    public void login(UserDTO user) {
        System.out.println(user.getEmail());
        typeTestBase(inputEmail, 30, user.getEmail());
        typeTestBase(inputPassword, 5, user.getPassword());
        clickBase(btnYalla, 5);
    }
}
