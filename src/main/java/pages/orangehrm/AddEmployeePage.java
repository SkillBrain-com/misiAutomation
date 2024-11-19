package pages.orangehrm;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddEmployeePage extends BasePage {
    @FindBy(xpath ="//i[@class='oxd-icon bi-chevron-right']")
    private WebElement expandMenuButton;
    // @FindBy(xpath ="//li[position()=2 and @class='oxd-main-menu-item-wrapper']")
    // private WebElement pimButton;
    // @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")
    // private WebElement pimButton;
    @FindBy(xpath ="//span[@class ='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']")
    private WebElement pimButton;
    @FindBy(xpath ="//a[@class='oxd-topbar-body-nav-tab-item' and text()='Add Employee']")
    private WebElement addEmployeeButton;
    @FindBy(xpath ="//input[@name='firstName']")
    private WebElement firstName;
    @FindBy(xpath ="//input[@name='middleName']")
    private WebElement middleName;
    @FindBy(xpath ="//input[@name='lastName']")
    private WebElement lastName;
    @FindBy(xpath ="//div[@class='oxd-grid-2 orangehrm-full-width-grid']//input[@class ='oxd-input oxd-input--active' ]")
    private WebElement employeeId;
    @FindBy(xpath ="//button[@type='submit']")
    private WebElement saveButton;

    public void pressExpandMenu(){
        click(expandMenuButton);
    }

    public void pressPim(){
        click(pimButton);
    }

    public void pressAddEmployee(){
        waitPage().until(ExpectedConditions.visibilityOf(this.addEmployeeButton));
        click(addEmployeeButton);
    }

    public void addFirstName(String firstName){
        waitPage().until(ExpectedConditions.visibilityOf(this.firstName));
        addText(firstName,this.firstName);
    }

    public void addMiddleName(String middleName){
        addText(middleName,this.middleName);
    }

    public void addLastName(String lastName){
        addText(lastName,this.lastName);
    }

    public void addEmployeeId(String employeeId){
        addText(employeeId,this.employeeId);
    }

    public void pressSave(){
        click(saveButton);
    }

}