import java.util.Scanner;

public class Estudiante {
    Scanner input = new Scanner(System.in);
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}
