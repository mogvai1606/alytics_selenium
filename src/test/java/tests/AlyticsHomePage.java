package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectsPage;



public class AlyticsHomePage extends BaseTest{

    @Test(dataProvider = "dataProvider")
    public void loginBasicUser(String login) throws InterruptedException {

        steps.userLogin(login)
                .verifyClassProjects()
                .verifyDisplayedProjects();


    }
}
