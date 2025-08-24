import java.util.Scanner;

// Esta es la clase principal, donde corre el programa.
// Aquí le pedimos los números al usuario y mostramos los resultados finales.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos un objeto de nuestra clase AnalizadorNumeros.
        // Este objeto se encargará de guardar y analizar los números.
        AnalizadorNumeros analizador = new AnalizadorNumeros();

        // Primero preguntamos cuántos números quiere ingresar el usuario.
        // Con esto sabremos cuántas veces pedir un número.
        System.out.print("Ingrese la cantidad de números enteros a leer: ");
        int cantidad = sc.nextInt();

        // Ahora pedimos cada número, uno por uno, según la cantidad que nos dijeron.
        // Usamos un ciclo for porque sabemos exactamente cuántas veces vamos a repetir.
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = sc.nextInt();
            // Cada número que el usuario da lo guardamos en nuestro analizador.
            analizador.agregarNumero(num);
        }

        // Ya que tenemos todos los números, ahora mostramos los resultados.
        // Para eso simplemente llamamos a los métodos que creamos en la otra clase.
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Total de números pares: " + analizador.contarPares());
        System.out.println("Total de números impares: " + analizador.contarImpares());
        System.out.printf("Promedio de todos los números: %.2f%n", analizador.calcularPromedio());

        // Cerramos el Scanner para liberar memoria (buena práctica).
        sc.close();
    }
}
