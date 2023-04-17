
public class Main {
    public static void main(String[] args)
    {
        //Llamamos a la función SUMA y le agregamos los datos que queremos sumar.
        suma(5,4,10);

        //Llamamos a la función COCHE
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puerta);
    }

    //función suma
    public static void suma (int a, int b, int c)
    {
        //indicamos que el valor de la variable RESULTADO será la suma de los tres datos que vamos a recibir
        int resultado = a+b+c;
        //imprimimos el mensaje y el resultado de la suma
        System.out.println("La suma es: "+ resultado);
    }
}
//función coche
class Coche
{
    public int puerta = 0;

    public void AgregarPuerta()
    {
        this.puerta++;
    }
}