public class Vyvds {

    public boolean isPalindrome(String str){
        int forward = 0;
        int backward = str.length() - 1;
        while(backward > forward) {
            char fwChar = str.charAt(forward++);
            char bwChar = str.charAt(backward--);
            if(fwChar != bwChar)
                return false;
        }
        return true;
    }

    public boolean isBisiesto(int anio){
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            return true;
        else
            return false;
    }

    public int sumaArreglo(int a[],int l){
        int i;
        int total = 0;
        for(i = 0; i < l; i++){
            total += a[i];
        }
        return total;
    }
}
