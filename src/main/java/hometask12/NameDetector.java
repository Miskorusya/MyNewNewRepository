import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class NameDetector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

        try {
            driver.get("https://ithillel.ua/");

            WebElement programmingCourse = driver.findElement(By.xpath("//*[@id='body']/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div/p[1]"));
            programmingCourse.click();

            WebElement frontEndBasicCourse = driver.findElement(By.xpath("//*[@id='categories']/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a/div[2]"));
            frontEndBasicCourse.click();

            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("window.scrollBy(0, 3150)");

            WebElement coachesSectionTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='coachesSection']/div/div/div/h2")));

            WebElement showAllButton = driver.findElement(By.xpath("//*[@id='coachesShowAllButton']"));
            showAllButton.click();

            Thread.sleep(300);

            List<WebElement> coachNameElements = driver.findElements(By.cssSelector("p.coach-card_name"));

            for (WebElement coachNameElement : coachNameElements) {
                System.out.println(coachNameElement.getText());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

