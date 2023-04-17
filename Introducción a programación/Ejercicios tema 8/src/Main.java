/*Para practicar la encapsulación:

-Crear clase Persona.
-Crear variables las privadas edad, nombre y telefono de la clase Persona.
-Crear gets y sets de cada propiedad.
-Crear un objeto persona en el main.
-Utiliza los gets y sets para darle valores a las propiedades edad, nombre y
telefono, por último muéstralas por consola.
 */
public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();

        miPersona.setEdad(24);
        miPersona.setTelefono(2684217);
        miPersona.setNombre("Fear Jx");

        System.out.println("Nombre: " + miPersona.getNombre());
        System.out.println("Edad: " + miPersona.getEdad());
        System.out.println("Telefono: " + miPersona.getTelefono());
    }
}
    class Persona
    {
        private int edad, telefono;
        private String nombre;
        public void setEdad(int edad)
        {
            this.edad = edad;
        }
        public int getEdad()
        {
            return this.edad;
        }
        public void setTelefono(int telefono)
        {
            this.telefono = telefono;
        }
        public int getTelefono()
        {
            return this.telefono;
        }
        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }
        public String  getNombre()
        {
            return this.nombre;
        }
}