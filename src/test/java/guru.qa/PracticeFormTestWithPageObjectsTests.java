package guru.qa;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.sleep;


public class PracticeFormTestWithPageObjectsTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulRegistrationTest() {
        registrationPage.openPage()
                .setFirstName("Billy")
                .setLastName("Milligan")
                .setUserEmail("billymilly@gogle.com")
                .setGender("Other")
                .setPhoneNubmer("9999999999")
                .setDateOfBirth("15", "July", "1993")
                .setUserSubjects("Com")
                .setUserHobbies("Sports")
                .uploadPicture("kek.png")
                .setCurrentAddress("55 W Gore St Orlando 32806")
                .setState("Haryana")
                .setCity("Panipat")
                .clickSubmitButton();

        registrationPage.checkResultResponsive("Student Name", "Billy Milligan")
                .checkResultResponsive("Student Email", "billymilly@gogle.com")
                .checkResultResponsive("Gender", "Other")
                .checkResultResponsive("Mobile", "9999999999")
                .checkResultResponsive("Date of Birth", "15 July,1993")
                .checkResultResponsive("Subjects", "Computer Science")
                .checkResultResponsive("Picture", "kek.png")
                .checkResultResponsive("Address", "55 W Gore St Orlando 32806")
                .checkResultResponsive("State and City", "Haryana Panipat");
    }

    @Test
    void minimalDataforRegistrationTest() {
        registrationPage.openPage()
                .setFirstName("Billy")
                .setLastName("Milligan")
                .setGender("Other")
                .setPhoneNubmer("9999999999")
                .clickSubmitButton();

        registrationPage.checkResultResponsive("Student Name", "Billy Milligan")
                .checkResultResponsive("Gender", "Other")
                .checkResultResponsive("Mobile", "9999999999");
    }

    @Test
    void negativeRegistrationTest() {
        registrationPage.openPage()
                .clickSubmitButton()
                .validationMatching("border-color", "rgb(220, 53, 69)");
    }
}


