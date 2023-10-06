package hometask16;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public abstract class BasePage {

    protected final SelenideElement coursesList = Selenide.$(".courses-list");
    protected final SelenideElement additionalCoursesList = Selenide.$(".additional-courses");
    protected final SelenideElement opportunities = Selenide.$(".opportunities");

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

    }
}