package pages.orangehrm;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployee extends BasePage {
    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]")
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
    @FindBy(xpath ="//a[@class='oxd-topbar-body-nav-tab-item' and text()='Add Employee']")
    private WebElement saveButton;


    public void pressPim(){
        click(pimButton);
    }

    public void pressAddEmployee(){
        click(addEmployeeButton);
    }

    public void addFirstName(String firstName){
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


/*

public void addUsername(String username){
        waitPage().until(ExpectedConditions.visibilityOf(this.username));
        addText(username,this.username);
    }

    public void addPassword(String password){
        addText(password, this.password);
    }

    public void pressLogin(){
        click(loginButton);
    }
}


*/