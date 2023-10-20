package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WikipediaHistorialPage extends PageObject {
    public static Target RBT_UNO = Target.the("Radio Button uno").located(By.xpath("//input[@id='mw-diff-149134229']"));
    public static Target RBT_DOS = Target.the("Radio Button dos").located(By.xpath("//input[@id='mw-oldid-115085235']"));
    public static Target BTN_COMPARAR = Target.the("Botón comparar").located(By.xpath("//*[@id=\"mw-history-compare\"]/div/input"));

    public static Target TXT_RBT_UNO = Target.the("Texto de Radio Button uno").located(By.xpath("//*[@id=\"pagehistory\"]/ul[4]/li/span[8]"));
    public static Target TXT_RBT_DOS = Target.the("Texto de Radio Button dos").located(By.xpath("//*[@id=\"pagehistory\"]/ul[1]/li/span[8]"));

}
