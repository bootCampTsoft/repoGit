package graphics;

import javax.swing.*;
import java.awt.*;

public class GraphicsSearchZone extends JPanel {

    Color color_fondo = Color.gray;
    int tamaño_maximo, tamaño, cantidad_filas,residuo;

    public GraphicsSearchZone(int tamaño_maximo, int cantidad_filas){
        this.tamaño_maximo = tamaño_maximo;
        this.cantidad_filas = cantidad_filas;
        this.tamaño = tamaño_maximo/cantidad_filas;
        this.residuo = tamaño_maximo%cantidad_filas;
    }


    //todo: en metodo paint, debo agregar las condiciones que se traen desde el Arreglo
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(color_fondo);
        //Llenado de cuadricula
        for (int i = 0; i < cantidad_filas; i++) {
            for (int j = 0; j < cantidad_filas; j++) {
                pintor.fillRect(residuo/2 +i *tamaño,residuo/2 +j*tamaño,tamaño-1,tamaño-1);
            }
            
        }

    }



}
