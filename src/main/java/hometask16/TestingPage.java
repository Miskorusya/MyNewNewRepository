package hometask16;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;

public class TestingPage extends BasePage {
    private final SelenideElement coursesList = Selenide.$(".courses-list");
    private final SelenideElement additionalCoursesList = Selenide.$(".additional-courses");
    private final SelenideElement opportunities = Selenide.$(".opportunities");

    public String getCourses() {
        return coursesList.getText();
    }

    public String getAdditionalCourses() {
        return additionalCoursesList.getText();
    }

    public String getOpportunities() {
        return opportunities.getText();
    }

    public void goToCategory(String category) {
        Selenide.$(byText(category)).click();
    }
}
