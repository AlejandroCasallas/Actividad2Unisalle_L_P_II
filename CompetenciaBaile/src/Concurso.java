/* Código realizado por Andriely Casallas y Juan Castellanos 2025
 * Programa que simula un concurso de baile donde cuatro jueces califican a los participantes.
 * El programa calcula el puntaje final de cada participante excluyendo la calificación más baja.
 * 
 * Realizado con fines educativos para la universidad La Salle.
 */

public class Concurso {
    private double[] numeros;

    public Concurso() {
        numeros = new double[4];
    }

    public void estabNumero(int indice, double valor) {
        if (indice >= 0 && indice < numeros.length) {
            numeros[indice] = valor;
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    public double sumarNumeros() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma;
    }

    public double obtenerMenor() {
        double menor = numeros[0];
        for (double num : numeros) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public double sumarExcluyendoMenor() {
        double suma = sumarNumeros();
        double menor = obtenerMenor();
        double sumaComp = suma -= menor;
        double promedio = sumaComp / 3;
        return promedio;
    }
}