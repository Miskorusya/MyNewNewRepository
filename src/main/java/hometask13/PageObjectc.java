package hometask13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class PageObjectc {
    private WebDriver driver;
    private WebDriverWait wait;

    public PageObjectc(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public List<WebElement> getCourses() {
        return driver.findElements(By.cssSelector("div.course-card-title"));
    }

    public List<WebElement> getAdditionalCourses() {
        return driver.findElements(By.cssSelector("div.additional-course-card-title"));
    }

    public WebElement getOpportunities() {
        return driver.findElement(By.cssSelector("div.why-should-become__text"));
    }

    public void goToCategory(String category) {
        WebElement categoryLink = driver.findElement(By.linkText(category));
        categoryLink.click();
    }
}
