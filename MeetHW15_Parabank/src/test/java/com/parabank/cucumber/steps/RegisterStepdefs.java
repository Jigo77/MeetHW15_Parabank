package com.parabank.cucumber.steps;

import com.parabank.cucumber.pages.Register;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepdefs {
    @Given("^User is on Home page$")
    public void userIsOnHomePage() {
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new Register().regclick();
    }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String fname1)  {
        new Register().enterfname(fname1);

    }

    @And("^I enter Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String lname1)  {
        new Register().enterlname(lname1);
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String add)  {
        new Register().enteradd(add);
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city)  {
        new Register().entercity(city);
    }

    @And("^I enter state \"([^\"]*)\"$")
    public void iEnterState(String state)  {
        new Register().enterstate(state);
    }

    @And("^I enter Zip \"([^\"]*)\"$")
    public void iEnterZip(String zip)  {
        new Register().enterzip(zip);
    }

    @And("^I enter Phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String pnumber)  {
        new Register().enterpnumber(pnumber);
    }

    @And("^I enter ssn \"([^\"]*)\"$")
    public void iEnterSsn(String ssn)  {
        new Register().enterssn(ssn);
    }

    @And("^I enter UserName \"([^\"]*)\"$")
    public void iEnterUserName(String uname)  {
        new Register().enteruname(uname);
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String pass)  {
        new Register().enterpass(pass);
    }

    @And("^I enter Con Password \"([^\"]*)\"$")
    public void iEnterConPassword(String cpass)  {
        new Register().entercpass(cpass);
    }

    @Then("^I click on register button$")
    public void iClickOnRegisterButton() {
        new Register().clickonbutton1();
    }
}
