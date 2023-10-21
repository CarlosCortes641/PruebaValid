package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
public class ValidarTituloQuestions implements Question<String> {

    private final Target target;

    // Constructor que recibe el target como parámetro
    private ValidarTituloQuestions(Target target) {

        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
    // Obtiene el texto del elemento de destino (target) que se pasa como parámetro
        return target.resolveFor(actor).getText();
    }

    // Método estático para crear una instancia de la pregunta con el target específico
    public static ValidarTituloQuestions enTarget(Target target) {

        return new ValidarTituloQuestions(target);
    }
}
