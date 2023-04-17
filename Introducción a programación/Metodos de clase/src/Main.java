public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.Acelerar(50);

        var resultado = suma(2,3);
        System.out.println(resultado);
    }
    public static int suma(int operandoA, int operandoB){
        return operandoA + operandoB;
    }
}

interface Vehiculo{
    int variables = 0;
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){

    }
    public  void Frenar(int cuantaVelocidad){

    }
}
