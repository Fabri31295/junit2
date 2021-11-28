import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {

    private Smartphone smartphone = new Smartphone();

    @Test
    public void bateriaBajaTest(){
        String result = smartphone.bateria(15);
        assertEquals("Baja", result);
    }

    @Test
    public void bateriaMediaTest(){
        String result = smartphone.bateria(45);
        assertEquals("Media", result);
    }

    @Test
    public void bateriaAltaTest(){
        String result = smartphone.bateria(95);
        assertEquals("Alta", result);
    }

    @Test
    public void bateriaInvalidaTest(){
        String result = smartphone.bateria(114);
        assertEquals("Invalida", result);
    }

    @Test
    public void sistemaOperativoAppleTest(){
        String result = smartphone.sistemaOperativo("Apple");
        assertEquals("iOS", result);
    }

    @Test
    public void sistemaOperativoAndroidTest(){
        String result = smartphone.sistemaOperativo("Motorola");
        assertEquals("Android", result);
    }
}
