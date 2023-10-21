package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarTituloQuestions;
import tasks.IngresarWikipediaTask;
import ui.WikipediaPortadaPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static utils.Constantes.ACTOR_NAME;

public class TituloPaginaInicioSteps {

    @Before
    public void setUP() {
        // Configuración previa al escenario de prueba
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR_NAME);
    }
    @Given("^el usuario ingresa a la página de Wikipedia$")
    public void elUsuarioIngresaALaPaginaDeWikipedia() {
         theActorCalled(ACTOR_NAME).attemptsTo(IngresarWikipediaTask.enLaPaginaPortada());
    }

    @Then("^el usuario valida que el título sea (.*)$")
    public void elUsuarioValidaQueElTituloSea(String tituloEsperado) {
        theActorCalled(ACTOR_NAME).should(seeThat(ValidarTituloQuestions.enTarget(WikipediaPortadaPage.LBL_TITULO), equalTo(tituloEsperado)));
    }
}
