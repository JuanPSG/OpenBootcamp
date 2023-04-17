public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("brrr");
        System.out.println(coche.getSonido());

        Moto moto = new Moto();
        moto.setSonido("brrr");
        System.out.println(moto.getSonido());
    }
}
// Clase Padre
 abstract class Vehiculo{
    int velocidadMaxima;
    String matricula;
    String sonido;
    public Vehiculo(){
        System.out.println("Estoy en el constructor de Vehiculo");
    }
    abstract public void setSonido(String sonido);
    abstract public String getSonido();
}
// Con la palabra reservada "extends" puedo heredar
class Coche extends Vehiculo{
    public String getSonido(){
        return "Soy un supersonido: " + this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}
class Moto extends Coche{
    public String getSonido(){
        return "Soy un sonido de moto: " + this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}