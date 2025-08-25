/* Código realizado por Juan Castellanos y Andriely Casallas 2025
 * Realizado con fines educativos para la universidad La Salle.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        boolean bandera = true; // Variable para controlar el ciclo principal del programa
        do {
            // Mensaje de bienvenida
            System.out.println("Buenas tardes, te damos la bienvenida al sistema Rainfall");
            Scanner input = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

            // Solicita al usuario la cantidad de años a registrar
            System.out.println("Por favor ingrese la cantidad de años que quiere registrar: ");
            int anios = input.nextInt(); // Lee el número de años

            // Crea arreglos para almacenar la lluvia de cada trimestre por año
            double [] lluvia1T = new double[anios];
            double [] lluvia2T = new double[anios];
            double [] lluvia3T = new double[anios];
            double [] lluvia4T = new double[anios];
            
            // Ciclo para cada año
            for (int i = 1; i <= anios; i++) {
                double lluviaTotalAnio = 0;
                // Ciclo para cada trimestre
                for (int j = 1; j <= 4; j++) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("A continuación ingrese por favor la lluvia para el año: "+ i +" y para el trimestre: "+j);
                    double lluvia = input.nextDouble(); // Lee la cantidad de lluvia para el trimestre

                    // Validación: la lluvia no puede ser negativa
                    if (lluvia < 0) {
                        System.out.println("Error, la lluvia no puede ser negativa, por favor ingrese un valor válido");
                        j--; // Repite el trimestre si el valor es inválido
                        continue;
                    } else {
                        // Guarda la lluvia en el arreglo correspondiente al trimestre
                        switch (j) {
                            case 1:
                                lluvia1T[i-1] = lluvia;
                                break;
                            case 2:
                                lluvia2T[i-1] = lluvia;
                                break;
                            case 3:
                                lluvia3T[i-1] = lluvia;
                                break;
                            case 4:
                                lluvia4T[i-1] = lluvia;
                                break;
                            default:
                                break;
                        }
                    }
                }
            }

            // Calcula el promedio de lluvia para cada trimestre en todos los años
            double promedio1T = calcularPromedio(lluvia1T);
            double promedio2T = calcularPromedio(lluvia2T);
            double promedio3T = calcularPromedio(lluvia3T);
            double promedio4T = calcularPromedio(lluvia4T);

            // Calcula la suma total de lluvia en todos los trimestres y años
            double totalSuma = suamTotal(lluvia1T) + suamTotal(lluvia2T) + suamTotal(lluvia3T) + suamTotal(lluvia4T);
            double promedio = totalSuma / anios; // Promedio anual de lluvia

            System.out.println("--------------------------------------------------");
            // Muestra el promedio de lluvia por año y los valores de cada trimestre
            for (int i = 1; i <= anios; i++) {
                System.out.println("El promedio de lluvia para el año: "+ i +" es de: "+ ((lluvia1T[i-1] + lluvia2T[i-1] + lluvia3T[i-1] + lluvia4T[i-1])/4) +" pulgadas" );
                System.out.println("Cada trimestre del año: "+ i +" tuvo las siguientes lluvias: ");
                System.out.println("Trimestre 1: "+ lluvia1T[i-1] +" pulgadas");
                System.out.println("Trimestre 2: "+ lluvia2T[i-1] +" pulgadas");
                System.out.println("Trimestre 3: "+ lluvia3T[i-1] +" pulgadas");
                System.out.println("Trimestre 4: "+ lluvia4T[i-1] +" pulgadas");
                System.out.println("--------------------------------------------------");
            }
            // Muestra el promedio de lluvia por trimestre en todos los años
            System.out.println("El promedio de lluvia para el trimestre 1 durante " + anios+ " años es de: "+ promedio1T +" pulgadas" );
            System.out.println("El promedio de lluvia para el trimestre 2 durante " + anios+ " años es de: "+ promedio2T +" pulgadas" );
            System.out.println("El promedio de lluvia para el trimestre 3 durante " + anios+ " años es de: "+ promedio3T +" pulgadas" );
            System.out.println("El promedio de lluvia para el trimestre 4 durante " + anios+ " años es de: "+ promedio4T +" pulgadas" );
            System.out.println("--------------------------------------------------");
            // Muestra el promedio anual de lluvia
            System.out.println("El promedio de lluvia anual durante " + anios+" años es de: "+ promedio +" pulgadas" );

            // Pregunta al usuario si desea ingresar más información
            System.out.println("¿Desea ingresar más información? (s/n)");
            String respuesta = input.next();
            if (respuesta.equals("s")) {
                bandera = true; // Repite el ciclo si la respuesta es 's'
            }
            else{
                System.out.println("Gracias por usar nuestro sistema, ¡Hasta pronto colega!");
                bandera = false; // Termina el ciclo si la respuesta es diferente
            }
        } while (bandera == true); // Ciclo principal del programa
    }

    // Función para calcular el promedio de lluvia de un trimestre
    public static double calcularPromedio(double[] lluviaTrimestre) {
        double suma = 0;
        for (double lluvia : lluviaTrimestre) {
            suma += lluvia;
        }
        return suma / lluviaTrimestre.length;
    }

    // Función para calcular la suma total de lluvia de un trimestre
    public static double suamTotal(double[] lluviaTrimestre) {
        double suma = 0;
        for (double lluvia : lluviaTrimestre) {
            suma += lluvia;
        }
        return suma;
    }
}