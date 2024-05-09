package stepdefinitions;


import driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SimpleFormPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SimpleForm_StepDefs {
    SimpleFormPage simpleFormPage = new SimpleFormPage(Driver.getPage());

    @Given("user is on the LambdaTest’s Selenium Playground page")
    public void user_is_on_the_lambda_test_s_selenium_playground_page() {
        simpleFormPage.navigateToUrl();
    }
    @When("user clicks Simple Form Demo")
    public void user_clicks_simple_form_demo() {
        simpleFormPage.clickSimpleFormDemo();
    }
    @Then("the url should contain {string}")
    public void the_url_should_contain(String expectedUrl) {
        assertTrue(simpleFormPage.getUrl().contains(expectedUrl));
    }
    @When("user enters {string} in the Enter Message text box")
    public void user_enters_in_the_enter_message_text_box(String messageText) {
        simpleFormPage.enterMessage(messageText);
    }
    @When("user clicks Get Checked Value")
    public void user_clicks_get_checked_value() {
        simpleFormPage.clickGetCheckedValueButton();
    }
    @Then("{string} should be displayed in the right-hand panel under the Your Message section")
    public void should_be_displayed_in_the_right_hand_panel_under_the_your_message_section(String expectedMessageText) {
        assertEquals(expectedMessageText,simpleFormPage.getYourMessage());
    }
}
