package hometask16;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class DesignPage extends TestingPage {
    private final SelenideElement designElements = Selenide.$(".design-elements");
    private final SelenideElement designProjects = Selenide.$(".design-projects");

    public String getDesignElements() {
        return designElements.getText();
    }

    public String getDesignProjects() {
        return designProjects.getText();
    }

    // Додайте інші методи для взаємодії з іншими елементами сторінки, якщо потрібно
}