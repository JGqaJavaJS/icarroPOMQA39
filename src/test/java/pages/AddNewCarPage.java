package pages;

import dto.AddNewCarDto;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCarPage extends BasePage{
    @FindBy(xpath = "//*[@text='Serial number']")
    MobileElement inputSerNumber;

    @FindBy(xpath = "//*[@text='Manufacture']")
    MobileElement inputManufacture;

    @FindBy(xpath = "//*[@text='Model']")
    MobileElement inputModel;

    @FindBy(xpath = "//*[@text='City']")
    MobileElement inputCity;

    @FindBy(xpath = "//*[@text='Price per day']")
    MobileElement inputPrice;

    @FindBy(xpath = "//*[@text='Car Class']")
    MobileElement inputCarClass;

    @FindBy(xpath = "//*[@text='Fuel type']")
    MobileElement inputFuelType;

    @FindBy(xpath = "//*[@text='Diesel']")
    MobileElement fuelPetrol;

//    String fuelType = "";
//    @FindBy(xpath = String.format("//*[@text='%s']", fuelType))
//    MobileElement fuel;
//
//    select fuel type
//    public MobileElement getFuelTypeBtn(String fuel) {
//        @FindBy(xpath = fuel)
//        MobileElement fuelType;
//        MobileElement fuelType1 = fuelType;
//        return fuelType1;
//    }

    @FindBy(xpath = "//*[@text='Year']")
    MobileElement inputYear;

    @FindBy(xpath = "//*[@text='Seats count']")
    MobileElement inputSeatsCount;

    @FindBy(xpath = "//*[@text='Add car!']")
    MobileElement btnAddCar;

    public void addNewCar(AddNewCarDto data) {
        typeTestBase(inputSerNumber, 30, data.getSerialNumber());
        hideKeyBoard();
        typeTestBase(inputManufacture, 10, data.getManufacture());
        hideKeyBoard();
        typeTestBase(inputModel, 10, data.getModel());
        hideKeyBoard();
        typeTestBase(inputCity, 10, data.getCity());
        hideKeyBoard();
        typeTestBase(inputPrice, 10, String.valueOf(data.getPricePerDay()));
        hideKeyBoard();
        typeTestBase(inputCarClass, 10, data.getCarClass());
        hideKeyBoard();
        clickBase(inputFuelType, 10);
        clickBase(fuelPetrol, 30);
        //hideKeyBoard();
        typeTestBase(inputYear, 10, String.valueOf(data.getYear()));
        hideKeyBoard();
        typeTestBase(inputSeatsCount, 10, String.valueOf(data.getSeats()));
        hideKeyBoard();
        clickBase(btnAddCar, 10);
    }

}
/*
        // Scroll to the element with text "Your Element Text"
        scrollElementIntoView(driver, "Your Element Text");

        // Your test steps go here...

        // Close the driver
        driver.quit();
    }

    public static void scrollElementIntoView(AppiumDriver<MobileElement> driver, String elementText) {
        MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\"" + elementText + "\"))"));

        // Optional: You can perform additional actions with the found element if needed
        // For example, you can click on the element after scrolling to it
        element.click();
    }
 */

