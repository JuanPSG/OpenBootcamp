public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();

        Moto moto = new Moto();

        EjecutaAcelear(coche);
        EjecutaAcelear(moto);
    }
    public static void EjecutaAcelear(Vehiculo vehiculo){
        vehiculo.Acelerar(15);
    }
}

interface Vehiculo{
    int variables = 0;
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo{
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
