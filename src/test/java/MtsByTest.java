import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Objects;

public class MtsByTest extends MtsByPage {

    @Test(description = "Проверке блока 'Онлайн пополнение без комиссии")
    public void testBlockTitle() {
        Assert.assertEquals(driver.findElement(title).getAttribute("textContent"),
                "Онлайн пополнение без комиссии");
    }

    @Test(description = "Проверить наличие логотипов платёжных систем")
    void testLogosPayment() {
        Assert.assertTrue(driver.findElement(logoVisa).isDisplayed());
        Assert.assertTrue(driver.findElement(logoVerifiedByVisa).isDisplayed());
        Assert.assertTrue(driver.findElement(logoMasterCard).isDisplayed());
        Assert.assertTrue(driver.findElement(logoMasterCardSecureCode).isDisplayed());
        Assert.assertTrue(driver.findElement(logoBelcard).isDisplayed());
    }

    @Test(description = "Проверка работы ссылки 'Подробнее о сервисе'")
    public void testMoreInfoLink() {
        handleCookiePopup();
        moreInfoLink();
        Assert.assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
        driver.navigate().back();
    }

    @Test(description = "Проверка работы кнопки 'Продолжить'")
    public void testPushButton() {
        handleCookiePopup();
        pushButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']")));
        Assert.assertEquals(driver.findElement(continueBtn)
                .getAttribute("innerText"), "Сохранить данные карты для последующих оплат");
    }
}