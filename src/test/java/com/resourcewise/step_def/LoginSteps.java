package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;


public class LoginSteps extends DriverManager {
    LoginPage loginPage=new LoginPage();
    DriverManager driverManager=new DriverManager();


    @Then("^I Should see \"([^\"]*)\" text on login page$")
    public void i_Should_see_text_on_login_page(String expectedMessage) throws Throwable {
       String myActualwelcomeMessage = loginPage.getWelcomeMessageOnLoginPage();
        assertThat(myActualwelcomeMessage,is(equalToIgnoringCase(expectedMessage)));
    }



    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() throws Throwable {
        String myActualUrl= driverManager.getUrl();
        System.out.println(myActualUrl);
        assertThat(myActualUrl,is(endsWith("https://demo.nopcommerce.com/")));

    }//@And("^I enter valid email and password$")
    //public void i_enter_valid_email_and_password(String CurrentEmail,String CurrentPassword) throws Throwable {

    @Given("^I enter Email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_Email_as_and_password_as(String CurrentEmail, String CurrentPassword) throws Throwable {
        loginPage.myEmail(CurrentEmail);
        loginPage.myPassword(CurrentPassword);
        Thread.sleep(5000);

    }@When("^I Click on the Login button$")
    public void i_Click_on_the_Login_button() throws Throwable {
        loginPage.clickButton();
        Thread.sleep(5000);

    }@Given("^I enter  Email as \"([^\"]*)\"$")
    public void i_enter_Email_as(String CurrentEmail) throws Throwable {
        loginPage.myEmail(CurrentEmail);
        Thread.sleep(3000);

    }@When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
        loginPage.clickButton();
        Thread.sleep(5000);
    }
    @Then("^I should see logout button displayed$")
    public void i_should_see_logout_button_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        boolean logoutButtonDisplayed=loginPage.logoutButtonDisplayed();
        assertThat(logoutButtonDisplayed,is(true));

    }  @Then("^I click on logoutbutton$")
    public void i_click_on_logoutbutton() throws Throwable {
        loginPage.clickLogout();
    }



}
