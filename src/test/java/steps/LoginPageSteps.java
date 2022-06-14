package steps;

import pages.LoginPage;

public class LoginPageSteps {

    private LoginPage loginPage = new LoginPage();

    public ProjectsPageSteps userLogin(String login) throws InterruptedException {
        loginPage.backAlyticsPromoIcon();
        loginPage.registrationPlusIcon();
        loginPage.rememberMeButton();
        loginPage.resetPasswordLink();

        loginPage.fillLoginFields(login);
        loginPage.fillPasswordFields(login);
        loginPage.pressEnter();
        Thread.sleep(3000);
        return new ProjectsPageSteps();
    }


}
