package com.resourcewise.step_def;

import com.resourcewise.driver.DriverManager;
import com.resourcewise.pages.CategoryPageShoppingCart;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingCartSteps extends DriverManager {
    DriverManager driverManager=new DriverManager();
    CategoryPageShoppingCart categoryPage=new CategoryPageShoppingCart();

    @When("^I select category of computer$")
    public void i_select_category_of_computer() throws Throwable {
        categoryPage.selectComputer();

    }

    @And("^I select subcategory of desktops$")
    public void i_select_subcategory_of_desktops() throws Throwable {
       categoryPage.selectDesktop();
    }

    @And("^I select the Lenovo PC$")
    public void i_select_the_Lenovo_PC() throws Throwable {
        categoryPage.lenovoP();

    }

    @And("^I add this product into the cart$")
    public void i_add_this_product_into_the_cart() throws Throwable {
        categoryPage.addToCartButton();

    }
    @Then("^I should see the product in the shopping cart$")
    public void i_should_see_the_product_in_the_shopping_cart() throws Throwable {
        categoryPage.tabCloseB();
    }
    @And("^I close add to cart message$")
    public void i_close_add_to_cart_message() throws Throwable {
        categoryPage.tabCloseB();
    }

    @When("^I click on shopping cart Button$")
    public void i_click_on_add_to_cart_Button() throws Throwable {
        categoryPage.basketButton();

    }@And("^I click on terms and condition$")
    public void i_click_on_terms_and_condition() throws Throwable {
        categoryPage.termsAndCondition();


    }@And("^I click on checkout button$")
    public void i_click_on_checkout_button() throws Throwable {
        categoryPage.checkOutButton();

}}
