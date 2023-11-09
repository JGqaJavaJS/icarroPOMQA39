package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
    MobileElement btnOpenMenu;
    @FindBy(xpath = "//*[@text='Login']")
    MobileElement btnLogin;

    public void openMenu() {
        clickBase(btnOpenMenu, 30);
    }

    public void clickLogin() {
        clickBase(btnLogin, 10);
    }

    public void openLoginPage() {
        openMenu();
        clickLogin();
    }
}


