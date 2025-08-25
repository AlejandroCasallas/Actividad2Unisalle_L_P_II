/* Código realizado por Juan Castellanos y Andriely Casallas 2025
 * Realizado con fines educativos para la universidad La Salle.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Se crea el objeto Scanner para leer la entrada del usuario
        Concurso concurso = new Concurso(); // Se crea una instancia de la clase Concurso
        boolean bandera = true; // Variable para controlar el ciclo principal

        do {
            // Mensaje de bienvenida y explicación
            System.out.println("===============================(°|_|°)===============================");
            System.out.println("Bienvenido al concurso de baile. Ingrese las puntuaciones de los jueces (entre 0 y 10):");

            // Ciclo para ingresar las puntuaciones de los 4 jueces
            for (int i = 0; i < 4; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                int valor = sc.nextInt(); // Se lee la puntuación

                // Validación de la puntuación
                if (valor < 0 || valor > 10) {
                    System.out.println("Por favor, ingrese un número entre 0 y 10.");
                    i--; // Si la puntuación no es válida, se repite la iteración
                    continue;
                } else {
                    concurso.estabNumero(i, valor); // Se almacena la puntuación en el objeto Concurso
                }
            }

            // Se muestran los resultados: menor puntuación y promedio excluyendo el menor
            System.out.println("El número menor es:\n" + concurso.obtenerMenor() +
                "\nEl promedio de los números excluyendo el menor  es:  \n" + concurso.sumarExcluyendoMenor());

            // Se pregunta al usuario si desea calcular el puntaje de otro participante
            System.out.print("¿Desea calcular el puntaje de otro participante? (s/n): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) {
                bandera = false; // Finaliza el ciclo
                System.out.println("Gracias por usar el programa. ¡Hasta luego!");
            } else if (respuesta.equalsIgnoreCase("s")) {
                bandera = true; // Continúa el ciclo
            } else {
                System.out.println("Respuesta no válida. Saliendo del programa.");
                bandera = false; // Finaliza el ciclo por respuesta inválida
            }

        } while (bandera == true); // El ciclo se repite mientras bandera sea true
    }
}