import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class MtsBy2Page {

    public WebDriver driver;
    public By placeholderNumberPhone = By.xpath("//input[@id='connection-phone']");
    public By placeholderSumPhone = By.xpath("//input[@id='connection-sum']");
    public By placeholderEmailPhone = By.xpath("//input[@id='connection-email']");
    public By placeholderNumberInternet = By.xpath("//input[@id='internet-phone']");
    public By placeholderSumInternet = By.xpath("//input[@id='internet-sum']");
    public By placeholderEmailInternet = By.xpath("//input[@id='internet-email']");
    public By placeholderScoreInstalment = By.xpath("//input[@id='score-instalment']");
    public By placeholderSumInstalment = By.xpath("//input[@id='instalment-sum']");
    public By placeholderEmailInstalment = By.xpath("//input[@id='instalment-email']");
    public By placeholderScoreDebt = By.xpath("//input[@id='score-arrears']");
    public By placeholderSumDebt = By.xpath("//input[@id='arrears-sum']");
    public By placeholderEmailDebt = By.xpath("//input[@id='arrears-email']");
    public By priceHeader = By.xpath("//div[@class='pay-description__cost']");
    public By btnPrice = By.xpath("//button[@class='colored disabled']");
    public By priceHeaderNumber = By.xpath("//div[@class='pay-description__text']");
    public By cardNumber = By.xpath("//label[@class='ng-tns-c46-1 ng-star-inserted']");
    public By cardValidity = By.xpath("//label[@class='ng-tns-c46-4 ng-star-inserted']");
    public By cardCVC = By.xpath("//label[@class='ng-tns-c46-5 ng-star-inserted']");
    public By cardName = By.xpath("//label[@class='ng-tns-c46-3 ng-star-inserted']");
    public By buttonGPay = By.xpath("//button[@class='gpay-card-info-container black plain short en border-inset']");

    public void handleCookiePopup() {
        By cookieButtonLocator = By.xpath("//button[@class='btn btn_black cookie__ok']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            WebElement cookieButton = wait.until(ExpectedConditions.elementToBeClickable(cookieButtonLocator));
            cookieButton.click();
        } catch (TimeoutException | NoSuchElementException ignored) {
        }
    }

    public void homeInternet() {
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[@class='select__option'][text() = 'Домашний интернет']")).click();
    }

    public void installmentPlan(){
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[@class='select__option'][text() = 'Рассрочка']")).click();
    }

    public void debt(){
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[@class='select__option'][text() = 'Задолженность']")).click();
    }

    public void paymentWindow(){
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[@class='select__option'][text() = 'Услуги связи']")).click();
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']")));
    }
}
