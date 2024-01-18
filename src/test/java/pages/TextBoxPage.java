package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {

    private SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit"),
            output = $("#output");

    public TextBoxPage openPage() {
        open("/text-box");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public TextBoxPage setUserName(String valeu) {
        userNameInput.setValue(valeu);

        return this;
    }

    public TextBoxPage setUserEmail(String valeu) {
        userEmailInput.setValue(valeu);

        return this;
    }

    public TextBoxPage setCurrentAddress(String valeu) {
        currentAddressInput.setValue(valeu);

        return this;
    }

    public TextBoxPage setPermanentAddress(String valeu) {
        permanentAddressInput.setValue(valeu);

        return this;
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public TextBoxPage checkResult(String valeu) {
        output.shouldBe(text(valeu));

        return this;
    }

}
