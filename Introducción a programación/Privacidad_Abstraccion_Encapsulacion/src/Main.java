
public class Main {
    public static void main(String[] args)
    {
        Vehiculo Coche = new Vehiculo();
        Coche.setTipo("Coupe");
        Coche.setVelocidadMaxima(120);
        Coche.setRapido(true);
        System.out.println(Coche.getTipo() + " " + Coche.getVelocidadMaxima());
        System.out.println("¿es rapido? " +Coche.isRapido());


        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");
        moto.setVelocidadMaxima(50);
        moto.setRapido(false);
        System.out.println(moto.getTipo() + " " + moto.getVelocidadMaxima());
        System.out.println("¿es rapido? " + moto.isRapido());

    }
}
    class Vehiculo
    {   private String tipo;
        private int velocidadMaxima;
        private boolean rapido;

        public void setRapido(boolean rapido) {
            this.rapido = rapido;
        }
        public boolean isRapido(){
            return this.rapido;
        }
        public void setVelocidadMaxima(int velocidadMaxima) {
            this.velocidadMaxima = velocidadMaxima; }
        public int getVelocidadMaxima() {
            return this.velocidadMaxima; }
        public void setTipo(String tipo) {
            this.tipo = tipo;}
        public String getTipo() {
            return this.tipo; }
    }