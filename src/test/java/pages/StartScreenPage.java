package pages;

import config.AppiumConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.FindBy;

public class StartScreenPage extends BasePage{

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/textView']")
    MobileElement widgetTextView;

    // The Ultimate Car Rental Service

    public boolean validateTextTitle() {
        return isTextEqual(widgetTextView, 20, "The Ultimate Car Rental Service");
    }

    public void experimentGetLocation() {
        int x = widgetTextView.getLocation().getX();
        int y = widgetTextView.getLocation().getY();
        System.out.println("x: " + x + " y: " + y);
    }

    /*
MultiTouchAction multiTouch = new MultiTouchAction(driver);
TouchAction action0 = new TouchAction(driver).tap(el);
TouchAction action1 = new TouchAction(driver).tap(el);
TouchAction action2 = new TouchAction(driver).tap(el);
multiTouch.add(action0).add(action1).add(action2).perform();
 */

    public void experimentMultiTouch() {
        MultiTouchAction multiTouch = new MultiTouchAction(AppiumConfig.getDriver());
        int x = widgetTextView.getLocation().getX();
        int y = widgetTextView.getLocation().getY();
        TouchAction action0 =
                new TouchAction(AppiumConfig.getDriver()).tap(PointOption.point(x,y));
        TouchAction action1 = new TouchAction(AppiumConfig.getDriver()).tap(PointOption.point(x+5, y+5));
        TouchAction action2 = new TouchAction(AppiumConfig.getDriver()).tap(PointOption.point(x+100, y+100));
        multiTouch.add(action0).add(action1).add(action2).perform();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
