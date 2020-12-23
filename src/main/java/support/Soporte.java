package support;

public class Soporte {

    // Retorna un entero aleatorio entre min (incluido) y max (excluido)
    // ¡Usando Math.round() te dará una distribución no-uniforme!
    public int getRandomInt(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min)) + min;
    }
}
