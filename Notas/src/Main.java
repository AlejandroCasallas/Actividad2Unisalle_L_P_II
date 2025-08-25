/* Código realizado por Juan Castellanos y Andriely Casallas 2025

 * Realizado con fines educativos para la universidad La Salle.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); // Scanner para leer datos del usuario
        boolean condition = true; // Controla el ciclo principal del programa
        do {
            String nombre = "";
            double nota = 0.0;
            boolean banderaNombre =  true; // Controla la validación del nombre
            boolean banderaNota = true; // No se usa en el código actual
            Estudiante estudiante = new Estudiante(nombre, nota); // Crea un objeto Estudiante
            do {
                // Solicita el nombre del estudiante
                System.out.println("Hola, bienvenid@ al sistema de notas.");
                System.out.println("Por favor, ingrese el nombre del estudiante:");
                nombre = input.nextLine();
                estudiante.nombre = nombre;
                // Valida que el nombre no esté vacío, tenga solo letras y sea mayor a 7 caracteres
                if (!nombre.isEmpty() && nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+") && nombre.length() > 7) {
                    banderaNombre = false;
                }    
                else{
                    // Mensaje de error si el nombre no es válido
                    System.out.println("El nombre que ingresó no es válido. Por favor, ingrese un nombre correcto.");
                    System.out.println("=====================================================================");
                    continue;
                }
            } while (banderaNombre == true);

            // Solicita la nota del estudiante
            System.out.println("Por favor, ingrese la nota del estudiante (0.0 a 10.0): ");
            nota = input.nextDouble();
            input.nextLine(); // Limpia el buffer
            estudiante.nota = nota;
            // Prepara la información para mostrar
            String InformacionCompleta = "Información registrada: \n" +"El estudiante "+ estudiante.nombre + " con nota: " + estudiante.nota;
            String otroEstudiante = "¿Desea ingresar otro estudiante? (s/n): ";

            // Clasifica la nota y muestra el resultado
            if (nota >= 0 && nota <= 5) {
                System.out.println("Suspenso");
            } else if (nota > 5 && nota <= 6.5) {
                System.out.println("Aprobado");
            } else if (nota > 6.5 && nota <= 8.5) {
                System.out.println("Notable");
            } else if (nota > 8.5 && nota < 10) {
                System.out.println("Sobresaliente");
            } else if (nota == 10) {
                System.out.println("Matrícula de honor");
            } else {
                // Mensaje de error si la nota no es válida
                System.out.println("Error en la calificación.");
                InformacionCompleta = "La nota ingresada no es válida. Por favor, intente de nuevo con otro estudiante.";
                otroEstudiante = "¿Desea intentar de nuevo con otro estudiante? (s/n): ";
            }
            // Muestra la información registrada
            System.out.println(InformacionCompleta);
            System.out.println("=====================================================================");
            System.out.println("======================================================================");
            System.out.println(otroEstudiante);
            // Pregunta si desea ingresar otro estudiante
            String bandera = input.nextLine();
            if (bandera.equals("s")) {
                condition = true;
            } else if (bandera.equals("n")) {
                System.out.println("Gracias por usar el sistema de notas, ¡¡Hasta luego colega!!.");
                condition = false;
            }
            else{
                // Mensaje si la opción no es válida
                System.out.println("Por favor, ingrese una opción válida (s/n).");
            }
        } while (condition); // Repite mientras el usuario lo desee
    }
}
