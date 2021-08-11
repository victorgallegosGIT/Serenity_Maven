package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.INPUT_LOGIN_NOMBRE;
import static userinterfaces.HomePage.INPUT_LOGIN_CONTRASENIA;
import static userinterfaces.HomePage.BUTTON_LOGIN;

public class Login implements Task {
    private String description;
    private String tipocategoria;
    public Login(String description, String tipocategoria) {
        this.description = description;
        this.tipocategoria = tipocategoria;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(description).into(INPUT_LOGIN_NOMBRE),
                Enter.theValue(description).into(INPUT_LOGIN_CONTRASENIA),
                //SelectFromOptions.byVisibleText(description).from(),
                //SelectFromOptions.byVisibleText(tipocategoria).from(),
                Click.on(BUTTON_LOGIN)
                //Hit.the(Keys.ENTER).into()

        );

    }
    public static Login conDrescripcion(String description, String tipocategoria) {
        return instrumented(Login.class, description, tipocategoria);
    }
}
