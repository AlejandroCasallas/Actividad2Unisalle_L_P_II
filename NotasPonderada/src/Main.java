import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Configurar Scanner para que use coma como separador decimal (ej: 4,3)
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.forLanguageTag("es-ES"));  

        // Crear objeto de la clase CalculoNota
        CalculoNota calculo = new CalculoNota();

        // ====== Solicitar nombre completo del estudiante ======
        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();  

        double nota1, nota2;

        // ====== Validación de la nota 1 ======
        System.out.print("Ingrese la nota del primer corte (0,0 - 5,0): ");
        nota1 = sc.nextDouble();
        while (nota1 < 0.0 || nota1 > 5.0) {
            System.out.println("⚠️ Error: La nota debe estar entre 0,0 y 5,0.");
            System.out.print("Ingrese nuevamente la nota del primer corte: ");
            nota1 = sc.nextDouble();
        }

        // ====== Validación de la nota 2 ======
        System.out.print("Ingrese la nota del segundo corte (0,0 - 5,0): ");
        nota2 = sc.nextDouble();
        while (nota2 < 0.0 || nota2 > 5.0) {
            System.out.println("⚠️ Error: La nota debe estar entre 0,0 y 5,0.");
            System.out.print("Ingrese nuevamente la nota del segundo corte: ");
            nota2 = sc.nextDouble();
        }

        // Evaluar situación con el método de la clase CalculoNota
        String resultado = calculo.evaluarSituacion(nota1, nota2);

        // Imprimir el mensaje con el nombre del estudiante
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Estudiante: " + nombre);
        System.out.println(resultado);

        // Cerrar Scanner
        sc.close();
    }
}
