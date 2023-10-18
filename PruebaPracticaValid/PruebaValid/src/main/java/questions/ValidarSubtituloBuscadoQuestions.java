package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.WikipediaResultadoBusquedaPage;

public class ValidarSubtituloBuscadoQuestions implements Question<Boolean> {


    private final String subtituloEsperado;

    // Constructor de la pregunta que recibe el subtítulo esperado como parámetro
    private ValidarSubtituloBuscadoQuestions(String subtituloEsperado) {

        this.subtituloEsperado = subtituloEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        // Obtenemos el subtítulo encontrado en la página
        String subtituloEncontrado = WikipediaResultadoBusquedaPage.LBL_SUBTITULO_ANALISIS_CEEM.resolveFor(actor).getText();
        // Comparamos el subtítulo encontrado con el subtítulo esperado y devolvemos true si son iguales, false en caso contrario
        return subtituloEncontrado.equals(subtituloEsperado);
    }

    // Método estático para crear una instancia de la pregunta ValidarSubtituloBuscadoQuestions con un subtitulo esperado
    public static ValidarSubtituloBuscadoQuestions igualA(String subtituloEsperado) {
        return new ValidarSubtituloBuscadoQuestions(subtituloEsperado);
    }
}
