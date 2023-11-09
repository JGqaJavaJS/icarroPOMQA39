package pages;

import config.AppiumConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumConfig.getDriver()), this);
    }

    private void wait(MobileElement element, int time) {
        new WebDriverWait(AppiumConfig.getDriver(), time)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public String getTextBase(MobileElement element, int time) {
        wait(element, time);
        return element.getText().trim().toUpperCase();
    }

    public boolean isTextEqual(MobileElement element, int time, String expectedResult) {
        expectedResult = expectedResult.trim().toUpperCase();
        String actualRes = getTextBase(element, time);
        if(actualRes.equals(expectedResult)) {
            return true;
        } else {
            System.out.println("actual result: " + actualRes +
                    " expected result: " + expectedResult);
            return false;
        }
    }

    public void clickBase(MobileElement element, int time) {
        wait(element, time);
        element.click();
    }

    public void typeTestBase(MobileElement element, int time, String text) {
//        wait(element, time);
//        element.click();
        clickBase(element, time);
        element.clear();
        element.sendKeys(text);
    }
}
