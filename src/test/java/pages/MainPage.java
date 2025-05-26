package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;


public class MainPage extends Form {
    private final IButton clickSampleApp = getElementFactory().getButton(By.xpath("//a[contains(@href,'sampleapp')]"), "Sample App Btn");

    public MainPage() {
        super(By.xpath("//nav[@class='navbar navbar-expand-lg navbar-light bg-light']"), "Main Page");
    }

    public void clickSampleBtn() {
        clickSampleApp.click();
    }
}
