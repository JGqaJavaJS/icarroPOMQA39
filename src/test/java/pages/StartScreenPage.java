package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class StartScreenPage extends BasePage{

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/textView']")
    MobileElement widgetTextView;

    // The Ultimate Car Rental Service

    public boolean validateTextTitle() {
        return isTextEqual(widgetTextView, 20, "The Ultimate Car Rental Service");
    }
}
