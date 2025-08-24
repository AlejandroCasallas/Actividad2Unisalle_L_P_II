/* Código realizado por Andriely Casallas y Juan Castellanos 2025
 * Programa que simula un concurso de baile donde cuatro jueces califican a los participantes.
 * El programa calcula el puntaje final de cada participante excluyendo la calificación más baja.
 * 
 * Realizado con fines educativos para la universidad La Salle.
 */

import java.util.Scanner;

// Definición de la clase Estudiante
public class Estudiante {
    // Scanner para entrada de datos por consola
    Scanner input = new Scanner(System.in);
    // Nombre del estudiante
    String nombre;
    // Nota del estudiante
    double nota;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre; // Asigna el nombre recibido
        this.nota = nota;     // Asigna la nota recibida
    }
}
