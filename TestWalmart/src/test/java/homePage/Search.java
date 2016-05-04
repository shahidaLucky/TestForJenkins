package homePage;

import commonAPI.BaseFunctions;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 4/28/2016.
 */
public class Search extends BaseFunctions {

    @Test
    public void test() throws InterruptedException {

        System.out.println("Test has started");
        typeByCss("#search", "ipad");
        Thread.sleep(2000);
        clickOnCss(".searchbar-submit.js-searchbar-submit");
        navigateBack();
        Thread.sleep(2000);
        clickOnCss(".js-flyout-toggle.dropdown");
        typeByCss("#search", "baby dolls");
        clickOnCss(".searchbar-submit.js-searchbar-submit");
        Thread.sleep(2000);
        navigateBack();
        clickOnCss(".dropdown-link.js-flyout-toggle.flyout-toggle");
        Thread.sleep(2000);
        clickOnCss(".js-account-flyout-logged-out.active>li>a");
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        System.out.println("Test has ended");
    }
}
