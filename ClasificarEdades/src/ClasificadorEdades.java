import java.util.ArrayList;
import java.util.List;

// Esta clase se encarga de manejar las edades que ingresa el usuario
// y clasificarlas en las categorías: bebés, niños, adolescentes y adultos.
public class ClasificadorEdades {

    // ====== Atributos ======
    List<Integer> edades; // Aquí vamos a guardar todas las edades

    // ====== Constructor ======
    public ClasificadorEdades() {
        this.edades = new ArrayList<>(); // Inicializamos la lista vacía
    }

    // ====== Métodos ======

    // Guardar una edad en la lista
    public void agregarEdad(int edad) {
        edades.add(edad);
    }

    // Contar cuántos son bebés (0 a 3 años)
    public int contarBebes() {
        int conteo = 0;
        for (int edad : edades) {
            if (edad >= 0 && edad <= 3) {
                conteo++;
            }
        }
        return conteo;
    }

    // Contar cuántos son niños (4 a 12 años)
    public int contarNinos() {
        int conteo = 0;
        for (int edad : edades) {
            if (edad >= 4 && edad <= 12) {
                conteo++;
            }
        }
        return conteo;
    }

    // Contar cuántos son adolescentes (13 a 17 años)
    public int contarAdolescentes() {
        int conteo = 0;
        for (int edad : edades) {
            if (edad >= 13 && edad <= 17) {
                conteo++;
            }
        }
        return conteo;
    }

    // Contar cuántos son adultos (18 años o más)
    public int contarAdultos() {
        int conteo = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                conteo++;
            }
        }
        return conteo;
    }
}
