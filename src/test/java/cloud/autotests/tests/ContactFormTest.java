package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ContactFormTest extends TestBase {
    @Test
    @Description("ContactFormTest")
    @DisplayName("Тестирование Контактной формы c валидными данными")
    void ValidationFormTest() {
        step("Открыть url 'http://testdoc.torgi223.ru/'", () ->
                open("http://testdoc.torgi223.ru/"));
        step("В поле Имя ввести валидное имя", () ->
                $("#name-form1-4").setValue("Ilya"));
        step("В поле Email ввести валидный адрес", () ->
                $("#email-form1-4").setValue("test@mail.ru"));
        step("В поле Телефон ввести валидный номер", () ->
                $("#phone-form1-4").setValue("777777777777"));
        step("В поле сообщение ввести валидное сообщение", () ->
                $("#message-form1-4").setValue("TestTestTest"));
        step("Нажать на кнопку отправить", () ->
                $x("//*[@class='btn btn-primary btn-form display-4']").click());
    }
}
