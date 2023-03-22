package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class DashboardPage {
    public DashboardPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    // Finding Element Welcome Test
    @FindBy(className =("login_info"))
    public static WebElement webOrders;

    // locate View all orders button
    @FindBy(linkText = ("View all orders"))
    public WebElement viewAllOrderButton;

    // locate View all products button
    @FindBy(linkText = ("View all products"))
    public WebElement viewAllProductsButton;

    // locate order button
    @FindBy(linkText = ("Order"))
    public WebElement orderButton;

    // locate logout button
    @FindBy(id = "ctl00_logout")
    public WebElement logoutButton;

    public WebElement dashboardPages(String text) {
        WebElement pages = Driver.getDriver().findElement(By.xpath("//*[text()='"+text+"']"));

        return pages;
    }


}

