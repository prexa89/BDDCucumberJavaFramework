package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

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

    }
}
