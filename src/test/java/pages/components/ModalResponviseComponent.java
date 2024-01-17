package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ModalResponviseComponent {

    public void checkResult(String key, String valeu) {
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(valeu));
    }
}
