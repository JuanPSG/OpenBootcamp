public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        cocheChanger(coche);
        cocheChanger(coche);

        System.out.println(coche.velocidad);
        factorial(8);
        suma(10,20);
    }
    public static void suma(int a , int b){
        var temp = a + b;
        System.out.println("A vale: " + a + " ,B vale: " + b + ", temp vale: "+ temp);
        if(b >=90){
            return ;
        }
        suma(a,temp);
    }

    //RECURSIVIDAD
    public static int factorial(int numero){
        int resultado;
        if(numero ==1){
            return 1;
        }
        resultado =  factorial(numero-1)*numero;
        return resultado;
    }

    //de forma no recursiva
    public static int factorialNR(int numero){
        int temp;
        int resultado = 1;

        for(temp = 1; temp<=numero; temp++){
            resultado =  resultado * temp;
        }
        return resultado;
    }

    //paso por referencia
    public static void cocheChanger(Coche coche){
        coche.velocidad += coche.velocidad + 50;
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
