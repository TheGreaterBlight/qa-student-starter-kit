package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.UUID;

public class SampleAppPage extends Form {
    private final ITextBox searchFieldUser = getElementFactory().getTextBox(By.xpath("//input[contains(@name,'UserName')]"), "Text Field");
    private final ITextBox searchFieldPasswd = getElementFactory().getTextBox(By.xpath("//input[contains(@name,'Password')]"), "Password Field");
    private final String passwd = "pwd";
    private final String RANDOM_TEXT = UUID.randomUUID().toString();
    private final IButton clickLogInBtn = getElementFactory().getButton(By.xpath("//button[@class='btn btn-primary']"), "Login button");
    private final ILabel welcomeMsg = getElementFactory().getLabel(By.xpath("//label[contains(@class,'text-success')]"), "Welcome MSG");

    public SampleAppPage() {
        super(By.xpath("//button[@class='btn btn-primary']"), "Sample App page");
    }

    public void clickLogIn() {
        clickLogInBtn.click();
    }

    public void sendRandomLogin() {
        searchFieldPasswd.clearAndType(passwd);
        searchFieldUser.clearAndType(RANDOM_TEXT);
    }
    public Boolean isWelcomeMsgDisplayed() {
        String header = welcomeMsg.getText();
        return header.contains(RANDOM_TEXT);
    }
}
