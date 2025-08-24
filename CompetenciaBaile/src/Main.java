/* Código realizado por Juan Castellanos y Andriely Casallas 2025
 * Programa que simula un concurso de baile donde cuatro jueces califican a los participantes.
 * El programa calcula el puntaje final de cada participante excluyendo la calificación más baja.
 * 
 * 
 
 * Realizado con fines educativos para la universidad La Salle.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Concurso concurso = new Concurso();
        boolean bandera = true;

        do {
            System.out.println("===============================(°|_|°)===============================");
            System.out.println("Bienvenido al concurso de baile. Ingrese las puntuaciones de los jueces (entre 0 y 10):");

            for (int i = 0; i < 4; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                int valor = sc.nextInt();
                if (valor <0 || valor >10) {
                    System.out.println("Por favor, ingrese un número entre 0 y 10.");
                    i--;
                    continue;
                    
                }
                else{
                    concurso.estabNumero(i, valor);
                }
            }

            System.out.println("El número menor es:\n" + concurso.obtenerMenor() +"\nEl promedio de los números excluyendo el menor  es:  \n" + concurso.sumarExcluyendoMenor());

            System.out.print("¿Desea calcular el puntaje de otro participante? (s/n): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) {
                bandera = false;
                System.out.println("Gracias por usar el programa. ¡Hasta luego!");
            }
            else if (respuesta.equalsIgnoreCase("s")) {
                bandera = true;
            }
            else {
                System.out.println("Respuesta no válida. Saliendo del programa.");
                bandera = false;
            }
            
        } while (bandera == true);

        sc.close();
    }
}