package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AnotherGitTest {

    @Test
    void anotherGitTest() {
        Configuration.holdBrowserOpen=true;

        open("https://github.com");
        $(".header-menu-wrapper").find(byText("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        $(".h1-mktg").shouldHave(text("Build like the best"));
    }
}
