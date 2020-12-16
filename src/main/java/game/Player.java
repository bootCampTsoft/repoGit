package game;

public class Player {

    //atributos
    private String name;
    private SearchZone search_zone; //zona de busqueda del jugador
    private int x_position; //numero que representa la posicion en eje x de la matriz (de 0 a 6)
    private int y_position; //numero que representa la posicion en eje y de la matriz (de 0 a 6)

    //Constructor
    public Player(String name){
        this.name = name;
        this.x_position = 6;
        this.y_position = 3;
    }

    /**
     * Devuelve el nombre con el que se inicializo el jugador
     *
     * @return String con el nombre del jugador
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Asigna una Zona de Busqueda al jugador
     */
    public void addSearchZone(SearchZone s)
    {
        this.search_zone = s;
    }

    /**
     * @return Zona de busqueda del jugador
     */
    public SearchZone getSearchZone()
    {
        return this.search_zone;
    }

    /**
     * @return el numero correspondiente a la posicion del jugador en el eje X
     */
    public int getXPosition()
    {
        return this.x_position;
    }

    /**
     * @return el numero correspondiente a la posicion del jugador en el eje Y
     */
    public int getYPosition()
    {
        return this.y_position;
    }

    /**
     * Mueve en 1 paso al jugador en direccion hacia arriba.
     *
     * Si se llega a un borde superior de la zona de busqueda, no se mueve.
     *
     */
    public void moveUp()
    {
        if (!this.search_zone.isTopBorder(this.y_position))
        {
            this.y_position = (this.y_position - 1);
        }
    }

    /**
     * Mueve en 1 paso al jugador en direccion hacia abajo.
     *
     * Si se llega a un borde inferior de la zona de busqueda, no se mueve.
     *
     */
    public void moveDown()
    {
        if (!this.search_zone.isDownBorder(this.y_position))
        {
            this.y_position = (this.y_position + 1);
        }
    }

    /**
     * Mueve en 1 paso al jugador en direccion hacia la izquierda.
     *
     * Si se llega al borde izquierdo de la zona de busqueda, no se mueve.
     *
     */
    public void moveLeft()
    {
        if (!this.search_zone.isLeftBorder(this.x_position))
        {
            this.x_position = (this.x_position - 1);
        }
    }

    /**
     * Mueve en 1 paso al jugador en direccion hacia la derecha.
     *
     * Si se llega al borde derecho de la zona de busqueda, no se mueve.
     *
     */
    public void moveRight()
    {
        if (!this.search_zone.isRightBorder(this.x_position))
        {
            this.x_position = (this.x_position + 1);
        }
    }

}
