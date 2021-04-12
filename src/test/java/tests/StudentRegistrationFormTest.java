package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.StudentRegistrationFormPage;

public class StudentRegistrationFormTest extends TestBase {

    public StudentRegistrationFormPage page = new StudentRegistrationFormPage();

    @Test
    @Tag("positive")
    @DisplayName("Successful complete students registration form")
    public void fillPracticeFormTest() {
        page.openPage();
        page.fillForm();
        page.checkData();
    }

    @Test
    @Tag("negaitive")
    @DisplayName("Unsuccessful complete students registration form")
    public void fillPracticeFormNegativeTest() {
        page.openPage();
        page.fillFormWithoutAddress();
        page.checkData();
    }
}