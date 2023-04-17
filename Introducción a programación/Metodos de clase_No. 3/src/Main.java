public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        cocheChanger(coche);
        cocheChanger(coche);

        System.out.println(coche.velocidad);
    }
    //paso por referencia
    public static void cocheChanger(Coche coche){
        coche.velocidad += coche.velocidad + 50;
    }

    //paso por valor
    public static int suma (int a, int b){
        return a + b;
    }
}

interface Vehiculo{
    int variables = 0;
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo{
    int velocidad = 0;
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Coche() -> Acelerar()");
    }
    public  void Frenar(int cuantaVelocidad){
        System.out.println("Coche() -> Frenar()");
    }
}

class Moto implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Moto() -> Acelerar()");
    }
    public  void Frenar(int cuantaVelocidad){
        System.out.println("Moto() -> Frenar()");
    }
}
