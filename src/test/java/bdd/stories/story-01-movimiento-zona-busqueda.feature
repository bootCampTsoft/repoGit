Feature: Movimiento en una Zona de Busqueda.

  Como Jugador
  Quiero moverme en una Zona de Busqueda cuando inicia el juego
  Para ver si obtengo algún BUFF

  Rule: El Jugador 1 comienza en la posición 7,4
    Example: El Ju1gador 1 encuentra la esquina superior derecha
      Given Soy el Jugador 1
      And está empezando el juego
      When me muevo 3 posiciones hacia arriba
      Then llego a la esquina superior derecha de la zona

    Example: El Jugador 1 encuentra la esquina superior izquierda
      Given Soy el Jugador 1
      And está empezando el juego
      When me muevo 6 posiciones hacia la izquierda
      And me muevo 3 posiciones hacia arriba
      Then llego a la esquina superior izquierda de la zona

