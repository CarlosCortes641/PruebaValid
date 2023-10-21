package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidarCamposConTextosQuestions;
import tasks.CompararRevisionesSeleccionadasTask;
import tasks.IrAVerHistorialTask;
import tasks.SeleccionarRadioButtonTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static utils.Constantes.ACTOR_NAME;

public class CompararDosRevisionesEnHistorialSteps {

    @When("^el usuario ingresa a la opción Ver historial$")
    public void elUsuarioIngresaALaOpcionVerHistorialVerHistorial() {
         theActorCalled(ACTOR_NAME).attemptsTo(IrAVerHistorialTask.enWikipedia());
    }
    @And("^el usuario selecciona dos RADIO BUTTON$")
    public void elUsuarioSeleccionaDosRadioButton() {
        theActorCalled(ACTOR_NAME).attemptsTo(SeleccionarRadioButtonTask.enHistorial());
    }
    @When("^el usuario hace clic en el botón Comparar revisiones seleccionadas$")
    public void elUsuarioHaceClicEnElBotonCompararRevisionesSeleccionadas() {
        theActorCalled(ACTOR_NAME).attemptsTo(CompararRevisionesSeleccionadasTask.enHistorial());
    }
    @Then("^el usuario valida que existan dos campos de texto para comparar las revisiones$")
    public void elUsuarioDeberiaVerDosCamposDeTextoParaCompararLasRevisiones() {
        theActorCalled(ACTOR_NAME).should(seeThat(ValidarCamposConTextosQuestions.deLaRevisionComparadas()));
    }

}
