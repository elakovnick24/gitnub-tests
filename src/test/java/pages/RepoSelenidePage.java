package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class RepoSelenidePage {

    private final SelenideElement
    selenidePageHeader = $("#repository-container-header"),
    wikiTab = $("#wiki-tab > span:nth-child(2)");


    public void shouldBeSelenide(String nameRepo) {
        selenidePageHeader.shouldHave(text(nameRepo));
    }

    public void shouldHaveWikiTab() {
        wikiTab.click();
    }
}
