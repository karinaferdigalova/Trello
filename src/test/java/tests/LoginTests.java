package tests;

import dto.User;
import lombok.Builder;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends AppManager {
    @Test
    public void loginPositiveTest(){
        User user = User.builder()
                .email("karinaza292002@gmail.com")
                .password("Rfhbyrf29$")
                .build();
    new HomePage(getDriver()).clickBtnLogin();
    new LoginPage(getDriver()).login(user);

    }

}
