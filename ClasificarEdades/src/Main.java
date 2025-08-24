import java.util.Scanner;

// Clase principal: pide las edades al usuario y muestra el resultado
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos un clasificador, que hará el trabajo de contar cada grupo de edad
        ClasificadorEdades clasificador = new ClasificadorEdades();

        System.out.println("Ingrese la edad de 10 personas:");

        // Vamos a pedir exactamente 10 edades
        for (int i = 1; i <= 10; i++) {
            System.out.print("Edad de la persona " + i + ": ");
            int edad = sc.nextInt();

            // Guardamos la edad en nuestro clasificador
            clasificador.agregarEdad(edad);
        }

        // Mostramos los resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Bebés (0 a 3 años): " + clasificador.contarBebes());
        System.out.println("Niños (4 a 12 años): " + clasificador.contarNinos());
        System.out.println("Adolescentes (13 a 17 años): " + clasificador.contarAdolescentes());
        System.out.println("Adultos (18 años o más): " + clasificador.contarAdultos());

        sc.close(); // Cerramos el scanner
    }
}
