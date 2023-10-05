package hometask16;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;

public class ProgrammingPage extends TestingPage {
    private final SelenideElement programmingLanguageDropdown = Selenide.$(".programming-language");

    public String getProgrammingLanguage() {
        return programmingLanguageDropdown.getSelectedText();
    }

    public void selectProgrammingLanguage(String language) {
        programmingLanguageDropdown.selectOption(language);
    }
}
