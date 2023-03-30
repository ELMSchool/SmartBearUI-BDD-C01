package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import pages.PageFactoryClass;
import utils.Driver;


public class ViewAllOrderSteps {
    PageFactoryClass pageFactoryClass = new PageFactoryClass(Driver.getDriver());




    @When( "User logs in with valid credentials")
    public void userLogsInWithValidCredentialsAnd() {
        pageFactoryClass.loginSteps().the_user_navigates_to_the_home_page();
        pageFactoryClass.loginSteps().the_user_enters_username("Tester");
        pageFactoryClass.loginSteps().the_user_enters_password("test");
        pageFactoryClass.loginSteps().the_user_clicks_login_button();

    }

    @Then("User will land on Dashboard Page")
    public void userWillLandOnDashboardPage() {
        String expectedMessage = "Web Orders";
        Assert.assertEquals(expectedMessage,pageFactoryClass.dashboardPage().webOrders.getText());
        System.out.println("Dashboard Page verified");

    }


    @Then("User will click on View all Orders")
    public void userWillClickOnViewAllOrders() {
        pageFactoryClass.dashboardPage().viewAllOrder.click();
        String expectedMessage = "View all orders";
        Assert.assertEquals(expectedMessage,pageFactoryClass.dashboardPage().viewAllOrder.getText());
        System.out.println("View All Order Page verified");
    }


    @And("User will logout")
    public void userWillLogout() {
        pageFactoryClass.dashboardPage().logout.click();
        String expectedUrl ="http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx";
        Assert.assertEquals("You are on login page..Please log in again",Driver.getDriver().getCurrentUrl(),expectedUrl);
        System.out.println("logout button verified");
    }

    @Then("User clicks on check All")
    public void userClicksOnCheckAll() {
        pageFactoryClass.viewAllOrderPage().checkAll.click();
        boolean isCheckAllSelected = pageFactoryClass.viewAllOrderPage().checkAll.isSelected();
        Assert.assertTrue("You have selected all the rows",true);
    }

    @Then("User clicks on DeleteSelected")
    public void userClicksOnDeleteSelected() {
        pageFactoryClass.viewAllOrderPage().deleteSelected.click();
        String expectedUrl = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx";
        Assert.assertEquals("Use link to add new order " ,Driver.getDriver().getCurrentUrl(),expectedUrl);


    }

    @Then("User clicks on Uncheck All")
    public void userClicksOnUncheckAll() {
        pageFactoryClass.viewAllOrderPage().unCheckAll.click();
        boolean isUnCheckAllSelected = pageFactoryClass.viewAllOrderPage().unCheckAll.isSelected();
        Assert.assertTrue("You have uncheck all rows",true);
    }

    @And("User will now use new link to place order")
    public void userWillNowUseNewLinkToPlaceOrder() {
        pageFactoryClass.viewAllOrderPage().newLink.click();
        String expectedUrl = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Process.aspx";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),expectedUrl);


        }
    @After
    public void tearDown(){
        Driver.getDriver().close();
    }



    }



