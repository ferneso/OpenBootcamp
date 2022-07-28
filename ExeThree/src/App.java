/* Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 */

public class App {
    public static void main(String[] args) throws Exception {

        Persona fernando = new Persona();
        fernando.setEdad(41);
        fernando.setNombre("Fernando");
        fernando.setTelefono("3391-6282");

        System.out.println(
            "Esta persona se llama: " + fernando.getNombre() +
            ", su edad es de " + fernando.getEdad() + " años, " + 
            "y su numero de telefono para contacto es: " + fernando.getTelefono()
        );
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;


    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}

