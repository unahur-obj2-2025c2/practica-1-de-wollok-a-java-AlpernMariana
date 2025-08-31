package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DocumentalTest {
    
     @Test
    public void testCostoConCanonPorDefecto(){
        Documental documental = new Documental("Planeta Tierra", 2.0);
        assertEquals(2.5,documental.calcularCostoLicencia());
    }

     @Test
    public void testCostoConCanonModificado(){
        Documental documental = new Documental("Planeta Tierra", 2.0);
        Documental.setCanonIDRA(1.0);
        assertEquals(3.0,documental.calcularCostoLicencia());
}
}
