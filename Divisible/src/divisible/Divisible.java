package divisible;

import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Prueba de divisibilidad. Éste es un programa en el que se introducen dos
 * números enteros y mediante una sentencia de selección se determina si son
 * divisibles.
 *
 */
public class Divisible {

    public static void main(String[] args) {
        Divisible divisible = new Divisible();
        divisible.div();
    }

    public void div() {
           int n, d;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca dos enteros:");
        n = entrada.nextInt();
        d = entrada.nextInt();
        if (n%d == 0) {
            System.out.println(n + " es divisible por " + d);
        }   
    }
    
}
