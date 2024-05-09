package pages;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import utils.BrowserUtils;

public class SimpleFormPage {

    private Page page;
    private final Locator SIMPLEFORMDEMO;
    private final Locator MESSAGETEXTBOX;
    private final Locator GETCHECKEDVALUEBUTTON;
    private final Locator YOURMESSAGE;
    private final Locator ALLOW_SELECTION;

    public SimpleFormPage(Page page) {
        this.page = page;
        this.SIMPLEFORMDEMO = page.locator("//a[.='Simple Form Demo']");
        this.MESSAGETEXTBOX = page.getByPlaceholder("Please enter your Message");
        this.GETCHECKEDVALUEBUTTON = page.locator("#showInput");
        this.YOURMESSAGE = page.locator("#message");
        this.ALLOW_SELECTION = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Allow Selection"));

    }

    public void navigateToUrl(){
        page.navigate(BrowserUtils.getProperty("url"));
        try {
            clickAllowSelection();
        }catch (Exception ignored){}
    }
    public String getUrl(){
        return this.page.url();
    }
    public void clickSimpleFormDemo(){
        this.SIMPLEFORMDEMO.click();
    }

    public void enterMessage(String message){
        this.MESSAGETEXTBOX.fill(message);
    }

    public void clickGetCheckedValueButton(){
        this.GETCHECKEDVALUEBUTTON.click();
    }

    public String getYourMessage(){
        return this.YOURMESSAGE.innerText();
    }

    public  void clickAllowSelection(){
        this.ALLOW_SELECTION.click();

    }

}
//change
