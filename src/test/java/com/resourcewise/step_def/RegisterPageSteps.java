package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.LoginPage;
import com.resourcewise.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegisterPageSteps extends DriverManager {
    RegisterPage registerPage=new RegisterPage();
    DriverManager driverManager=new DriverManager();

    @Given("^: I am at registration page$")
    public void i_am_at_registration_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }@And("^I click on register$")
    public void i_click_on_register() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        registerPage.regButton();
    }//@When("^I enter first name as\"([^\"]*)\" last name as \"([^\"]*)\" email address \"$")
    //public void i_enter_first_name_as_last_name_as_email_address(String CurrentName, String CurrentLastName) throws Throwable {
    @When("^I enter firstname as\"([^\"]*)\" and lastname as \"([^\"]*)\"$")
    public void i_enter_firstname_as_and_lastname_as(String CurrentName, String CurrentLastName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        registerPage.firstName(CurrentName);
        registerPage.lstName(CurrentLastName);
    }  @And("^I enter Email as \"([^\"]*)\"$")
        public void i_enter_Email_as(String CurrentEmail) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
           // throw new PendingException();
        registerPage.myMail(CurrentEmail);
        }

    @And("^I enter  password as\"([^\"]*)\" and  enter confirm password as \"([^\"]*)\"$")
    public void i_enter_password_as_and_enter_confirm_password_as(String CurrentPassword, String CurrentConfirmPassword) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        registerPage.passWord(CurrentPassword);
        registerPage.confirmPasssword(CurrentConfirmPassword);
    }@When("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();

    //@And("^: I click on register button$")
   // public void i_click_on_register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        registerPage.registerButton();
    }
}

