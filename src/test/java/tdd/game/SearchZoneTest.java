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
        p.addSearchZone(new SearchZone());

        if (p.getYPosition()==3)
        {
            p.moveUp();
            assertEquals(2,p.getYPosition());
        }
        else
        {
            assertFalse(true);
        }

    }

    @Test
    /**
     * Cuando un jugador se hace un movimiento hace abajo, cambia su posicion en 1.
     */
    public void desplazarHaciaAbajo(){

        Player p = new Player("Jugador");
        p.addSearchZone(new SearchZone());

        if (p.getYPosition()==3)
        {
            p.moveDown();
            assertEquals(4,p.getYPosition());
        }
        else
        {
            assertFalse(true);
        }

    }

    @Test
    /**
     * Cuando un jugador se hace un movimiento hacia la izquierda, cambia su posicion en 1.
     */
    public void desplazarHaciaIzquierda(){

        Player p = new Player("Jugador");
        p.addSearchZone(new SearchZone());

        if (p.getXPosition()==3)
        {
            p.moveLeft();
            assertEquals(2,p.getXPosition());
        }
        else
        {
            assertFalse(true);
        }

    }


    @Test
    /**
     * Cuando un jugador se hace un movimiento hace la derecha y esta en el borde derecho, no cambia su posicion en X.
     */
    public void desplazarBorderDerecho(){

        Player p = new Player("Jugador");
        p.addSearchZone(new SearchZone());

        if (p.getXPosition()==3)
        {
            p.moveRight();
            assertEquals(4,p.getXPosition());
        }
        else
        {
            assertFalse(true);
        }

    }

    @Test
    /**
     * Cuando un jugador se hace un movimiento hace la izauierda y esta en el borde izquierdo su posicion en X es cero.
     */
    public void desplazarBorderIzquierdo(){

        Player p = new Player("Jugador");
        p.addSearchZone(new SearchZone());

        //hago la misma cantidad de movimientos hacia la derecha del maximo de tamano de la zona de busqueda
        //para asegurarme que llega al borde
        for (int i=1; i<=p.getSearchZone().getMaxVertex();i++)
        {
            p.moveLeft();
        }
        assertEquals(0,p.getXPosition());

    }

    @Test
    /**
     * Cuando un jugador se hace un movimiento hace arriba y esta en el borde superior su posicion en X es cero.
     */
    public void desplazarBorderSuperior(){

        Player p = new Player("Jugador");
        p.addSearchZone(new SearchZone());

        //hago la misma cantidad de movimientos hacia la derecha del maximo de tamano de la zona de busqueda
        //para asegurarme que llega al borde
        for (int i=1; i<=p.getSearchZone().getMaxVertex();i++)
        {
            p.moveUp();
        }
        assertEquals(0,p.getYPosition());

    }

    @Test
    /**
     * Cuando un jugador se hace un movimiento hace arriba y esta en el borde superior su posicion en X es cero.
     */
    public void desplazarBorderInferior(){

        Player p = new Player("Jugador");
        p.addSearchZone(new SearchZone());

        //hago la misma cantidad de movimientos hacia la derecha del maximo de tamano de la zona de busqueda
        //para asegurarme que llega al borde
        for (int i=1; i<=p.getSearchZone().getMaxVertex();i++)
        {
            p.moveDown();
        }
        assertEquals(p.getSearchZone().getMaxVertex()-1,p.getYPosition());

    }

    @Test
    /**
     * Al iniciar una zona de busqueda se inicializa con 3 buff de defensa y 3 de ataque
     */
    public void initializationBuffSearchZone(){

        SearchZone search = new SearchZone();
        assertEquals(6,search.getTotalAttackBuff() + search.getTotalDefenseBuff());

    }


}
