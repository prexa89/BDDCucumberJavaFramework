package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterSteps extends DriverManager {
    RegisterPage registerPage = new RegisterPage();
    DriverManager driverManager = new DriverManager();

    @Given("^: I am at registration page$")
    public void i_am_at_registration_page() throws Throwable {

    }

    @And("^I click on register$")
    public void i_click_on_register() throws Throwable {
        registerPage.regButton();
    }

    @When("^I select gender as female$")
    public void i_select_gender_as_female() throws Throwable {
        registerPage.setRadio();

    }@When("^I select gender as male$")
    public void i_select_gender_as_male() throws Throwable {
        registerPage.setMaleRadio();
    }


    @And("^I enter firstname as\"([^\"]*)\" and lastname as \"([^\"]*)\"$")
    public void i_enter_firstname_as_and_lastname_as(String CurrentName, String CurrentLastName) throws Throwable {

        registerPage.firstName(CurrentName);
        registerPage.lstName(CurrentLastName);
    }

    @And("^I enter Email as \"([^\"]*)\"$")
    public void i_enter_Email_as(String CurrentEmail) throws Throwable {
        registerPage.myMail(CurrentEmail);

    }

    @When("^I select date of birth and month of birth and year of birth$")
    public void i_select_date_of_birth_and_month_of_birth_and_year_of_birth() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        registerPage.dateOfBirth();
        registerPage.dateOfMonth();
        registerPage.dateOfYear();
    }


    @And("^I enter  password as\"([^\"]*)\" and  enter confirm password as \"([^\"]*)\"$")
    public void i_enter_password_as_and_enter_confirm_password_as(String CurrentPassword, String CurrentConfirmPassword) throws Throwable {
        registerPage.passWord(CurrentPassword);
        registerPage.confirmPasssword(CurrentConfirmPassword);
    }

    @When("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
        registerPage.registerButton();
    }

    @When("^I enter following details to register$")
    public void i_enter_following_details_to_register(DataTable registrationTable) throws Throwable {
        List<Map<String, String>> data =  registrationTable.asMaps(String.class, String.class);
        System.out.println(data);
        registerPage.firstName(data.get(0).get("firstName"));
        registerPage.lstName(data.get(0).get("lastName"));
        registerPage.myMail(data.get(0).get("email"));
        registerPage.passWord(data.get(0).get("password"));
        registerPage.confirmPasssword(data.get(0).get("confirmPassword"));

        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();
    }
    @When("^I enter company name as \"([^\"]*)\"$")
    public void i_enter_company_name_as(String company) throws Throwable {
        registerPage.myCompanyName(company);

    }

    @When("^I select  option for Newspaper$")
    public void i_select_option_for_Newspaper() throws Throwable {
        //registerPage.newsLetterCheckBox();
        registerPage.newsLetterCheckBox();
        // boolean newsLetterCheckBox = registerPage.newsLetterCheckBox();
        // assertThat(newsLetterCheckBox, is(true));
    }    //System.out.println();


        //@And("^I click on logoutbutton$")
        // public void i_click_on_logoutbutton() throws Throwable {
        //registerPage.clickLogout();


        // @When("^I select gender as \"([^\"]*)\"$")
        // public void iSelectGenderAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        @When("^I  do not select  option for Newspaper$")
        public void i_do_not_select_option_for_Newspaper() throws Throwable {
            registerPage.newsLetterCheckBox();

        }
    }