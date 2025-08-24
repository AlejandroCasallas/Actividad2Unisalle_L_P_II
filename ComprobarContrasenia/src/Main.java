/* Código realizado por Andriely Casallas y Juan Castellanos 2025
 * Programa que simula un concurso de baile donde cuatro jueces califican a los participantes.
 * El programa calcula el puntaje final de cada participante excluyendo la calificación más baja.
 * 
 * Realizado con fines educativos para la universidad La Salle.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        // Crear un objeto Usuario para verificar la contraseña
        Usuario usuario = new Usuario();
        // Permitir hasta 3 intentos para ingresar la contraseña
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la contraseña: ");
            // Leer la contraseña ingresada por el usuario
            String contraseniaIngresada = input.nextLine();
            // Verificar si la contraseña es correcta
            if (usuario.verificarContrasenia(contraseniaIngresada)) {
                System.out.println("“¡Felicitaciones! Lograste ingresar.");
                break; // Salir del ciclo si la contraseña es correcta
            } else {
                // Mostrar mensaje de error y cantidad de intentos restantes
                System.out.println("Contraseña incorrecta. Intente de nuevo. le quedan " + (2 - i) + " intentos.");
            }
        }
        // Mensaje mostrado cuando se exceden los intentos permitidos
        System.out.println("==================================");
        System.out.println("Usted ha excedido el número máximo de intentos. ¡Por favor, intente más tarde!");
    }
}
