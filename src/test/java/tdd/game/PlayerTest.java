package tdd.game;

import game.Player;
import static org.junit.Assert.*;

import game.SearchZone;
import io.cucumber.java.eo.Se;
import org.junit.Test;

public class PlayerTest {

    Player player_test = new Player("tester");
    SearchZone searchZone = new SearchZone();

    @Test
    public void crearPlayer(){
        assertEquals("tester",player_test.getName());
    }

    @Test
    public void ingresarAZona(){
        player_test.addSearchZone(searchZone);

    }
}
