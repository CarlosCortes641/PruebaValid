package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidarOpcionEscritorioQuestions;
import tasks.CambiarVersionEscritorioTask;
import tasks.CambiarVersionMovilesTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static utils.Constantes.ACTOR_NAME;

public class CambiarEntreVersionesSteps {

    @When("^el usuario desde la parte inferior de la página selecciona la opción (.*)$")
    public void elUsuarioDesdeLaParteInferiorDeLaPaginaSeleccionaLaOpcion(String versionMoviles) {
         theActorCalled(ACTOR_NAME).attemptsTo(CambiarVersionMovilesTask.aLaOpcion(versionMoviles));

    }

    @Then("^el usuario valida que se encuentre la opción (.*)$")
    public void elUusuarioDeberiaVerLaOpcion(String versionEscritorio) {
        theActorCalled(ACTOR_NAME).should(seeThat(ValidarOpcionEscritorioQuestions.igualA(versionEscritorio)));
    }

    @And("^el usuario regresa a la opción Escritorio$")
    public void elUsuarioIngresaaLaOpcion() {
        theActorCalled(ACTOR_NAME).attemptsTo(CambiarVersionEscritorioTask.versionEscritorio());
    }

}
