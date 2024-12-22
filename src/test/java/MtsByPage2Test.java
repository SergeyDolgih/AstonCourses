import org.testng.Assert;
import org.testng.annotations.*;

public class MtsByPage2Test extends MtsBy2Page {

    @Test(description = "Проверка надписей в незаполненном поле 'Услуги связи'")
    void checkCommunicationServices() {
        handleCookiePopup();
        Assert.assertEquals(driver.findElement(placeholderNumberPhone).getAttribute("placeholder"),
                "Номер телефона");
        Assert.assertEquals(driver.findElement(placeholderSumPhone).getAttribute("placeholder"),
                "Сумма");
        Assert.assertEquals(driver.findElement(placeholderEmailPhone).getAttribute("placeholder"),
                "E-mail для отправки чека");
    }

    @Test(description = "Проверка надписей в незаполненном поле 'Домашний Интернет'")
    void checkHomeInternet(){
        homeInternet();
        Assert.assertEquals(driver.findElement(placeholderNumberInternet).getAttribute("placeholder"),
                "Номер абонента");
        Assert.assertEquals(driver.findElement(placeholderSumInternet).getAttribute("placeholder"),
                "Сумма");
        Assert.assertEquals(driver.findElement(placeholderEmailInternet).getAttribute("placeholder"),
                "E-mail для отправки чека");
    }

    @Test(description = "Проверка надписей в незаполненном поле 'Рассрочка'")
    void checkInstallmentPlan(){
        installmentPlan();
        Assert.assertEquals(driver.findElement(placeholderScoreInstalment).getAttribute("placeholder"),
                "Номер счета на 44");
        Assert.assertEquals(driver.findElement(placeholderSumInstalment).getAttribute("placeholder"),
                "Сумма");
        Assert.assertEquals(driver.findElement(placeholderEmailInstalment).getAttribute("placeholder"),
                "E-mail для отправки чека");
    }
    @Test(description = "Проверка надписей в незаполненном поле 'Задолженность'")
    void checkDebt() {
        debt();
        Assert.assertEquals(driver.findElement(placeholderScoreDebt).getAttribute("placeholder"),
                "Номер счета на 2073");
        Assert.assertEquals(driver.findElement(placeholderSumDebt).getAttribute("placeholder"),
                "Сумма");
        Assert.assertEquals(driver.findElement(placeholderEmailDebt).getAttribute("placeholder"),
                "E-mail для отправки чека");
    }

    @Test(description = "Проверка коррекности отображения суммы и полей ввода реквизитов карты")
    void checkPaymentWindow(){
        paymentWindow();
        Assert.assertEquals(driver.findElement(priceHeader).getAttribute("outerText"), "5.00 BYN");
        Assert.assertEquals(driver.findElement(btnPrice).getAttribute("outerText"), "Оплатить 5.00 BYN");
        Assert.assertEquals(driver.findElement(priceHeaderNumber).getAttribute("outerText"), "Оплата: Услуги связи Номер:375297777777");
        Assert.assertEquals(driver.findElement(cardNumber).getAttribute("outerText"), "Номер карты");
        Assert.assertEquals(driver.findElement(cardValidity).getAttribute("outerText"), "Срок действия");
        Assert.assertEquals(driver.findElement(cardCVC).getAttribute("outerText"), "CVC");
        Assert.assertEquals(driver.findElement(cardName).getAttribute("outerText"), "Имя держателя (как на карте)");
        Assert.assertEquals(driver.findElement(buttonGPay).getAttribute("ariaLabel"), "Google Pay");
    }
}