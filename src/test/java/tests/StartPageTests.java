package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StartPageTests extends BaseTest{

    @Test
    public void textTitleTest() {
        startScreenPage.experimentGetLocation();
        Assert.assertTrue(startScreenPage.validateTextTitle());
    }
    @Test
    public void actionsTest() {
        startScreenPage.experimentMultiTouch();
    }
}
