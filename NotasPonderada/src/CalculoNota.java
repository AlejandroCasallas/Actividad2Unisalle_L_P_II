// Clase que contiene la lógica del cálculo de notas
public class CalculoNota {

    // ====== Atributos ======
    double porcentajeCorte1;   // Porcentaje del primer corte
    double porcentajeCorte2;   // Porcentaje del segundo corte
    double porcentajeCorte3;   // Porcentaje del tercer corte
    double notaMinima;         // Nota mínima necesaria para aprobar

    // ====== Constructor ======
    public CalculoNota() {
        // Inicializamos los atributos con los valores del enunciado
        this.porcentajeCorte1 = 0.35;
        this.porcentajeCorte2 = 0.35;
        this.porcentajeCorte3 = 0.30;
        this.notaMinima = 3.0; // Generalmente, en universidades, se aprueba con 3.0
    }

    // ====== Métodos ======

    // Método que calcula la nota mínima que el estudiante debe sacar en el tercer corte
    public double calcularNotaNecesaria(double nota1, double nota2) {
         // Se calcula la nota parcial con los porcentajes de los dos primeros cortes
        double acumulado = (nota1 * porcentajeCorte1) + (nota2 * porcentajeCorte2);

        // Se calcula cuánto necesita en el tercer corte para llegar a la nota mínima
        double notaNecesaria = (notaMinima - acumulado) / porcentajeCorte3;

        return notaNecesaria;
    }

    // Método que evalúa la situación del estudiante y devuelve un mensaje
    public String evaluarSituacion(double nota1, double nota2) {
          // Calculamos la nota necesaria en el tercer corte
        double notaNecesaria = calcularNotaNecesaria(nota1, nota2);

        // Si ya aprobó con los dos primeros cortes
        if (notaNecesaria <= 0) {
            return "Felicitaciones! Aprobaste el curso con los dos primeros cortes";
        }

        // Si es imposible aprobar
        if (notaNecesaria > 5.0) {
            return "Ya no hay posibilidad que apruebes el curso. Debes estudiar mejor para el próximo semestre";
        }

        // Si la nota necesaria es mayor a 3.0 (caso desafiante)
        if (notaNecesaria > 3.0) {
            return "Necesitas sacar al menos " + String.format("%.2f", notaNecesaria) + " en el tercer corte para aprobar.";
        }

        // Si necesita 3.0 o menos, se considera que ya está prácticamente aprobado
            return "Felicitaciones! Aprobaste el curso con los dos primeros cortes";
    }
}
