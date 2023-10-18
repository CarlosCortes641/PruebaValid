package tasks;

import exceptions.ErrorInfoException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.ValidarMensajePopUpQuestions;
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

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            // El actor intenta realizar la siguiente secuencia de acciones:
            actor.attemptsTo(
                    // Ingresa los datos en los campos correspondientes
                    Enter.theValue(nombre).into(WikipediaCrearCuentaPage.INPUT_NOMBRE_USUARIO),
                    Enter.theValue(contrasena).into(WikipediaCrearCuentaPage.INPUT_CONTRASENA),
                    Enter.theValue(contrasena).into(WikipediaCrearCuentaPage.INPUT_CONFIRMAR_CONTRASENA),
                    Enter.theValue(correo).into(WikipediaCrearCuentaPage.INPUT_CORREO_ELECTRONICO)
            );
          // Capturar y manejar excepciones con mensajes descriptivos
        } catch (Exception e) {
            throw new ErrorInfoException("Error al diligenciar formulario de registro de cuenta.", e);
        }

    }

    // Método estático para crear una instancia de la tarea 'DiligenciarFormularioRegistroTask'
    public static DiligenciarFormularioRegistroTask sinCaptcha(String nombre, String contrasena, String correo) {
        return instrumented(DiligenciarFormularioRegistroTask.class, nombre, contrasena, correo);
    }

}
