package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StartPageTests extends BaseTest{

    @Test
    public void textTitleTest() {
        Assert.assertTrue(startScreenPage.validateTextTitle());
    }
}
