package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        //tags = "@Test4",
        features = "src/test/resources/features",
        glue = "stepsdefinitions"

)

public class WikiPediaRunner {


}