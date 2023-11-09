package tests;

import pages.LoginPage;
import pages.SearchPage;
import pages.StartScreenPage;

public class BaseTest {
    StartScreenPage startScreenPage = new StartScreenPage();
    SearchPage searchPage = new SearchPage();
    LoginPage loginPage = new LoginPage();
}
