package stepdefinitions;



import driver.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DragAndDropPage;

import static org.junit.Assert.assertEquals;


public class DragAndDrop_StepDefs {

    DragAndDropPage dragAndDropPage = new DragAndDropPage(Driver.getPage());
    @When("user clicks Drag & Drop Sliders")
    public void user_clicks_drag_drop_sliders() {
        dragAndDropPage.clickDragAndDropSliders();
    }
    @When("user selects the slider Default value {int}")
    public void user_selects_the_slider_default_value(Integer int1) {
        dragAndDropPage.navigateToSliderDefault15();
    }
    @When("user drags the bar to make the slider value {int}")
    public void user_drags_the_bar_to_make_the_slider_value(Integer targetDefaultValue) {
        dragAndDropPage.dragTo95();
    }
    @Then("the slider value should be {int}")
    public void the_slider_value_should_be(int expectedSliderValue) {
        assertEquals(expectedSliderValue, dragAndDropPage.getSliderValue());
    }


}
