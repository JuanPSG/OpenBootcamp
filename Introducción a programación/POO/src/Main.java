
public class Main {
    public static void main(String[] args)
    {
        //creación de objeto coche
        coche miCoche = new coche();
        //sin parametros
        System.out.println("Puertas: " + miCoche.numeroDePuertas);
        System.out.println(miCoche.velocidadMaxima);
        miCoche.acelerar();
        System.out.println(miCoche.velocidadActual);
        miCoche.desacelerar();

        System.out.println("\nSegunda parte");
        //con parametros
        coche miCoche2 = new coche(2,300);
        System.out.println(miCoche2.numeroDePuertas);
        System.out.println(miCoche2.velocidadMaxima);
        System.out.println(miCoche2.velocidadActual);
    }
}
    class coche
    {
        int numeroDePuertas;
        int velocidadMaxima;
        float velocidadActual;

        // constructor
        public coche()
        {
            numeroDePuertas = 4;
            velocidadMaxima = 120;
            System.out.println("Estoy en el constructor sin nada ***");
        }
        public coche(int numeroDePuertas, int velocidadMaxima)
        {
            this.numeroDePuertas = numeroDePuertas;
            this.velocidadMaxima = velocidadMaxima;
            System.out.println("Estoy en el constructor con PARAMETROS");
        }
        public void acelerar() {
            velocidadActual +=15;
        }
        public void desacelerar() {}
}