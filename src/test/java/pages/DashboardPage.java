package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class DashboardPage {

    public DashboardPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}

   @FindBy (tagName = "h1")
   public WebElement webOrders;

    @FindBy (linkText = "View all orders")
    public WebElement viewAllOrder;

    @FindBy (linkText = "View all products")
    public WebElement viewAllProducts;

    @FindBy (linkText = "Order")
    public WebElement order;

    @FindBy(id = "ctl00_logout")
    public WebElement logout;
}