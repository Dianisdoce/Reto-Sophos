package co.com.sophos.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compra.feature",
                 glue = "co.com.sophos.certificacion.stepdefiniton",
                  snippets = SnippetType.CAMELCASE)
public class CompraRunner {
}
