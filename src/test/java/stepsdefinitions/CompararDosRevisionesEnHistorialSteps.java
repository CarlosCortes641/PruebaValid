package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import questions.ValidarCamposConTextosQuestions;
import tasks.CompararRevisionesSeleccionadasTask;
import tasks.IrAVerHistorialTask;
import tasks.SeleccionarRadioButtonTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompararDosRevisionesEnHistorialSteps {

    @When("^el usuario ingresa a la opción Ver historial$")
    public void elUsuarioIngresaALaOpcionVerHistorialVerHistorial() {
        theActorInTheSpotlight().attemptsTo(IrAVerHistorialTask.enWikipedia());
    }

    @And("^el usuario selecciona dos RADIO BUTTON$")
    public void elUsuarioSeleccionaDosRadioButton() {
        theActorInTheSpotlight().attemptsTo(SeleccionarRadioButtonTask.enHistorial());
    }

    @And("^el usuario hace clic en el botón Comparar revisiones seleccionadas$")
    public void elUsuarioHaceClicEnElBotonCompararRevisionesSeleccionadas() {
        theActorInTheSpotlight().attemptsTo(CompararRevisionesSeleccionadasTask.enHistorial());
    }

    @Then("^el usuario valida que existan dos campos de texto para comparar las revisiones$")
    public void elUsuarioDeberiaVerDosCamposDeTextoParaCompararLasRevisiones() {
        theActorInTheSpotlight().should(seeThat(ValidarCamposConTextosQuestions.deLaRevisionComparadas(), Matchers.is(true)));
    }

}
