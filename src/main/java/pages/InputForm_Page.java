package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.SelectOption;

import java.util.Map;

public class InputForm_Page {
    private Page page;
    private final Locator INPUT_FORM_SUBMIT;
    private final Locator SUBMIT_BUTTON;
    private final Locator ERROR_MESSAGE;
    private final Locator NAME;
    private final Locator EMAIL;
    private final Locator PASSWORD;
    private final Locator COMPANY;
    private final Locator WEBSITE;
    private final Locator COUNTRY_DROPDOWN;
    private final Locator CITY;;
    private final Locator ADDRESS1;
    private final Locator ADDRESS2;
    private final Locator STATE;
    private final Locator ZIPCODE;
    private final Locator THANKS_MESSAGE;
    private final Locator ALLOW_SELECTION;

    public InputForm_Page(Page page) {
        this.page = page;
        this.INPUT_FORM_SUBMIT = page.locator("a[href='https://www.lambdatest.com/selenium-playground/input-form-demo']");
               // page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Input Form Submit")); //not stable
        this.SUBMIT_BUTTON = page.locator("text=Submit");
        this.ERROR_MESSAGE = page.locator("text=Please fill out this field.");
        this.NAME = page.locator("input[name='name']");
        this.EMAIL = page.locator("input[id='inputEmail4']");
        this.PASSWORD = page.locator("input[name='password']");
        this.COMPANY = page.getByPlaceholder("Company");
        this.WEBSITE = page.getByPlaceholder("Website");
        this.COUNTRY_DROPDOWN = page.locator("select[name='country']");
        this.CITY = page.locator("#inputCity");
        this.ADDRESS1 = page.locator("#inputAddress1");
        this.ADDRESS2 = page.locator("#inputAddress2");
        this.STATE = page.locator("#inputState");
        this.ZIPCODE = page.locator("#inputZip");
        this.THANKS_MESSAGE = page.locator("p[class='success-msg hidden']");
        this.ALLOW_SELECTION = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Allow Selection"));
    }

    public void clickInputFormSubmit(){
        try {
            clickAllowSelection();
        }catch (Exception ignored){}

        this.INPUT_FORM_SUBMIT.click();
    }

    public void clickSubmit(){
        this.SUBMIT_BUTTON.click();
    }
    public String getValidationMessage(){
        return (String) page.evaluate("document.querySelector(\"input[placeholder='Name']\").validationMessage");
    }
    public void inputFields(Map<String, String > inputData){
        this.NAME.fill(inputData.get("Name"));
        this.EMAIL.fill(inputData.get("Email"));
        this.PASSWORD.fill(inputData.get("Password"));
        this.COMPANY.fill(inputData.get("Company"));
        this.WEBSITE.fill(inputData.get("Website"));
        this.COUNTRY_DROPDOWN.click();
        this.COUNTRY_DROPDOWN.selectOption(new SelectOption().setValue("US"));
        this.CITY.fill(inputData.get("City"));
        this.ADDRESS1.fill(inputData.get("Address 1"));
        this.ADDRESS2.fill(inputData.get("Address 2"));
        this.STATE.fill(inputData.get("State"));
        this.ZIPCODE.fill(inputData.get("Zip Code"));
    }

    public String getThanksMessage(){
        return this.THANKS_MESSAGE.innerText();
    }
    public  void clickAllowSelection(){
        this.ALLOW_SELECTION.click();

    }
}

