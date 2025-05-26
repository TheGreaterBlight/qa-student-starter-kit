package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SampleAppPage;

public class PlaygroundTest extends BaseTest {

    @Test
    public void SampleAppTest() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().isDisplayed(),"Main page is not Displayed");
        mainPage.clickSampleBtn();
        SampleAppPage sampleAppPage = new SampleAppPage();
        sampleAppPage.sendRandomLogin();
        sampleAppPage.clickLogIn();
        Assert.assertTrue(sampleAppPage.isWelcomeMsgDisplayed()," Users don't match");
    }
}
