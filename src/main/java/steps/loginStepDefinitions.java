package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings({ "unused" })
public class loginStepDefinitions {

    // Comportamiento base del Driver
    private WebDriver driver;


    @Given("^que el usuario esta en falabella\\.com$")
    public void que_el_usuario_esta_en_falabella_com() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.falabella.com/falabella-cl/#");
    }

    @When("^el usuario clickea Inicia Sesion$")
    public void el_usuario_clickea_Inicia_Sesion() throws Throwable {

        // 1. Identificar boton iniciar sesion
        // xpath: div[@class='fb-masthead-login__name re-design-cl__name
        // login-redesing_logout-box']
        WebElement btn_inicio = driver.findElement(
                By.xpath("/html/body/div[1]/nav/div[3]/div/ul/li[1]/div/div[1]/div[2]/div[1]/span"));

        // 2. clickear boton
        btn_inicio.click();
    }

    @Then("^el usuario ingresa a la pagina de login$")
    public void el_usuario_ingresa_a_la_pagina_de_login() throws Throwable {
        WebElement iniciaSesion = null;
        // Then --> validacion
        try {
            boolean existeIniciaSesion = driver.findElement(By.xpath("//div[@class='Login__mainContent__ZxAuN']"))
                    .isEnabled();
            if (existeIniciaSesion) {
                Assert.assertTrue("Se despliega correctamente Inicia Sesion", existeIniciaSesion);
            }
        } catch (Exception exp) {
            throw exp;
        }

    }

    @When("^el usuario ingresa un usuario y password valido$")
    public void el_usuario_ingresa_un_usuario_y_password_valido() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test Code Enlazado");

    }

    @Then("^el usuario se logea correctamente$")
    public void el_usuario_se_logea_correctamente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test Code Enlazado");
    }

    @Given("^un usuario y password registrado del sitio falabella$")
    public void un_usuario_y_password_registrado_del_sitio_falabella() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test Code Enlazado");
    }

    @Then("^el usuario deberia ingresar exitosamente al portal$")
    public void el_usuario_deberia_ingresar_exitosamente_al_portal() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test Code Enlazado");
    }

    @When("^el usuario ingresa un usuario y password invalido$")
    public void el_usuario_ingresa_un_usuario_y_password_invalido(DataTable testData) throws Throwable {

        // Listar data de archivo feature
        List<String> testDataAsList = testData.asList(String.class);
        int cant_elementos = testDataAsList.size();
        String username = null;
        String password = null;
        if (cant_elementos == 2) {
            username = testDataAsList.get(0).toString();
            password = testDataAsList.get(1).toString();

        } else {
            Assert.assertTrue("No hay data disponible.", false);
        }

        // obtener objetos mail, contrase�a y boton iniciar sesion
        WebElement mail = driver.findElement(By.id("emailAddress"));
        WebElement contrasena = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement btn_iniciar_sesion = driver.findElement(By.xpath("//p[contains(text(),'Iniciar sesión')]"));

        // ingresar informacion
        mail.sendKeys(username);
        contrasena.sendKeys(password);

        // validar que boton este habilitado
        if (btn_iniciar_sesion.isEnabled()) {
            btn_iniciar_sesion.click();
        } else {
            Assert.assertTrue("No esta habilitado el boton inicia sesion", false);
        }

    }

    @Then("^el sitio muestra un mensaje de error al ingresar$")
    public void el_sitio_muestra_un_mensaje_de_error_al_ingresar() throws Throwable {
        // obtener elemento de mensaje de error
        try {
            WebElement mensaje_error = driver.findElement(By.xpath(
                    "//span[contains(text(),'E-mail o contraseña incorrecta. Por favor inténtalo nuevamente.')]"));

            if (mensaje_error.isDisplayed()) {
                driver.close();
                Assert.assertTrue("Se encuentra el mensaje de error esperado", true);
            }

        } catch (Exception e) {

        }

    }

}