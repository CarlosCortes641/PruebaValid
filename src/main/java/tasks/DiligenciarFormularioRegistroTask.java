package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import ui.WikipediaCrearCuentaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarFormularioRegistroTask implements Task {

    // Variables para almacenar los datos a diligenciar en el formulario
    private String nombre;
    private String contrasena;
    private String correo;

    // Constructor que recibe los datos del formulario
    public DiligenciarFormularioRegistroTask(String nombre, String contrasena, String correo){
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.correo = correo;
    }

    // Sobrescritura del método
    @Override
    public <T extends Actor> void performAs(T actor) {
            // El actor intenta ingresar los datos en el formulario
            actor.attemptsTo(
                    Enter.theValue(nombre).into(WikipediaCrearCuentaPage.INPUT_NOMBRE_USUARIO),
                    Enter.theValue(contrasena).into(WikipediaCrearCuentaPage.INPUT_CONTRASENA),
                    Enter.theValue(contrasena).into(WikipediaCrearCuentaPage.INPUT_CONFIRMAR_CONTRASENA),
                    Enter.theValue(correo).into(WikipediaCrearCuentaPage.INPUT_CORREO_ELECTRONICO)
            );
    }

    // Método estático para crear una instancia de la tarea
    public static DiligenciarFormularioRegistroTask sinCaptcha(String nombre, String contrasena, String correo) {
        return instrumented(DiligenciarFormularioRegistroTask.class, nombre, contrasena, correo);
    }
}
