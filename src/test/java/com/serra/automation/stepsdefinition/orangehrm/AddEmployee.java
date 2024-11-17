package com.serra.automation.stepsdefinition.orangehrm;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.orangehrm.AddEmployeePage;

public class AddEmployee {
    private final AddEmployeePage addEmployeePage;
    public AddEmployee(){
        addEmployeePage =  new AddEmployeePage();
    }

    @And("Press PIM button")
    public void pressPIMButton() {
        addEmployeePage.pressPim();
    }

    @When("Press Add employee button")
    public void pressAddEmployeeButton() {
        addEmployeePage.pressAddEmployee();
    }

    @Then("Insert first name {}")
    public void insertFirstName(String firstName) {
        addEmployeePage.addFirstName(firstName);
    }

    @Then("Insert middle name {}")
    public void insertMiddleName(String middleName) {
        addEmployeePage.addMiddleName(middleName);
    }

    @Then("Insert last name {}")
    public void insertLastName(String lastName) {
        addEmployeePage.addLastName(lastName);
    }

    @Then("Insert employee ID {}")
    public void insertEmployeeId(String employeeId) {
        addEmployeePage.addEmployeeId(employeeId);
    }

    @Then("Press Save button")
    public void pressSaveButton() {
        addEmployeePage.pressSave();
    }
}