package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PeliculaTest {

    @Test
    public void TestQueCalculaCostoLicencia(){
        //preparación
        Pelicula pelicula = new Pelicula("Matrix", 3.0);
        Double valorEsperado = 3.0;
        //ejecución
        Double valorObtenido = pelicula.calcularCostoLicencia();
        //contrastación
        assertEquals(valorEsperado, valorObtenido);
    }
}
