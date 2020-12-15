package game;

public class SearchZone {

    private int zone[][];  //arreglo multidimensional que representa la zona de busqueda

    //Constructor
    public SearchZone(){
        //Se inicializa siempre en 7x7 la matriz que representa la zona de busqueda
        this.zone = new int[7][7];
    }

    /**
     * Este método contabiliza el total de elementos que puede contener la zona de busqueda
     *
     * @return total de elementos que puede contener la zona de busqueda. 0 si la variable "zona" no esta inicializada
     */
    public int getBoardSize()
    {
        int total_elements = 0;

        for (int i = 0; i < this.zone.length; ++i) {
            total_elements = total_elements + this.zone[i].length;
        }
        return total_elements;
    }

    /**
     * Este método imprime en consola el contenido de la zona de busqueda
     *
     * @return void
     */
    public void printZone()
    {
        System.out.println("Zona de Busqueda: ");
        for (int i = 0; i < this.zone.length; ++i) {
            for (int j = 0; j < this.zone[i].length; j++)
            {
                if (j<(this.zone[i].length-1))
                {
                    System.out.print(this.zone[i][j] + " - ");
                }
                else
                {
                    System.out.println(this.zone[i][j]);
                }
            }
        }
    }

}
