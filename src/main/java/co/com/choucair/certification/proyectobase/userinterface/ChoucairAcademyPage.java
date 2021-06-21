package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://operacion.choucairtesting.com/academy/login/index.php")
public class ChoucairAcademyPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to loging").located(By.xpath("//header/div[1]/nav[1]/ul[2]/li[1]/a[1]"));

    public static final Target INPUT_USER = Target.the("where do we write the user").located(By.xpath("//input[@id='username']"));

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.xpath("//input[@id='password']"));

    public static final Target ACCEDER_BUTTON = Target.the("button to access the system").located(By.xpath("//button[contains(text(),'Acceder')]"));
}
