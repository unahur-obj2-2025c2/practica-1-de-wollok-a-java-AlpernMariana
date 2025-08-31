package ar.edu.unahur.obj2.wtoj.contenido;

public class Documental {
    private String titulo;
    private Double costoBase;
    private static Double canonIDRA = 0.5;


    public Documental(String titulo, double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public Double calcularCostoLicencia() {
        return costoBase + canonIDRA;
       
    }

    public static void setCanonIDRA(Double canon) {
        Documental.canonIDRA = canon;
    }
}
