package co.com.choucair.certification.academy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class OpenUp implements Task {
 private ChoucairAcademyPage choucairAcademyPage;
    public static Open thePage(){

        return Tasks.instrumented(OpenUp.class);

    }

    @Override
    public <T extends Actor> void performAs (T actor) {

        actor.attemptsTo(Open.browserOn(choucairAcademyPage));

    }
}
