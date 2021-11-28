public class Smartphone {

    public String bateria(int x){
        if(x < 20)
            return "Baja";
        else {
            if (x<80)
                return "Media";
            else{
                if(x<=100)
                    return "Alta";
                else
                    return "Invalida";
            }
        }
    }

    public String sistemaOperativo(String marca) {
        if(marca == "Motorola" || marca == "Samsung")
            return "Android";
        else
            return "iOS";
    }
}