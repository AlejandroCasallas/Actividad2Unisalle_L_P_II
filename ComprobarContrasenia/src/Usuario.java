/* Código realizado por Andriely Casallas y Juan Castellanos 2025
 * Programa que simula un concurso de baile donde cuatro jueces califican a los participantes.
 * El programa calcula el puntaje final de cada participante excluyendo la calificación más baja.
 * 
 * Realizado con fines educativos para la universidad La Salle.
 */
public class Usuario {

    private String contrasenia = "Logica2021";

    public boolean verificarContrasenia(String contraseniaIngresada) {
        if (contraseniaIngresada.equals(contrasenia)) {
            return true;
        } else {
            return false;
        }
    }
}