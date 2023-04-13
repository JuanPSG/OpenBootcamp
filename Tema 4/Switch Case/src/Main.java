
public class Main {
    public static void main(String[] args)
    {// se declara una variable estación y se le asigna como valor "verano"
        String estacion = "verano";
        // en el switch se compara la variable y dependiendo el valor se muestra un mensaje distinto en pantalla
        switch (estacion)
        {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            default:
                System.out.println("No sé que estación es");
                break;}}}