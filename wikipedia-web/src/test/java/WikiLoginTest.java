import org.testng.annotations.Test;

public class WikiLoginTest extends TestBase {

    @Test
    public void testLogin() {
        selectLanguage();
        initLogin();
        fillLoginForm("Whofarted1904", "Elton1904");
        confirmLogin();


    }

}
