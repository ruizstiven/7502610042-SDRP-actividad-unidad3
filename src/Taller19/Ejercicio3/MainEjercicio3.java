package Taller19.Ejercicio3;

public class MainEjercicio3 {
    public static void main(String[] args) {
        String datosVentas = "Ventas Totales Q3: $15,400";

        // Prueba generando Reporte PDF
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestor = new GestorReportes(pdf);
        gestor.exportar(datosVentas);

        // Prueba generando Reporte Excel
        GeneradorReporte excel = new ReporteExcel();
        gestor = new GestorReportes(excel);
        gestor.exportar(datosVentas);
    }
}