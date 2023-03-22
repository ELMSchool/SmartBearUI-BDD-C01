package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.OrderPage;
import pages.ViewAllOrdersPage;
import utils.ConfigReader;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class ViewAllOrdersTests {
    ViewAllOrdersPage viewAllorder =  new ViewAllOrdersPage();
    @Given(": The user navigates to View all Orders page by entering valid {string} and {string}")
    public void the_user_navigates_to_view_all_orders_page_by_entering_valid_and(String username, String password) {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
        new LoginPage().loginMethod(username,password);

    }
    @When(": The user clicks edit button on first row of table")
    public void the_user_clicks_edit_button_for_first_row_of_table() {

        viewAllorder.firstRowEditOrder.click();

    }
    @And(": The user changes Customer Name to {string}")
    public void the_user_changes_customer_name_to(String string) {
        new OrderPage().custName.clear();
        new OrderPage().custName.sendKeys(string);


    }
    @And(": The user clicks to update button")
    public void the_user_clicks_to_update_button() {
        new ViewAllOrdersPage().updateButton.click();
    }
    @Then(": The user verifies if customer name changed or not")
    public void the_user_verifies_if_customer_name_changed_or_not() {
        String fakeName = "John Doe";

        Assert.assertEquals("Test is passing if Paul Brown is not Equal to John Doe",fakeName,viewAllorder.paulBrown.getText());
    }


    @Then(": The user verifies if customer name changed or not,and test should fail")
    public void theUserVerifiesIfCustomerNameChangedOrNotAndTestShouldFail() {
        String fakeName = "John Dumbledor";

        Assert.assertEquals("Test is passing if Paul Brown is not Equal to John Doe",fakeName,viewAllorder.paulBrown.getText());
    }



}