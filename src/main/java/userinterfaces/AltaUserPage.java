package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

    @DefaultUrl("http://10.1.1.132:9791/")
    public class AltaUserPage extends PageObject {

        public  static  final Target BUTTON_ALTAS_USUARIOS = Target.the(" hace clic boton alta").located(By.id("ContentPlaceHolder1_btnAltas"));
        public  static  final Target BUTTON_USUARIOS= Target.the("clic boton usuario").located(By.id("ContentPlaceHolder1_btnUsuariosAlta"));
        public  static  final Target INPUT_NOMBRE_USUARIO = Target.the(" COLOCA nombre USUARIO").located(By.id("ContentPlaceHolder1_ControlUsuarios_txtUsername"));
        public  static  final Target INPUT_NOMBRE = Target.the("coloca nombre").located(By.id("ContentPlaceHolder1_ControlUsuarios_txtNombre"));
        public  static  final Target INPUT_APELLIDO = Target.the("coloca apellido").located(By.id("ContentPlaceHolder1_ControlUsuarios_txtApellido"));
        public  static  final Target INPUT_DNI = Target.the("coloca dni").located(By.id("ContentPlaceHolder1_ControlUsuarios_txtDNI"));
        public  static  final Target INPUT_TELEFONO = Target.the("coloca telefono").located(By.id("ContentPlaceHolder1_ControlUsuarios_txtTelefono"));
        public  static  final Target INPUT_DIRECCION = Target.the("coloca direccion").located(By.id("ContentPlaceHolder1_ControlUsuarios_txtDireccion"));
        public  static  final Target BUTTON_PERFILES = Target.the(" hace clic perfiles").located(By.id("txtUsuario"));
        public  static  final Target INPUT_PERFIL = Target.the("coloca perfil").located(By.id("ContentPlaceHolder1_ControlUsuarios_txtDireccion"));
        public  static  final Target INPUT_CONTRASEÑA = Target.the("coloca CONTRASEÑA").located(By.id("ContentPlaceHolder1_ControlUsuarios_txtDireccion"));
        public  static  final Target BUTTON_GUARDAR = Target.the(" hace clic boton guardar").located(By.id("txtUsuario"));

    }

