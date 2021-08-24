package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenotybdd.screenplay.actors.OnStage;
import net.serenotybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import sun.security.util.PendingException;

package co.com.choucair.certification.academy.stepdefinitions;


public class ChoucairAcademyStepDefintions {


    private Object OpenUp;

    @Before public void setStage (){

        OnStage.setTheStage(new OnlineCast());


    }

    @Given("^than brandon wantsto learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() throws Exception {

        OnStage.theActorCalled( requiredActor "Brandon".wasAbleTo(OpenUp.thePage()));

        throw new PendingException();
    }

    @When("^he search for the course recursos automatizacion Bancolombia in the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaInTheChoucairAcademyplatform() throws Exception {
        throw new PendingException();
    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() throws Exception {
        throw new PendingException();
    }
}



