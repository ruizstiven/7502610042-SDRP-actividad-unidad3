package Taller19.Ejercicio3;

public class GestorReportes {
    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void exportar(String informacion) {
        System.out.println("Iniciando exportación de reporte...");
        generadorReporte.generar(informacion);
        System.out.println("Exportación finalizada.\n");
    }
}