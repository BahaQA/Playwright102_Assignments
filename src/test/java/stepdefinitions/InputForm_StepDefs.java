package stepdefinitions;


import driver.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InputForm_Page;

import java.util.Map;

import static org.junit.Assert.assertEquals;


public class InputForm_StepDefs {

    InputForm_Page inputFormPage = new InputForm_Page(Driver.getPage());
    @When("user clicks Input Form Submit")
    public void user_clicks_input_form_submit() {
       inputFormPage.clickInputFormSubmit();
    }
    @When("user clicks Submit button")
    public void user_clicks_submit_button() {
        inputFormPage.clickSubmit();
    }
    @Then("user should see the error message: {string}")
    public void user_should_see_the_error_message(String expectedErrorMessage) {
       assertEquals(expectedErrorMessage, inputFormPage.getValidationMessage());
    }
    @When("user fills all the fields")
    public void user_fills_all_the_fields(Map<String, String> inputData) {
       inputFormPage.inputFields(inputData);
    }
    @When("user clicks Submit")
    public void user_clicks_submit() {
       inputFormPage.clickSubmit();
    }
    @Then("user should see the message: {string}")
    public void user_should_see_the_message(String expectedThanksMessage) {
        assertEquals(expectedThanksMessage, inputFormPage.getThanksMessage() );

    }


}
