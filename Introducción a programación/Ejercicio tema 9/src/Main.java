public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente();
       cliente.edad=34;
       cliente.nombre = "Fear";
       cliente.telefono = "364889702";
       cliente.credito = 1000000;

       Trabajador trabajador = new Trabajador();
       trabajador.edad = 45;
       trabajador.nombre = "John";
       trabajador.telefono = "6668415487";
       trabajador.salario = 14568;

       System.out.println("-----Cliente-----");
       System.out.println("Nombre: " + cliente.nombre);
       System.out.println("Edad: " + cliente.edad);
       System.out.println("Telefono: " + cliente.telefono);
       System.out.println("Credito disponible: " + cliente.credito);

       System.out.println("-----Trabajador-----");
       System.out.println("Nombre: " + trabajador.nombre);
       System.out.println("Edad: " + trabajador.edad);
       System.out.println("Telefono: " + trabajador.telefono);
       System.out.println("Credito disponible: " +trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre, telefono;
}
class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
    int salario;
}