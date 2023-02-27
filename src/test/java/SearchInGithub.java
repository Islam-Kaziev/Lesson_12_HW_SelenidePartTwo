import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class SearchInGithub {

    @Test
    void checkEnterprisePage() {
        open("https://github.com/");
        $$("ul.list-style-none button").get(1).hover();
        $(byTagAndText("a","Enterprise")).click();
        $("h1").shouldHave(text("Build like the best"));
    }
}
