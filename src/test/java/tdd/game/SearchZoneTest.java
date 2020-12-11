package tdd.game;


import static org.junit.Assert.*;

import game.Player;
import game.SearchZone;
import org.junit.Test;

public class SearchZoneTest {

    @Test
    public void validarDimensionesSearchZone(){

        Player player_one = new Player("juan");
        SearchZone search = new SearchZone(player_one);

        assertEquals("aquiva el valor",search.getBoardSize()); //si el tablero es de 7x7 = 49

    }




}
