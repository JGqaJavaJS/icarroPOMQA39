package tests;

import api.CarsApi;
import api.UserNamePasswordApi;
import dto.AddNewCarDto;
import dto.UserDto;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import pages.*;

import java.sql.Array;

public class BaseTest {
    StartScreenPage startScreenPage = new StartScreenPage();
    SearchPage searchPage = new SearchPage();
    LoginPage loginPage = new LoginPage();
    MyCarsPage myCarsPage = new MyCarsPage();
    AddNewCarPage addNewCarPage = new AddNewCarPage();
    CarsApi carsApi = new CarsApi();
    UserNamePasswordApi userNamePasswordApi = new UserNamePasswordApi();
    String token = "";
    UserDto user = UserDto.builder()
            .username("aaaaa@mail.com")
            .password("123456Aa$")
            .build();

    String[] carsSerNumbers = new String[20];
    int index = 0;
    @BeforeSuite
    public void preCondSuite() {
        token = userNamePasswordApi.getToken(user);
    }

    @AfterSuite
    public void postCondSuite() {
        for(int i = 0; i< carsSerNumbers.length; i++) {
            if(carsSerNumbers[i] != null) {
                carsApi.deleteOneCarBySerNum(carsSerNumbers[i], token);
            }
        }
    }

}
