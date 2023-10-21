package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.WikipediaCrearCuentaPage;

public class ValidarMensajePopUpQuestions implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        // Obtiene el controlador de WebDriver asociado al actor actual
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        // Crea un objeto JavascriptExecutor para ejecutar scripts JavaScript en la página
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Encuentra el elemento del campo de captcha en la página web
        WebElement captcha = driver.findElement(WikipediaCrearCuentaPage.INPUT_CAPTCHA);
        // Ejecuta un script JavaScript para obtener el mensaje de validación del campo captcha
        return (String) js.executeScript("return arguments[0].validationMessage;", captcha);
    }

    // Método estático para crear una instancia de la pregunta
    public static ValidarMensajePopUpQuestions enCaptcha() {

        return new ValidarMensajePopUpQuestions();
    }
}