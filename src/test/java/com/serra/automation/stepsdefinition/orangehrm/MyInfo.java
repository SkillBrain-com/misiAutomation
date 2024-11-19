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

    @Then("Press Save button")
    public void pressSaveButton() {
        myInfo.pressSave();
    }

    @Then("create street number one {}")
    public void createStreetNumberOne(String streetOne) {
        myInfo.completeStreet1(streetOne);
    }

    @Then("create street number two {}")
    public void createStreetNumberTwo(String streetTwo) {
        myInfo.completeStreet2(streetTwo);
    }
}
