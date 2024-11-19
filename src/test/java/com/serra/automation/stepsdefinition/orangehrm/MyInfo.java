package com.serra.automation.stepsdefinition.orangehrm;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.orangehrm.MyInfoPage;

public class MyInfo {
    MyInfoPage myInfo;

    public MyInfo() {
        myInfo = new MyInfoPage();
    }

    @Then("Press My Info")
    public void pressMyInfo() {
        myInfo.pressMyInfo();
    }

    @When("Contact Details")
    public void contactDetails() {
        myInfo.pressContactDetails();
    }

    @Then("Street numberOne {}")
    public void streetNumberOne(String streetOne) {
        myInfo.completeStreet1(streetOne);
    }

    @Then("Street numberTwo {}")
    public void streetNumberTwo(String streetTwo) {
        myInfo.completeStreet2(streetTwo);
    }

    @Then("Press Save button")
    public void pressSaveButton() {
        myInfo.pressSave();
    }
}
