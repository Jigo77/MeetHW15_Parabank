package com.parabank.cucumber.pages;

import com.parabank.cucumber.browserfactory.ManageBrowser;
import com.parabank.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends Utility {
    private static final Logger log = LogManager.getLogger(Register.class.getName());

    public Register() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    //By reglink = By.xpath("//div[@id='loginPanel']/p[2]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@id='loginPanel']/p[2]/a")
    WebElement reglink;

    //By fname = By.xpath("//input[@id='customer.firstName']");
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.firstName']")
    WebElement fname;
    // By lname = By.xpath("//input[@id='customer.lastName']");
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.lastName']")
    WebElement lname;
    // By add = By.xpath("//input[@id='customer.address.street']");
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.address.street']")
    WebElement add;

    //By city = By.xpath("//input[@id='customer.address.city']");
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.address.city']")
    WebElement city;

    // By state = By.xpath("//input[@id='customer.address.state']");
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.address.state']")
    WebElement state;

    // By zipcode = By.xpath("//input[@id='customer.address.zipCode']");
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.address.zipCode']")
    WebElement zipcode;

    //By pnumber = By.xpath("//input[@id='customer.phoneNumber']");
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.phoneNumber']")
    WebElement pnumber;
    // By ssn = By.xpath("//input[@id='customer.ssn']");
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.ssn']")
    WebElement ssn;
    //By uname = By.xpath("//input[@id='customer.username']");
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.username']")
    WebElement uname;
    //By pass = By.xpath("//input[@id='customer.password']");
    @CacheLookup
    @FindBy(xpath="//input[@id='customer.password']")
    WebElement pass;
    // By cpass = By.xpath("//input[@id='repeatedPassword']");
    @CacheLookup
    @FindBy(xpath="//input[@id='repeatedPassword']")
    WebElement cpass;
    //By regbutton = By.xpath("//input[@value='Register']");
    @CacheLookup
    @FindBy(xpath="//input[@value='Register']")
    WebElement regbutton;


    public void regclick() {
        clickOnElement(reglink);
    }

    public void enterfname(String fname1) {
        sendTextToElement(fname, fname1);
    }

    public void enterlname(String lname1) {
        sendTextToElement(lname, lname1);
    }

    public void enteradd(String add1) {
        sendTextToElement(add, add1);
    }

    public void entercity(String city1) {
        sendTextToElement(city, city1);
    }

    public void enterstate(String state1) {
        sendTextToElement(state, state1);
    }

    public void enterzip(String zipcode1) {
        sendTextToElement(zipcode, zipcode1);
    }

    public void enterpnumber(String pnumber1) {
        sendTextToElement(pnumber, pnumber1);
    }

    public void enterssn(String ssn1) {
        sendTextToElement(ssn, ssn1);
    }

    public void enteruname(String uname1) {
        sendTextToElement(uname, uname1);
    }

    public void enterpass(String pass1) {
        sendTextToElement(pass, pass1);
    }

    public void entercpass(String cpass1) {
        sendTextToElement(cpass, cpass1);
    }

    public void clickonbutton1(){
        clickOnElement(regbutton);
    }




}
