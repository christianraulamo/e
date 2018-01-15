package ejerciciodel1al15;

/**
 *
 * @author christian
 */
import ejerciciodel1al15.matematicas.varia;
import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número en base diez para pasarlo a binario: ");
        int decimal = s.nextInt();

        System.out.println(decimal + " en decimal es " + decimalABinario(decimal) + " en binario.");

    }

    /**
     * Pasa un número decimal (en base 10) a binario (base 2).
     *
     * @param decimal número entero en base 10
     * @return número inicial pasado a binario
     */
    public static long decimalABinario(int decimal) {

        if (decimal == 0) {
            return 0;
        }

        long binario = 1;

        while (decimal > 1) {
            binario = ejerciciodel1al15.matematicas.varia.pegaPorDetras(binario, decimal % 2);
            decimal = decimal / 2;
        }
        binario = ejerciciodel1al15.matematicas.varia.pegaPorDetras(binario, 1);
        binario = ejerciciodel1al15.matematicas.varia.voltea(binario);
        binario = ejerciciodel1al15.matematicas.varia.quitaPorDetras(binario, 1);

        return binario;

    }
}
