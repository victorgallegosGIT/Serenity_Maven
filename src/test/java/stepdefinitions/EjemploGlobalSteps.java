package stepdefinitions;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.Login;
import userinterfaces.HomePage;

import java.util.List;

public class EjemploGlobalSteps {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Victor");
    private HomePage homePage = new HomePage();

    @Dado("^que un nuevo usuario quiere ingresar al sistema$")
    public void queUnNuevoUsuarioQuiereIngresarAlSistema() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("^el pone el nombre (.*) y contrasenia (.*)$")
    public void elPoneElNombreYContrasenia(String description, String tipocategoria) {
    actor.wasAbleTo(
            Login.conDrescripcion(description, tipocategoria)
    );
    }

    @Entonces("^el ve los productos listado en el carro de compras$")
    public void elVeLosProductosListadoEnElCarroDeCompras() {

    }

    @Cuando("^el agrega productos al carro$")
    public void elAgregaProductosAlCarro(List<String> datos) {

    }



}
