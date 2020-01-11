package co.com.sophos.certificacion;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GeneralStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @SuppressWarnings("unchecked")
    public void setUp() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.metro.pe/especiales/cybermetro"));
    }

}
