import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VyvdsTest {

    private Vyvds vyvds = new Vyvds();

    @Test
    public void palindromeTest(){
        boolean result = vyvds.isPalindrome("aabbcbbaa");
        assertTrue(result);
    }

    @Test
    public void palindromeWithNotPalindromeStringTest(){
        boolean result = vyvds.isPalindrome("aabbcbbdd");
        assertFalse(result);
    }

    @Test
    public void bisiestoTest(){
        boolean result = vyvds.isBisiesto(2011);
        assertTrue(result);
    }

    @Test
    public void bisiestoWithNotBisiestoYearTest(){
        boolean result = vyvds.isBisiesto(2011);
        assertFalse(result);
    }

    @Test
    public void sumaArregloTest(){
        int a[] = {1,2,3,4,5};
        int result = vyvds.sumaArreglo(a,5);
        assertEquals(15,result);
    }



}
