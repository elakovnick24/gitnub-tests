import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.RepoSelenidePage;
import pages.WikiPage;

public class SelenideWikiTests {
    MainPage mainPage = new MainPage();


    String nameRepo = "selenide / selenide";
    String searchingValue = "SoftAssertion";
    String wikiHeader = "Welcome to the selenide wiki!";
    String jUnitExample = "JUnit5 extension";
    String jUnitUsing = "Using JUnit5 extend test class:";

    @BeforeEach
    void beforeConfig() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";

    }

    @Test
    public void searchJUnitExample() {
        mainPage.headerShouldBeVisible()
                .searchSelenideRepo()
                .redirectToSelenideRepoFromList()
                .itSelenideRepo(nameRepo)
                .shouldHaveWiki()
                .checkWikiOpened(wikiHeader)
                .searchPageSoftAssertion(searchingValue)
                .openSoftAssertions()
                .shouldHaveExampleExtensions(jUnitExample)
                .shouldHaveExampleUsingJUnit5(jUnitUsing);
    }
}
