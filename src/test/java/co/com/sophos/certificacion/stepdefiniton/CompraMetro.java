package co.com.sophos.certificacion.stepdefiniton;

import co.com.sophos.certificacion.GeneralStepDefinitions;
import co.com.sophos.certificacion.preguntas.ValidarProducto;
import co.com.sophos.certificacion.tasks.SeleccionarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import  static  net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.sophos.certificacion.preguntas.ValidarProducto.enCarrito;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraMetro extends GeneralStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;


    @Given("^Despues de encontrarme en la pagina$")
    public void despuesDeEncontrarmeEnLaPagina() {
        setTheStage(new Cast());
        theActorCalled("diana");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.metro.pe/especiales/cybermetro"));

    }


    @When("^selecione producto a comprar$")
    public void selecioneProductoAComprar() {
        theActorInTheSpotlight().attemptsTo(SeleccionarProducto.con());


    }

    @Then("^visualiza los productos agregados$")
    public void visualizaLosProductosAgregados() {
    theActorInTheSpotlight().should(seeThat(enCarrito()));
    }

}
