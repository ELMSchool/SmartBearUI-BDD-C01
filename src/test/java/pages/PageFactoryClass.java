package pages;

import org.openqa.selenium.WebDriver;
import step_definitions.LoginSteps;

public class PageFactoryClass {

    private WebDriver driver;

    public PageFactoryClass(WebDriver driver){

        this.driver = driver;
    }

    public LoginPage loginPage(){
        return new LoginPage();
    }
     public DashboardPage dashboardPage(){
         return new DashboardPage();
    }

     public LoginSteps loginSteps(){
         return new LoginSteps();
    }

}
