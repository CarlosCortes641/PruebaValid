package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.WikipediaCrearCuentaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CapturarPopUpTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Obtiene el controlador de WebDriver asociado al actor actual
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        // Crea un objeto JavascriptExecutor para ejecutar scripts JavaScript en la página
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Encuentra el elemento del campo de captcha en la página web
        WebElement captcha = driver.findElement(WikipediaCrearCuentaPage.INPUT_CAPTCHA);
        // Ejecuta un script JavaScript para obtener el mensaje de validación del campo captcha
        String mensajePopUp = (String) js.executeScript("return arguments[0].validationMessage;", captcha);
        // System.out.println(mensajePopUp); //Esta línea de código se utiliza solo para la creación de scripts de prueba
        // Almacena el mensaje en una variable para luego acceder a ella en otras clases
        actor.remember("popUpMessage", mensajePopUp);

    }

    // Método estático para crear una instancia de la tarea
    public static CapturarPopUpTask enCaptcha() {

        return instrumented(CapturarPopUpTask.class);
    }
}