package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProjectsPage extends BasePage{

    private final By userIcon = By.xpath("//nav[@id='nav-container']//span[@data-hasqtip]//div//i");
//    private final By logOut = By.xpath("//a[@href='/account/do-logout']");

    @FindBy(xpath = "//tbody[@class='projects-list']//a[@class='to-project-link']")
    private WebElement projectsList;
    public ProjectsPage() {
        super();
    }

    public void assertDisplayedProject(){
        assertThat(projectsList.isDisplayed()).as("Нет списка проектов").isTrue();
     }

    public void assertClassProject(){
        assertThat(projectsList.getAttribute("class")).as("У объекта не тот класс").contains("project");
    }

//    public void doLogOut() throws InterruptedException {
//        List<WebElement> userIconElement = driver.findElements(userIcon);
//        userIconElement.get(4).click();
//        Thread.sleep(1000);
//        WebElement logOutElement = driver.findElement(logOut);
//        logOutElement.click();
//    }

}
