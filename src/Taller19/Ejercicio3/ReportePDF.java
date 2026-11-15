package Taller19.Ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando documento PDF con los datos: [" + datos + "]");
    }
}