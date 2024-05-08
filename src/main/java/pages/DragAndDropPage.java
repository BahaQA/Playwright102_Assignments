package pages;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.BoundingBox;

public class DragAndDropPage {

    private Page page;
    private final Locator DRAG_AND_DROP_SLIDERS;
    private final Locator RANGE_BAR;
    private final Locator DROPTARGET;

    public DragAndDropPage(Page page) {
        this.page = page;
        this.DRAG_AND_DROP_SLIDERS = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Drag & Drop Sliders"));
        this.RANGE_BAR = page.locator("input[value='15']");
        this.DROPTARGET = page.locator("#rangeSuccess");
    }

    public void clickDragAndDropSliders(){
        this.DRAG_AND_DROP_SLIDERS.click();
    }
    public void navigateToSliderDefault15(){
        this.RANGE_BAR.hover();
    }
    public void dragTo95(){
        ElementHandle rangeBar = RANGE_BAR.elementHandle();

        BoundingBox rangeBarBoundingBox = rangeBar.boundingBox();

        double startX = rangeBarBoundingBox.x + rangeBarBoundingBox.width * 0.15;
        double endX = rangeBarBoundingBox.x + rangeBarBoundingBox.width * 0.93;
        double centerY = rangeBarBoundingBox.y + rangeBarBoundingBox.height / 2;

        page.mouse().move(startX, centerY);
        page.mouse().down();
        page.mouse().move(endX, centerY);
        page.mouse().up();

    }
    public int getSliderValue(){
        return Integer.parseInt(DROPTARGET.innerText());
    }
}
