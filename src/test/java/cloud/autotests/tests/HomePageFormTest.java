package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class HomePageFormTest extends TestBase {

    @Test
    @Description("HomePageFormTest")
    @DisplayName("Тестирование вкладки Процедуры")
    void proceduresTitleTest() {
        step("Открыть url 'http://testdoc.torgi223.ru/'", () ->
                open("http://testdoc.torgi223.ru/"));
        step("Перейти на вкладку процедуры", () ->
                $x("//*[@class='nav-item']//*[text() = 'Процедуры']").click());
    }

    @Test
    @Description("HomePageFormTest")
    @DisplayName("Тестирование вкладки Запросы")
    void requestsTitleTest() {
        step("Открыть url 'http://testdoc.torgi223.ru/'", () ->
                open("http://testdoc.torgi223.ru/"));
        step("Перейти на вкладку Запросы", () ->
                $x("//*[@class='nav-item']//*[text() = 'Запросы']").click());
    }

    @Test
    @Description("HomePageFormTest")
    @DisplayName("Тестирование вкладки Договоры")
    void ContractsTitleTest() {
        step("Открыть url 'http://testdoc.torgi223.ru/'", () ->
                open("http://testdoc.torgi223.ru/"));
        step("Перейти на вкладку Договоры", () ->
                $x("//*[@class='nav-item']//*[text() = 'Договоры']").click());
    }

    @Test
    @Description("HomePageFormTest")
    @DisplayName("Тестирование вкладки Настройки")
    void SettingsTitleTest() {
        step("Открыть url 'http://testdoc.torgi223.ru/'", () ->
                open("http://testdoc.torgi223.ru/"));
        step("Перейти на вкладку Настройки", () ->
                $x("//*[@class='nav-item']//*[text() = 'Настройки']").click());
    }


}
