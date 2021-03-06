package  co.com.choucair.certification.academy.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.*;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
                    features = "src/test/resources/features/academyChoucair.feature",
                    tags = "@Regresion",
                    glue = "co.com.choucair.certification.academy.stepdefinitions",
                    snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}

