package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import pages.PageFactoryClass;
import utils.Driver;

public class DashboardPageSteps {
    PageFactoryClass pageFactoryClass = new PageFactoryClass(Driver.getDriver());

    @Before
    @When("User logins with  valid credentials")
    public void userLoginsWithValidCredentials() {
        pageFactoryClass.loginSteps().the_user_navigates_to_the_home_page();
        pageFactoryClass.loginSteps().the_user_enters_username("Tester");
        pageFactoryClass.loginSteps().the_user_enters_password("test");
        pageFactoryClass.loginSteps().the_user_clicks_login_button();
    }

    @Then( "the page is verified")
    public void thePageIsVerified() {
        String actualMessage = "Web Orders";
        Assert.assertEquals("Web Orders", actualMessage);

    }

    @When("User clicks on view all orders")
    public void userClicksOnViewAllOrders() {
        pageFactoryClass.dashboardPage().webOrders.click();
    }

    @Then("User can see list of all orders")
    public void userCanSeeListOfAllOrders() {
        String expectedMessage = "List of All Orders";
        Assert.assertEquals("List of All Orders", expectedMessage);
    }

    @When("User clicks on view all products")
    public void userClicksOnViewAllProducts() {
        pageFactoryClass.dashboardPage().viewAllProducts.click();
    }

    @Then("User can see List of Products")
    public void userCanSeeListOfProducts() {
        String expectedMessage = "List of Products";
        Assert.assertEquals("List of Products", expectedMessage);
    }

    @When("User clicks on orders")
    public void userClicksOnOrders() {
        pageFactoryClass.dashboardPage().order.click();
    }

    @Then("User can see order")
    public void userCanSeeOrder() {
        String expectedMessage = "Order";
        Assert.assertEquals("Order",expectedMessage);
    }

   @After
   public void tearDown(){
        Driver.getDriver().close();
    }
}
