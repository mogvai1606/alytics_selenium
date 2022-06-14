package steps;

import pages.ProjectsPage;

public class ProjectsPageSteps {

    private ProjectsPage projectsPage = new ProjectsPage();

    public ProjectsPageSteps verifyDisplayedProjects(){
        projectsPage.assertDisplayedProject();
        return this;
    }

    public ProjectsPageSteps verifyClassProjects(){
        projectsPage.assertClassProject();
        return this;
    }

}
