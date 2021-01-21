package bdd.steps;

import game.Player;
import game.SearchZone;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;


public class story01MovimientoZonaBusqueda {

    Player player_one = new Player("juan");

    @Given("Soy el Jugador {int}")
    public void soy_el_jugador(Integer int1) {
        assertEquals("juan", player_one.getName());
    }
    @Given("está empezando el juego")
    public void está_empezando_el_juego() {

        //Se crea el tablero
        this.player_one.addSearchZone(new SearchZone());


    }
    @When("me muevo {int} posiciones hacia arriba")
    public void me_muevo_posiciones_hacia_arriba(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        for (int i=1; i<=int1;i++)
        {
            this.player_one.moveUp();
        }

        throw new io.cucumber.java.PendingException();
    }
    @Then("llego a la esquina superior derecha de la zona")
    public void llego_a_la_esquina_superior_derecha_de_la_zona() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(0,this.player_one.getYPosition());
    }
    @When("me muevo {int} posiciones hacia la izquierda")
    public void me_muevo_posiciones_hacia_la_izquierda(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("llego a la esquina superior izquierda de la zona")
    public void llego_a_la_esquina_superior_izquierda_de_la_zona() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        //assertTrue(true);
    }



}
