package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarMensajePopUpQuestions implements Question<Boolean> {

    // Mensaje esperado que se utilizará en la validación
    private final String mensajeEsperado;

    // Constructor de la pregunta que toma el mensaje esperado como parámetro
    private ValidarMensajePopUpQuestions(String mensajeEsperado) {
        this.mensajeEsperado = mensajeEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Recupera el mensaje del pop-up almacenado en el actor
        String mensajePopUp = actor.recall("popUpMessage");

        // Estas dos líneas de código se utiliza solo para la creación de scripts de prueba
        //System.out.println("mensaje capturado del pop up: " + mensajePopUp);
        //System.out.println("mensaje esperado del pop up: " + mensajeEsperado);

        // Compara el mensaje capturado con el mensaje esperado
        return mensajePopUp.equals(mensajeEsperado);

    }

    // Método estático para crear una instancia de esta pregunta con el mensaje esperado
    public static ValidarMensajePopUpQuestions igualA(String mensajeEsperado) {
        return new ValidarMensajePopUpQuestions(mensajeEsperado);
    }
}