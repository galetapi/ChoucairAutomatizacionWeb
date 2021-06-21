package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("select the choucair selection (Technical Guides-Financial Analyst)").located(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/section[1]/div[2]/aside[1]/section[1]/div[1]/div[1]/div[1]/center[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/h4[1]/strong[1]"));

    public static final Target INPUT_SEARCH_COURSE = Target.the("select the entry").located(By.xpath("//input[@id='coursesearchbox']"));

    public static final Target BUTTON_SEARCH_GO = Target.the("select the entry").located(By.xpath("//button[contains(text(),'Ir')]"));

    public static final Target LABEL_GUIAS_TECNICAS = Target.the("input for login a course").located(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/h4[1]/a[1]"));

    public static final Target NAME_COURSE = Target.the("text the name course").located(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/h1[1]"));


}
