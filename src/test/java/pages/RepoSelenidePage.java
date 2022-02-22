package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class RepoSelenidePage {

    private final SelenideElement
    selenidePageHeader = $("#repository-container-header"),
    wikiTab = $("#wiki-tab > span:nth-child(2)");


    public RepoSelenidePage shouldBeSelenide() {
        selenidePageHeader.shouldHave(text("selenide / selenide"));
        return this;
    }

    public RepoSelenidePage shouldHaveWikiTab() {
        wikiTab.click();
        return this;
    }
}
