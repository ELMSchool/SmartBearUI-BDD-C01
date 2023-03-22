package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ViewAllOrdersPage {
    public ViewAllOrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//table[@class='SampleTable']//th")
    public WebElement tableHeader;
    //Locating edit icon for first row order
    @FindBy (xpath = "//input[@src='App_Themes/Default/images/button_edit.gif'][1]")
    public WebElement firstRowEditOrder;
    //Locating Paul Brown
    @FindBy (xpath = " //table/tbody/tr[2]/td[2]")
    public WebElement paulBrown;
    //Locating update button
    @FindBy(id = "ctl00_MainContent_fmwOrder_UpdateButton")
    public WebElement updateButton;
}
