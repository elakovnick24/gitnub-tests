import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.RepoSelenidePage;
import pages.WikiPage;

public class SelenideWikiTests {
    MainPage mainPage = new MainPage();
    RepoSelenidePage repoPage = new RepoSelenidePage();
    WikiPage wikiPage = new WikiPage();
    String searchingValue = "SoftAssertion";


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    @DisplayName("search repo Selenide")
    public void searchRepoSelenide() {
        mainPage.headerShouldBeVisible()
                .searchSelenideRepo()
                .redirectToSelenideRepoFromList();
    }

    @Test
    @DisplayName("search Wiki tab")
    public void searchWikiTab() {
        repoPage.shouldBeSelenide()
                .shouldHaveWikiTab();
    }

    @Test
    //@DisplayName("open page soft assertions and check the code example")
    public void openPageSearchAssertionAndCheckCode() {
        wikiPage.checkWiliOpened()
                .searchPageSoftAssertion(searchingValue)
                .openSoftAssertion()
                .shouldHaveExampleExtensions()
                .shouldHaveExampleUsingJUnit5();
    }
}
