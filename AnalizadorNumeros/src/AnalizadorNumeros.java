import java.util.ArrayList;
import java.util.List;

// Esta clase se encarga de hacer todo el trabajo "lógico":
// guardar los números, contar cuántos pares/impares hay
// y calcular el promedio.
public class AnalizadorNumeros {

    // ====== Atributos ======
    // Usamos una lista para guardar todos los números que el usuario ingrese.
    // La ventaja de una lista es que podemos guardar tantos números como necesitemos
    // sin preocuparnos de cuántos son.
    List<Integer> numeros;

    // ====== Constructor ======
    public AnalizadorNumeros() {
        // Aquí inicializamos la lista vacía. Cada vez que el usuario
        // ingrese un número, lo vamos a ir metiendo en esta lista.
        this.numeros = new ArrayList<>();
    }

    // ====== Métodos ======

    // Este método recibe un número y lo guarda en la lista.
    // Básicamente es como ir "apilando" todos los números que da el usuario.
    public void agregarNumero(int numero) {
        numeros.add(numero);
    }

    // Este método cuenta cuántos de los números guardados son pares.
    // Recorremos la lista uno por uno, y si el número es divisible entre 2
    // (o sea, residuo cero), lo contamos como par.
    public int contarPares() {
        int conteo = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                conteo++;
            }
        }
        return conteo;
    }

    // Igual que el anterior, pero ahora verificamos cuáles son impares.
    // Si al dividir entre 2 sobra algo (residuo distinto de cero), entonces es impar.
    public int contarImpares() {
        int conteo = 0;
        for (int num : numeros) {
            if (num % 2 != 0) {
                conteo++;
            }
        }
        return conteo;
    }

    // Calculamos el promedio de todos los números.
    // Para eso sumamos todo y luego dividimos entre la cantidad total de números.
    public double calcularPromedio() {
        if (numeros.isEmpty()) {
            // En caso de que no haya números, devolvemos 0 para evitar error.
            return 0;
        }

        int suma = 0;
        for (int num : numeros) {
            suma += num; // Vamos sumando cada número.
        }

        // Convertimos a double para que el resultado sea decimal, no entero.
        return (double) suma / numeros.size();
    }
}
