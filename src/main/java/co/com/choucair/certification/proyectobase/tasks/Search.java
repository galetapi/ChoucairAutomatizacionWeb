package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.interactions.comunes.Esperar;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage.LABEL_GUIAS_TECNICAS;


public class Search implements Task {

    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course) {

        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theValue(course).into(SearchCoursePage.INPUT_SEARCH_COURSE),
                Click.on(SearchCoursePage.BUTTON_SEARCH_GO),
                Click.on(LABEL_GUIAS_TECNICAS),
                Esperar.esperarEnSegundos(5000)
        );
    }
}
