package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.WikipediaResultadoComparacionRevisionPage;

public class ValidarCamposConTextosQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
           // Obtiene el texto del elemento uno y el elemento dos de las revisiones seleccionadas
           String textoElementoUno = Text.of(WikipediaResultadoComparacionRevisionPage.TXT_ELEMENTO_UNO).viewedBy(actor).asString();
           String textoElementoDos = Text.of(WikipediaResultadoComparacionRevisionPage.TXT_ELEMENTO_DOS).viewedBy(actor).asString();

           // Realiza la validación y devuelve true si ambos campos tienen texto, o false si al menos uno es nulo o está vacío.
           return (textoElementoUno != null && !textoElementoUno.isEmpty()) &&
                (textoElementoDos != null && !textoElementoDos.isEmpty());
    }

    // Método estático que devuelve una instancia de la pregunta "ValidarCamposConTextosQuestions"
    public static ValidarCamposConTextosQuestions deLaRevisionComparadas() {
        return new ValidarCamposConTextosQuestions();
    }
}

