package graphics;

import javax.swing.*;

public class FrameSearchZone extends JFrame {

    private JButton btn_comenzar;
    private JPanel frame_zona_busqueda;
    private JTextArea resultados_busqueda;
    private JPanel graphics_search_zone;
    private JPanel graphics_player_zone;


    public FrameSearchZone() {

        //Cargar Zona de Busqueda
        this.add(frame_zona_busqueda);
        this.setTitle("Zona de Busqueda");
        this.setSize(500, 400);

        //Cargar Player






    }

    private void createUIComponents() {

       graphics_search_zone = new GraphicsSearchZone();
    }
}
