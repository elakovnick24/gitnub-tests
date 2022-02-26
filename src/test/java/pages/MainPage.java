package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.sun.tools.javac.Main;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    RepoSelenidePage repoSelenidePage = new RepoSelenidePage();
    WikiPage wikiPage = new WikiPage();

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
    public MainPage itSelenideRepo(String nameRepo) {
        repoSelenidePage.shouldBeSelenide(nameRepo);
        return this;
    }

    public MainPage shouldHaveWiki() {
        repoSelenidePage.shouldHaveWikiTab();
        return this;
    }

    public MainPage checkWikiOpened(String wikiHeader) {
        wikiPage.checkWikiOpened(wikiHeader);
        return this;
    }

    public MainPage searchPageSoftAssertion(String softAssertions) {
        wikiPage.searchPageSoftAssertion(softAssertions);
        return this;
    }

    public MainPage openSoftAssertions(){
        wikiPage.openSoftAssertion();
        return this;
    }

    public MainPage shouldHaveExampleExtensions(String jUnitExample) {
        wikiPage.shouldHaveExampleExtensions(jUnitExample);
        return this;
    }

    public MainPage shouldHaveExampleUsingJUnit5(String jUnitUsing) {
        wikiPage.shouldHaveExampleUsingJUnit5(jUnitUsing);
        return this;
    }
}
