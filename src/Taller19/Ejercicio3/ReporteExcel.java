package Taller19.Ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando hoja de cálculo Excel (.xlsx) con los datos: [" + datos + "]");
    }
}
