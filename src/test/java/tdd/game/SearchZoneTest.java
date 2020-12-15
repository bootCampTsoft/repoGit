package tdd.game;

import game.Player;
import game.SearchZone;
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchZoneTest {

    @Test
    /**
     * Al iniciar una zona de busqueda, la misma se crea como una matriz de 7x7
     */
    public void dimensionesSearchZone(){

        SearchZone search_zone = new SearchZone();
        assertEquals(49,search_zone.getBoardSize()); //si el tablero es de 7x7 = 49

    }


    @Test
    /**
     * Cuando un jugador se hace un movimiento hace arriba, cambia su posicion en 1.
     */
    public void desplazarHaciaArriba(){

        Player p = new Player("Jugador");
        System.out.println(p.getYPosition());
        if (p.getYPosition()==3)
        {
            p.moveUp();
            System.out.println(p.getYPosition());
            assertEquals(2,p.getYPosition());
        }
        else
        {
            assertFalse(true);
        }

    }

    @Test
    /**
     * Al iniciar una zona de busqueda se inicializa con 3 buff de defensa y 3 de ataque
     */
    public void buffSearchZone(){

/*        SearchZone search = new SearchZone();
        assertEquals(6,search.getTotalAttackBuff() + search.getTotalDefenseBuff()); //si el tablero es de 7x7 = 49
*/
    }


}
