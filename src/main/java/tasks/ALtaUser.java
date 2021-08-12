package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.AltaUserPage.*;
import static userinterfaces.HomePage.*;

public class ALtaUser implements Task {
    private String nombreusuario;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String direccion;
    private String perfiladministrador;
    private String contraseña;

    public ALtaUser(String nombreusuario, String nombre, String apellido,String dni, String telefono, String direccion, String
                    perfiladministrador, String contraseña) {
        this.nombreusuario = nombreusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.perfiladministrador = perfiladministrador;
        this.contraseña = contraseña;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_ALTAS_USUARIOS),
                Click.on(BUTTON_USUARIOS),
                Enter.theValue(nombreusuario).into(INPUT_NOMBRE_USUARIO),
                Enter.theValue(nombre).into(INPUT_NOMBRE),
                Enter.theValue(apellido).into(INPUT_APELLIDO),
                Enter.theValue(dni).into(INPUT_DNI),
                Enter.theValue(telefono).into(INPUT_TELEFONO),
                Enter.theValue(direccion).into(INPUT_DIRECCION),
                Click.on(BUTTON_PERFILES),
                Enter.theValue(perfiladministrador).into(INPUT_PERFIL),
                Enter.theValue(contraseña).into(INPUT_CONTRASEÑA),
                Click.on(BUTTON_GUARDAR)
                //SelectFromOptions.byVisibleText(description).from(),
                //SelectFromOptions.byVisibleText(tipocategoria).from(),

                //Hit.the(Keys.ENTER).into()

        );

    }
    public static ALtaUser AltaUsuers(String nombreusuario, String nombre, String apellido,String dni, String telefono, String direccion,String
            perfiladministrador, String contraseña) {
        return instrumented(ALtaUser.class, nombreusuario, nombre, apellido, dni, telefono, direccion,
                perfiladministrador,contraseña);
    }
}
