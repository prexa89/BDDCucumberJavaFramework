package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.LoginPage;
import com.resourcewise.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;


public class CommanSteps extends DriverManager {

    DriverManager driverManager=new DriverManager();
    LoginPage loginPage=new LoginPage();
    RegisterPage registerPage=new RegisterPage();

    @Then("^I Should see \"([^\"]*)\" text on \"([^\"]*)\" page$")
    public void i_Should_see_text_on_page(String expectedText, String pageType) throws Throwable {
        switch (pageType){
            case "login":
                String myActualMessage =loginPage.getWelcomeMessageOnLoginPage();
                System.out.println(myActualMessage);
                System.out.println(expectedText);
                assertThat(myActualMessage, is(equalToIgnoringCase(expectedText)));break;
            case "registration":
                String myRegistrationMessage=registerPage.regiMessage();
                System.out.println(myRegistrationMessage);
                System.out.println(expectedText);
                assertThat(myRegistrationMessage, is(equalToIgnoringCase(expectedText)));

        }

    }

    @And("^the url should contain with\"([^\"]*)\"$")
    public void the_url_should_contain_with(String expectedUrl) throws Throwable {
        String actualUrl=driverManager.getUrl();
        assertThat(actualUrl,containsString(expectedUrl));

    }

}
