/**
 * Ejercicio 04
 *
 * @author Christian Amo
 */

public class Ejercicio04 {
  public static void main(String[] args) {

    int sueldoSemanal;

    System.out.print("Introduzca el numero de horas que has trabajado");
    System.out.print(" en la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas < 40) {
      sueldoSemanal = 12 * horasTrabajadas;
    } 
    else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);    
    }
    System.out.print("El sueldo semanal que le corresponde es de " );
    System.out.println( + sueldoSemanal + "€");
  }
}
