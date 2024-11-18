package pages.orangehrm;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddEmployeePage extends BasePage {
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
    @FindBy(xpath ="//input[@class='oxd-input oxd-input--active oxd-input--error']")
    private WebElement employeeId;
    @FindBy(xpath ="//button[@type='submit']")
    private WebElement saveButton;


    public void pressPim(){
        waitPage().until(ExpectedConditions.visibilityOf(this.pimButton));
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