package graphics;

import game.Player;
import game.SearchZone;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PlayerSearchZone extends JPanel {

    Color color_player = Color.blue;
    int tamaño, cantidad_filas, residuo;
    SearchZone sz;


    public PlayerSearchZone() {
        tamaño = 300 / sz.getMaxVertex();
        residuo = 300 % sz.getMaxVertex();
    }


    //todo: en metodo paint, debo agregar las condiciones que se traen desde el Arreglo
    @Override
    public void paint(Graphics pintor) {
        super.paint(pintor);
        pintor.setColor(color_player);
        //Llenado de cuadricula
        for (int i = 0; i < sz.getMaxVertex(); i++) {
            for (int j = 0; j < sz.getMaxVertex(); j++) {
                pintor.fillRect(residuo / 2 + i * tamaño, residuo / 2 + j * tamaño, tamaño - 1, tamaño - 1);
            }

        }

    }
}
