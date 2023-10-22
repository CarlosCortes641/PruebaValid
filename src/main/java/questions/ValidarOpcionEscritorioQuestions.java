package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import ui.WikipediaPortadaPage;

public class ValidarOpcionEscritorioQuestions implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        // En actor intenta realizar una validación
        actor.attemptsTo(
                // Asegura que el enlace de versión de escritorio esté visible en la página
                 Ensure.that(WikipediaPortadaPage.LNK_VERSION_ESCRITORIO).isDisplayed()
        );
        // Devuelve true si el enlace de versión de escritorio es visible
        return WikipediaPortadaPage.LNK_VERSION_ESCRITORIO.resolveFor(actor).isVisible();
    }

    // Método estático para crear una instancia de la pregunta con la versión de escritorio esté visible
    public static ValidarOpcionEscritorioQuestions esVisible() {

        return new ValidarOpcionEscritorioQuestions();
    }
}
