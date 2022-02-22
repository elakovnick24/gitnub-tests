package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            header = $(".ml-md-n3 > .h1-mktg"),
            search = $("[data-test-selector=nav-search-input]"),
            repoList = $(".repo-list-item:nth-child(1) em");

    public MainPage headerShouldBeVisible() {
        open("/");
        header.should(Condition.textCaseSensitive("Where the world builds software"));
        return this;
    }

    public MainPage searchSelenideRepo() {
        search.setValue("selenide").pressEnter();
        return this;
    }

    public MainPage redirectToSelenideRepoFromList() {
        repoList.click();
        return this;
    }
}
