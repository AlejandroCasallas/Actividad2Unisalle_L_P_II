/* Código realizado por Andriely Casallas y Juan Castellanos 2025
 * Programa que simula un concurso de baile donde cuatro jueces califican a los participantes.
 * El programa calcula el puntaje final de cada participante excluyendo la calificación más baja.
 * 
 * Realizado con fines educativos para la universidad La Salle.
 */

public class Concurso {
    // Arreglo para almacenar las calificaciones de los jueces
    private double[] numeros;

    // Constructor: inicializa el arreglo de calificaciones con tamaño 4
    public Concurso() {
        numeros = new double[4];
    }

    // Método para establecer una calificación en una posición específica
    public void estabNumero(int indice, double valor) {
        if (indice >= 0 && indice < numeros.length) {
            numeros[indice] = valor;
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    // Método para sumar todas las calificaciones
    public double sumarNumeros() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma;
    }

    // Método para obtener la calificación más baja
    public double obtenerMenor() {
        double menor = numeros[0];
        for (double num : numeros) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    // Método para calcular el promedio excluyendo la calificación más baja
    public double sumarExcluyendoMenor() {
        double suma = sumarNumeros(); // Suma total de las calificaciones
        double menor = obtenerMenor(); // Calificación más baja
        double sumaComp = suma -= menor; // Suma excluyendo la más baja
        double promedio = sumaComp / 3; // Promedio de las tres calificaciones restantes
        return promedio;
    }
}