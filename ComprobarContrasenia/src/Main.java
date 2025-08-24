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
        Usuario usuario = new Usuario();
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la contraseña: ");
            String contraseniaIngresada = input.nextLine();
            if (usuario.verificarContrasenia(contraseniaIngresada)) {
                System.out.println("“¡Felicitaciones! Lograste ingresar.");
                break;
            } else {
                System.out.println("Contraseña incorrecta. Intente de nuevo. le quedan " + (2 - i) + " intentos.");
            }
        }
        System.out.println("==================================");
        System.out.println("Usted ha excedido el número máximo de intentos. ¡Por favor, intente más tarde!");
    }
}
