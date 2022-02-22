package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class WikiPage {

    private final SelenideElement
            headerWiki = $(".markdown-body > h1"),
            wikiPageFilter = $("#wiki-pages-filter"),
            softAssertion = $(".Box-row:nth-child(17) .flex-1"),
            listCodeExample = $(".markdown-body");



    public WikiPage checkWiliOpened() {
        headerWiki.shouldHave(text("Welcome to the selenide wiki!"));
        return this;
    }

    public WikiPage searchPageSoftAssertion(String softAssertions) {
        wikiPageFilter.setValue(softAssertions).pressEnter();
        return this;
    }

    public WikiPage openSoftAssertion() {
        softAssertion.click();
        return this;
    }

    public WikiPage shouldHaveExampleExtensions() {
        listCodeExample.shouldHave(text("JUnit5 extension"));
        return this;
    }

    public WikiPage shouldHaveExampleUsingJUnit5() {
        listCodeExample.shouldHave(text("Using JUnit5 extend test class:"));
        return this;
    }

}
