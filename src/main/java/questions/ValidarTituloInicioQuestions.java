package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.WikipediaPortadaPage;
public class ValidarTituloInicioQuestions implements Question<Boolean> {

    private final String tituloEsperado;

    // Constructor de la clase que recibe el título esperado como parámetro
    private ValidarTituloInicioQuestions(String tituloEsperado) {

        this.tituloEsperado = tituloEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
            // Obtiene el título encontrado en la página
            String tituloEncontrado = WikipediaPortadaPage.LBL_TITULO.resolveFor(actor).getText();


            /*
            // Estas dos líneas de código se utiliza solo para la creación de scripts de prueba
            System.out.println("El título encontrado es: " + tituloEncontrado);
            System.out.println("El título esperado es: " + tituloEsperado);
            */


            // Retorna true si el título encontrado es igual al título esperado
            return tituloEncontrado.equals(tituloEsperado);
    }

    // Método estático para crear una instancia de esta pregunta
    public static ValidarTituloInicioQuestions igualA(String tituloEsperado) {
        return new ValidarTituloInicioQuestions(tituloEsperado);
    }
}
