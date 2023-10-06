package hometask16;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class ProgrammingPage extends BasePage {
    private final SelenideElement programmingLanguageDropdown = Selenide.$(".programming-language");

    public String getProgrammingLanguage() {
        return programmingLanguageDropdown.getSelectedText();
    }

    public void selectProgrammingLanguage(String language) {
        programmingLanguageDropdown.selectOption(language);
    }
}
