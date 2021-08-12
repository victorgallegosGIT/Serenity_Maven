package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.ALtaUser;
import tasks.Login;
import userinterfaces.AltaUserPage;
import userinterfaces.HomePage;

import java.util.List;


public class AltaUsuario {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Victor");
    private AltaUserPage altaUserPage = new AltaUserPage();
    @Dado("^que actor quiere dar de alta un nuevo usuario$")
    public void queActorQuiereDarDeAltaUnNuevoUsuario() {

    }

    @Y("^hace clic en alta usuario$")
    public void haceClicEnAltaUsuario() {
    }

    @Cuando("^el agrega los datos$")
    public void elAgregaLosDatos(List<String> asd) {
       // actor.wasAbleTo(
        //ALtaUser.AltaUsuers()
      // );
    }
    //"<nombreUser>" "<nombre>" "<apellido>" "<dni>" "<telefono>"  "<direccion>"

    @Entonces("^el ve el nuevo usuario registrado$")
    public void elVeElNuevoUsuarioRegistrado() {


    }



}
