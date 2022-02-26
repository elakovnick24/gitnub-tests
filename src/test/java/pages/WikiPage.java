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

    public void checkWikiOpened(String wikiHeader) {
        headerWiki.shouldHave(text(wikiHeader));
    }

    public void searchPageSoftAssertion(String softAssertions) {
        wikiPageFilter.setValue(softAssertions).pressEnter();
    }

    public void openSoftAssertion() {
        softAssertion.click();
    }

    public void shouldHaveExampleExtensions(String jUnitExample) {
        listCodeExample.shouldHave(text(jUnitExample));
    }

    public void shouldHaveExampleUsingJUnit5(String jUnitUsing) {
        listCodeExample.shouldHave(text(jUnitUsing));
    }
}
