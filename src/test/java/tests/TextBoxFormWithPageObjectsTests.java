package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxFormWithPageObjectsTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void successfulFillTextBoxFormTest() {
        textBoxPage.openPage()
                .setUserName("Billy Milligan")
                .setUserEmail("BillyMilli@mail.ru")
                .setCurrentAddress("55 W Gore St, Orlando, FL 32806, Stany Zjednoczone")
                .setPermanentAddress("40392-544, Avenida Clara, 0209 Porto Carla do Sul - PA")
                .clickSubmitButton();

        textBoxPage.checkResult("Billy Milligan")
                .checkResult("BillyMilli@mail.ru")
                .checkResult("55 W Gore St, Orlando, FL 32806, Stany Zjednoczone")
                .checkResult("40392-544, Avenida Clara, 0209 Porto Carla do Sul - P");
    }
}
