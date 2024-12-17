import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class MtsByPage {

    public WebDriver driver;
    public By title = By.xpath("//div[@class='pay__wrapper']/h2");
    public By logoVisa = By.xpath("//img[@alt='Visa']");
    public By logoVerifiedByVisa = By.xpath("//img[@alt='Verified By Visa']");
    public By logoMasterCard = By.xpath("//img[@alt='MasterCard']");
    public By logoMasterCardSecureCode = By.xpath("//img[@alt='MasterCard Secure Code']");
    public By logoBelcard = By.xpath("//img[@alt='Белкарт']");
    public By link = By.xpath("//a[text() = 'Подробнее о сервисе']");
    public By continueBtn = By.xpath("//label[@class='ng-tns-c58-2 ng-star-inserted']");

    @BeforeTest
    public void setUp() {
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\100nout\\IdeaProjects\\AstonCourses\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mts.by/");
    }

    public void moreInfoLink() {
        driver.findElement(link).click();
    }

    public void pushButton() {
        driver.findElement(By.xpath("//input[@placeholder='Номер телефона']"))
                .click();
        driver.findElement(By.xpath("//input[@placeholder='Номер телефона']"))
                .sendKeys("297777777");
        driver.findElement(By.xpath("//input[@placeholder='Сумма']"))
                .click();
        driver.findElement(By.xpath("//input[@placeholder='Сумма']"))
                .sendKeys("5");
        driver.findElement(By.xpath("//button[@class = 'button button__default ']"))
                .click();
    }

    public void handleCookiePopup() {
        By cookieButtonLocator = By.xpath("//button[@class='btn btn_black cookie__ok']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            WebElement cookieButton = wait.until(ExpectedConditions.elementToBeClickable(cookieButtonLocator));
            cookieButton.click();
        } catch (TimeoutException | NoSuchElementException ignored) {
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}