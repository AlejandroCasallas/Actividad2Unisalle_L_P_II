/* Código realizado por Andriely Casallas y Juan Castellanos 2025
 * Programa que simula un concurso de baile donde cuatro jueces califican a los participantes.
 * El programa calcula el puntaje final de cada participante excluyendo la calificación más baja.
 * 
 * Realizado con fines educativos para la universidad La Salle.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        do {
            String nombre = "";
            double nota = 0.0;
            boolean banderaNombre =  true;
            boolean banderaNota = true;
            Estudiante estudiante = new Estudiante(nombre, nota);
            do {
                System.out.println("Hola, bienvenid@ al sistema de notas.");
                System.out.println("Por favor, ingrese el nombre del estudiante:");
                nombre = input.nextLine();
                estudiante.nombre = nombre;
                if (!nombre.isEmpty() && nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+") && nombre.length() > 7) {
                    banderaNombre = false;
                }    
                else{
                    System.out.println("El nombre que ingresó no es válido. Por favor, ingrese un nombre correcto.");
                    System.out.println("=====================================================================");
                    continue;
                }
            } while (banderaNombre == true);

            System.out.println("Por favor, ingrese la nota del estudiante (0.0 a 10.0): ");
            nota = input.nextDouble();
            input.nextLine();
            estudiante.nota = nota;
            String InformacionCompleta = "Información registrada: \n" +"El estudiante "+ estudiante.nombre + " con nota: " + estudiante.nota;
            String otroEstudiante = "¿Desea ingresar otro estudiante? (s/n): ";

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
                System.out.println("Error en la calificación.");
                InformacionCompleta = "La nota ingresada no es válida. Por favor, intente de nuevo con otro estudiante.";
                otroEstudiante = "¿Desea intentar de nuevo con otro estudiante? (s/n): ";
            }
            System.out.println(InformacionCompleta);
            System.out.println("=====================================================================");
            System.out.println("======================================================================");
            System.out.println(otroEstudiante);
            String bandera = input.nextLine();
            if (bandera.equals("s")) {
                condition = true;
            } else if (bandera.equals("n")) {
                System.out.println("Gracias por usar el sistema de notas, ¡¡Hasta luego colega!!.");
                condition = false;
            }
            else{
                System.out.println("Por favor, ingrese una opción válida (s/n).");
            }
        } while (condition);
        input.close();
    }
}
