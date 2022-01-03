package co.com.sofka.page;

import co.com.sofka.model.ZonaFitCoModel;
import co.com.sofka.page.common.CommonActionOnpages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZonaFitCoPage extends CommonActionOnpages {

    private final ZonaFitCoModel zonaFitCoModel;
    private static final Logger LOGGER = Logger.getLogger(ZonaFitCoPage.class);

    /*locators*/

    @CacheLookup
    @FindBy(xpath = "//a[@class='dashicons-tag mega-menu-link']")
    private WebElement offerProduct;

    @CacheLookup
    @FindBy(xpath = "//a[@class='dashicons-plus-alt2 mega-menu-link']")
    private WebElement moreProducts;

    @CacheLookup
    @FindBy(xpath = "//a[@class='dashicons-plus-alt2 mega-menu-link']")
    private WebElement ordenarPor;

    @CacheLookup
    @FindBy(xpath = "//option[@value='price']")
    private WebElement precioMenorMayor;

    @CacheLookup
    @FindBy(css = "input[data-brand='800']")
    private WebElement markZonaFit;

    @CacheLookup
    @FindBy(css = "input[data-brand='136']")
    private WebElement otherMarks;

    @CacheLookup
    @FindBy(css = "div[class='wc-proceed-to-checkout']")
    private WebElement buttonEndBuy;

    @CacheLookup
    @FindBy(id = "billing_myfield12")
    private WebElement numberDocument;

    @CacheLookup
    @FindBy(id = "billing_email")
    private WebElement emailClientWE;

    @CacheLookup
    @FindBy(id = "billing_first_name")
    private WebElement nameClientWE;

    @CacheLookup
    @FindBy(id = "billing_last_name")
    private WebElement lastNameClientWE;

    @CacheLookup
    @FindBy(id = "select2-billing_state-container")
    private WebElement state;

    @CacheLookup
    @FindBy(id = "select2-billing_city-container")
    private WebElement cityClientWE;

    @CacheLookup
    @FindBy(id = "billing_address_1")
    private WebElement addressClientWE;

    @CacheLookup
    @FindBy(id = "billing_phone")
    private WebElement phoneClientWE;

    @CacheLookup
    @FindBy(id = "terms")
    private WebElement terms;

    @CacheLookup
    @FindBy(id = "place_order")
    private WebElement orderButtonWE;

    public ZonaFitCoPage(ZonaFitCoModel zonaFitCoModel, WebDriver webDriver) {
        super(webDriver);
        this.zonaFitCoModel = zonaFitCoModel;
        PageFactory.initElements(webDriver, this);

    }

    public void fillMandatoryFields () {
            click(buttonEndBuy);
            scrollDown();
            scrollUp();
            waitClickable(numberDocument);
            clearText(numberDocument);
            clearText(emailClientWE);
            typeInto(emailClientWE); zonaFitCoModel.getEmailClient();
            clearText(nameClientWE);
            typeInto(nameClientWE); zonaFitCoModel.getNameClient();
            clearText(lastNameClientWE);
            typeInto(lastNameClientWE, zonaFitCoModel.getLastNameClient());

            scrollDown();
    }
}


