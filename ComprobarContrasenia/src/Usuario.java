/* Código realizado por Andriely Casallas y Juan Castellanos 2025
 * Realizado con fines educativos para la universidad La Salle.
 */
public class Usuario {

    // Almacena la contraseña válida para el usuario
    private String contrasenia = "Logica2021";


    //  Verifica si la contraseña ingresada coincide con la contraseña almacenada.
    
    public boolean verificarContrasenia(String contraseniaIngresada) {
        // Compara la contraseña ingresada con la almacenada
        if (contraseniaIngresada.equals(contrasenia)) {
            return true;
        } else {
            return false;
        }
    }
}