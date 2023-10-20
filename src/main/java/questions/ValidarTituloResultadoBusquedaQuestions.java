package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaResultadoBusquedaPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarTituloResultadoBusquedaQuestions implements Question<Boolean> {

    private String tituloResultadoEsperado;

    // Constructor de la pregunta que recibe el título resultado esperado como parámetro
    private ValidarTituloResultadoBusquedaQuestions(String tituloResultadoEsperado) {

        this.tituloResultadoEsperado = tituloResultadoEsperado;
    }


    @Override
    public Boolean answeredBy(Actor actor) {


        actor.attemptsTo(
                // El actor intenta esperar a que el elemento del título del resultado esté visible.
                WaitUntil.the(WikipediaResultadoBusquedaPage.LBL_TITULO_RESULTADO, isVisible())
        );

        // Obtenemos el texto del resultado de la búsqueda
        String tituloResultadoEncontrado = WikipediaResultadoBusquedaPage.LBL_TITULO_RESULTADO.resolveFor(actor).getText();


        /*
        //Estas dos líneas de código se utiliza solo para la creación de scripts de prueba
          System.out.println("El título encontrado del resultado de la búsqueda es: " + tituloResultadoEncontrado);
          System.out.println("El título esperado del resultado de la búsqueda es: " + tituloResultadoEsperado);
        */

        // Compara el título encontrado (ignorando mayúsculas/minúsculas) con el título esperado
        return tituloResultadoEncontrado.equalsIgnoreCase(tituloResultadoEsperado);

    }

    // Método estático para crear una instancia de la pregunta con el título esperado
    public static ValidarTituloResultadoBusquedaQuestions coincidaCon(String tituloResultadoEsperado) {
        return new ValidarTituloResultadoBusquedaQuestions(tituloResultadoEsperado);
    }
}
