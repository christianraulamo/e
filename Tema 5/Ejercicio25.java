/**
 * Ejercicio 25
 *
 * @author Christian Amo
 */
 
  public class Ejercicio25 {
  
  public static void main(String[] args) {

    System.out.print("Meta un número entero: ");
    
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroIntroducido;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
  }
}
