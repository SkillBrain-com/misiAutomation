package pages.orangehrm;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyInfoPage extends BasePage{
    @FindBy(xpath = "//ul[@class='oxd-main-menu']//li[6]")
    private WebElement myInfo;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
    private WebElement contactDetails;
    @FindBy(xpath ="//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]")
    private WebElement street1;
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]")
    private WebElement street2;
    @FindBy(xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
    private WebElement save;



        public void pressMyInfo(){
            waitPage().until(ExpectedConditions.visibilityOf(this.myInfo));
            click(myInfo);
        }

        public void pressContactDetails() {
            waitPage().until(ExpectedConditions.visibilityOf(this.contactDetails));
            click(contactDetails);
        }

        public void completeStreet1(String street1) {
            addText(street1, this.street1);
        }


        public void completeStreet2(String street2){
            addText(street2, this.street2);
        }

        public void pressSave() {
            click(save);
        }
}
