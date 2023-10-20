package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.WikipediaPortadaPage;

public class ValidarOpcionEscritorioQuestions implements Question<Boolean> {

    private String versionEscritorio;

    // Constructor que recibe la versión de escritorio esperada como parámetro
    private ValidarOpcionEscritorioQuestions(String versionEscritorio) {

        this.versionEscritorio = versionEscritorio;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        // Obtener la versión encontrada en la página
        String versionEncontrada = WikipediaPortadaPage.LNK_VERSION_ESCRITORIO.resolveFor(actor).getText();

        // Estas dos líneas de código se utiliza solo para la creación de scripts de prueba
        // System.out.println("La opción encontrada es: " + versionEncontrada);
        // System.out.println("La opción esperada es: " + versionEscritorio);

        // Comprobar si la versión encontrada coincide con la versión esperada
        return versionEncontrada.equals(versionEscritorio);
    }

    // Método estático para crear una instancia de la pregunta con la versión de escritorio esperada
    public static ValidarOpcionEscritorioQuestions igualA(String versionEscritorio) {
        return new ValidarOpcionEscritorioQuestions(versionEscritorio);
    }
}
