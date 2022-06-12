package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HomePageSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    HomePage homePage=new HomePage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
       String myActualUrl= driverManager.getUrl();
        System.out.println(myActualUrl);
        assertThat(myActualUrl,is(endsWith("https://demo.nopcommerce.com/")));
    }
    @When("^I Click on the Log in$")
    public void i_Click_on_the()  {
        homePage.clickOnLoginButton();

    }@And("^I scroll down to footer$")
    public void i_scroll_down_to_footer() throws Throwable {
        homePage.scrollToPrivacyText();

    }@When("^I click on privacy policy$")
    public void i_click_on_privacy_policy() throws Throwable {
        homePage.clickOnPrivacyPolicy();

    }@Then("^I take screenshot of search field$")
    public void iTakeScreenshotOfSearchField() throws IOException {
        homePage.takeSearchFieldScreenshot();
    }}



