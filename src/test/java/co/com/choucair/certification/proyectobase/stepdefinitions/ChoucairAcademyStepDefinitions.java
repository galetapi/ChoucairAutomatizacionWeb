package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Daniel want to learn automation at the academy Choucair$")
    public void thanDanielWantToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairDataList) throws Exception {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(), (Login.onThePage(academyChoucairDataList.get(0).getStrUser(), academyChoucairDataList.get(0).getStrPassword())));
    }

    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseGuíasTecnicasAnalistaFinancialOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairDataList.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResourcesGuíasTecnicasAnalistaFinancial(List<AcademyChoucairData> academyChoucairDataList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairDataList.get(0).getStrCourse())));
    }
}
