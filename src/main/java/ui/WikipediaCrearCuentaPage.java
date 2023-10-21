package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WikipediaCrearCuentaPage extends PageObject {
    public static Target INPUT_NOMBRE_USUARIO = Target.the("Campo nombre de usuario").located(By.id("wpName2"));
    public static Target INPUT_CONTRASENA = Target.the("Campo contraseña").located(By.id("wpPassword2"));
    public static Target INPUT_CONFIRMAR_CONTRASENA = Target.the("Campo confirmar contraseña").located(By.id("wpRetype"));
    public static Target INPUT_CORREO_ELECTRONICO = Target.the("Campo correo electrónico").located(By.id("wpEmail"));
    public static Target BTN_CREA_CUENTA = Target.the("Botón crea cuenta").located(By.id("wpCreateaccount"));
    public static By INPUT_CAPTCHA = By.id("mw-input-captchaWord");
}
