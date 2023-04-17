
public class Main {
    public static void main(String[] args) {
        // Ejercicio No.1
  //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
  //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        System.out.println("Primer ejercicio:");
        int numeroIf1 = -5;
        int numeroIf2 = 10;

        if(numeroIf1 <0)
        {
            System.out.println("el numeroIf1 = "+numeroIf1 + " , es un numero negativo");
        }
        if(numeroIf2>0)
        {
            System.out.println("el numeroIf2 = "+numeroIf2 +" , es un numero positivo");
        }

        // Ejercicio No.2
        // Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        // el bloque de código que tendrá el bucle deberá:
        // - Incrementar el valor de la variable en uno cada vez que se ejecute.
        // - Mostrarlo por pantalla cada vez que se ejecute.
        System.out.println("\nSegundo ejercicio:");
        int numeroWhile = 1;
        while( numeroWhile < 3)
        {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        System.out.println("\nTercer ejercicio:");

        int numeroDoWhile = 1;
        do
        {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }
        while(numeroDoWhile < 3);


        System.out.println("\nCuarto ejercicio:");
        // Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y
        // su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor
        // cada vez que se ejecute y deberá mostrarse por pantalla.

        for(int numeroFor = 0; numeroFor<=3; numeroFor++)
        {
            System.out.println(numeroFor);
        }

        System.out.println("\nQuinto ejercicio:");
        //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        // Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        // También habrá que poner un default para cuando el valor de la variable no sea una estación.

        String estacion = "Invierno";

        switch (estacion)
        {
            case "Primavera":
                System.out.println("Es Primavera :D");
                break;

            case "Verano":
                System.out.println("Es Verano :D");
                break;
            case "Otoño":
                System.out.println("Es Otoño :D");
                break;

            case "Invierno":
                System.out.println("Es Invierno :D");
                break;

            default:
                System.out.println("No es una estacion del año.");
                break;
        }
    }
}