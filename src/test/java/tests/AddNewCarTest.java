package tests;

import dto.AddNewCarDto;
import dto.UserDTO;
import org.testng.annotations.Test;
import utils.RandomUtils;

public class AddNewCarTest extends BaseTest{

    @Test
    public void addNewCarTest() throws InterruptedException {
        searchPage.openLoginPage();
        UserDTO user = UserDTO.builder()
                .email("aaaaa@mail.com")
                .password("123456Aa$")
                .build();
        loginPage.login(user);
        searchPage.openMenu();
        searchPage.openMyCarsPage();
        myCarsPage.clickAddNewCar();

        String serNumber = RandomUtils.generateStringDigits(11);
        AddNewCarDto addNewCar = AddNewCarDto.builder()
                .serialNumber(serNumber)
                .manufacture("qa39")
                .model("corsa")
                .year(1990)
                .fuel("Diesel")
                .seats(2)
                .carClass("ads")
                .pricePerDay(9)
                .about("fff")
                .city("Tel Aviv")
                .build();
        addNewCarPage.addNewCar(addNewCar);
        Thread.sleep(5000);
    }
}
