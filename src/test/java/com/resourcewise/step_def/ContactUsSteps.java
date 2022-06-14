package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.ContactUsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ContactUsSteps extends DriverManager {
    DriverManager driverManager=new DriverManager();
    ContactUsPage contactUsPage=new ContactUsPage();

    @When("^I click on contact us link$")
    public void i_click_on_contact_us_link() throws Throwable {
        contactUsPage.clickContactUs();
    }
    @And("^I should be on the \"([^\"]*)\" page$")
    public void i_should_see_the_text(String arg1) throws Throwable {
       String contactUsTitle= contactUsPage.getText();
        System.out.println(contactUsTitle);

    } @And("^I enter fullname as \"([^\"]*)\" and  fullemail as \"([^\"]*)\"$")
    public void i_enter_fullname_as_and_fullemail_as(String fullName, String fullEmail) throws Throwable {
        contactUsPage.fullName(fullName);
        contactUsPage.fullEmail(fullEmail);

    }@And("^I enter my message in enquiry box$")
    public void i_enter_my_message_in_enquiry_box() throws Throwable {
        contactUsPage.enquiryBox();

    }@And("^I click on submit$")
    public void i_click_on_submit() throws Throwable {
        contactUsPage.submitBtn();

    }
    @Then("^I should see the confirmation message$")
public void i_should_see_the_confirmation_message() throws Throwable {
   String confirmationMsg= contactUsPage.confirmMsg();
        System.out.println(confirmationMsg);
       // assertThat(confirmationMsg, is(equalToIgnoringCase(expectedText)));
}}

