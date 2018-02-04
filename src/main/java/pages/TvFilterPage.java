package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BasePageSteps;

import java.util.List;

public class TvFilterPage {


    @FindBy(xpath = "//div[1][contains(@class,'n-snippet-card2__title')]")
    WebElement firstElement;

    @FindBy(xpath = "//input[contains(@id,'header-search')]")
    WebElement header_search;

    @FindBy(xpath = "//h1[contains(@class,'title')]")
    public WebElement titleGoods;

    @FindBy(xpath = "//button[contains(@class,'button2')]")
    public WebElement buttonSearch;

    public TvFilterPage(){
        PageFactory.initElements(BasePageSteps.getDriver(), this);
    }

    public void checkCountGoods(){
        List<WebElement> elements = BasePageSteps.getDriver().findElements(By.xpath("//div[contains(@class,'n-snippet-card2__title')]"));
        Assert.assertTrue(elements.size()==12);

    }

    public String saveFirstElement(){
        String element = firstElement.getText();
        return element;
    }

    public void searchFirstElement(){
        header_search.sendKeys(saveFirstElement());
    }

}
