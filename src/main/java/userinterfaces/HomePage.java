package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://10.1.1.132:9791/")
public class HomePage extends PageObject {
    public  static  final Target INPUT_LOGIN_NOMBRE = Target.the("Login de usuario con nombre").located(By.id("txtUsuario"));
    public  static  final Target INPUT_LOGIN_CONTRASENIA = Target.the("Login de usuario con contraseña").located(By.id("txtContraseña"));
    public  static  final Target BUTTON_LOGIN = Target.the("Clic en Login").located(By.id("btnLogin"));
}
