package game;

import java.util.ArrayList;

public class SearchZone {

    private ArrayList<ArrayList<Integer>> zone; //arreglo multidimensional que representa la zona de busqueda
    private final int MAX_VERTEX = 7; //representa la cantidad de filas y columnas de la zona de busqueda.

    //Constructor
    public SearchZone(){
        //Se inicializa siempre la matriz que representa la zona de busqueda
        this.zone = new ArrayList<>(MAX_VERTEX);

        for(int i=0; i < MAX_VERTEX; i++) {
            this.zone.add(new ArrayList<>(7));
            for(int j=0; j < MAX_VERTEX; j++)
            {
                this.zone.get(i).add(0);
            }
        }
    }

    /**
     * Este método contabiliza el total de elementos que puede contener la zona de busqueda
     *
     * @return total de elementos que puede contener la zona de busqueda. 0 si la variable "zona" no esta inicializada
     */
    public int getBoardSize()
    {
        int total_elements = 0;

        for (int i = 0; i < this.zone.size(); ++i) {
            total_elements = total_elements + this.zone.get(i).size();
        }
        return total_elements;
    }

    /**
     * Valida si la posicion que se envia por parametros corresponde al borde superior de la zona de busqueda
     *
     * @return true si llego al borde superior y false en caso contrario
     */
    public boolean isTopBorder(int y_position)
    {
        if (y_position == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Valida si la posicion que se envia por parametros corresponde al borde inferior de la zona de busqueda
     *
     * @return true si llego al borde inferior y false en caso contrario
     */
    public boolean isDownBorder(int y_position)
    {
        if (y_position == (MAX_VERTEX-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Valida si la posicion que se envia por parametros corresponde al borde de la izquierda de la zona de busqueda
     *
     * @return true si llego al borde izquierdo y false en caso contrario
     */
    public boolean isLeftBorder(int x_position)
    {
        if (x_position == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Valida si la posicion que se envia por parametros corresponde al borde derecho de la zona de busqueda
     *
     * @return true si llego al borde derecho y false en caso contrario
     */
    public boolean isRightBorder(int x_position)
    {
        if (x_position == (MAX_VERTEX-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Este método imprime en consola el contenido de la zona de busqueda
     *
     * @return void
     */
    public void printZone()
    {
        System.out.println("Zona de Busqueda: ");
        for (int i = 0; i < this.zone.size(); ++i) {
            for (int j = 0; j < this.zone.get(i).size(); j++)
            {
                if (j<(this.zone.get(i).size()-1))
                {
                    System.out.print(this.zone.get(i).get(j) + " - ");
                }
                else
                {
                    System.out.println(this.zone.get(i).get(j));
                }
            }
        }
    }

    /**
     * Este método devuelve la cantidad maxima de un eje de la zona de busqueda
     *
     * @return void
     */
    public int getMaxVertex()
    {
        return this.MAX_VERTEX;
    }
}
