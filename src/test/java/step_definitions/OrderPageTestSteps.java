package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DashboardPage;
import pages.LoginPage;
import pages.OrderPage;
import utils.ConfigReader;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class OrderPageTestSteps {

    @Given("User navigates to the Order Page by valid {string} and {string}")
    public void userNavigatesToTheOrderPageByValidAnd(String username, String password) {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
        new LoginPage().loginMethod(username,password);


    }
    @Then("User clicks on Orders button from dashboard")
    public void userClicksOnOrdersButtonFromDashboard() {
        new DashboardPage().orderButton.click();
    }
    @When("User is lands on Order Page")
    public void userIsLandsOnOrderPage() {
        String expectedUrl = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Process.aspx";
        Assert.assertEquals("You are not on orders page",Driver.getDriver().getCurrentUrl(),expectedUrl);

    }

    @And("User makes choice {string} from from product menu")
    public void userMakesChoiceFromFromProductMenu(String product) {
        WebElement dropDown = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        dropDown.click();
        Select select = new Select(new OrderPage().dropDownProduct);
        select.selectByValue(product);
    }

    @And("user enters {string} to Quantity input box")
    public void userEntersToQuantityInputBox(String quantity) {
        new OrderPage().quantityBox.sendKeys(quantity);
    }

    @And("User clicks on calculate button")
    public void userClicksOnCalculateButton() {
        new OrderPage().calculateButton.click();
    }
    @And("User enters  inputs name into {string} box")
    public void userEntersInputsNameIntoBox(String name) {
        new OrderPage().custName.sendKeys(name);
    }
    @And("User enters inputs adress into {string} box")
    public void userEntersInputsAdressIntoBox(String adress) {
        new OrderPage().street.sendKeys(adress);

    }

    @And("User enters inputs city name into {string} box")
    public void userEntersInputsCityNameIntoBox(String city) {
        new OrderPage().city.sendKeys(city);

    }

    @And("User enters inputs state name into {string} box")
    public void userEntersInputsStateNameIntoBox(String state) {
        new OrderPage().State.sendKeys(state);

    }

    @And("User enters inputs Zipcode into {string} box")
    public void userEntersInputsZipcodeIntoBox(String zipcode) {
        new OrderPage().zip.sendKeys(zipcode);
    }


    @And("User makes choice between payment {string}")
    public void userMakesChoiceBetweenPayment(String card) {
        if (card.equals("Visa"))
        {
            new OrderPage().visaButton.click();
        }
        if (card.equals("MasterCard"))
        {
            new OrderPage().masterCard.click();
        }
        if (card.equals("AmericanExpress"))
        {
            new OrderPage().americanExpress.click();
        }

    }

    @And("User enters card number")
    public void userEntersCardNumber() {
        new OrderPage().cardNumber.sendKeys("8327856767230000");
    }



    @And("User enters expiration date")
    public void userEntersExpirationDateMmYy() {
        new OrderPage().expDate.sendKeys("01/24");
    }


    @And("User clicks on Process button")
    public void userClicksOnProcessButton() {
        new OrderPage().processButton.click();
    }

    @And("User clicks on reset button")
    public void userClicksOnResetButton() {
        new OrderPage().resetButton.click();
    }
}
