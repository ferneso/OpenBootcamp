
/*Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador. */

public class App {
    public static void main(String[] args) throws Exception {
        Cliente clienteUno= new Cliente();
        clienteUno.setEdad(25);
        clienteUno.setNombre("Juan Cruz");
        clienteUno.setTelefono("+54911-2568-6589");
        clienteUno.setCredito("Aprobado");
        System.out.println("El cliente se llama: " + clienteUno.getNombre() + "\n" + "Su edad es de: " + clienteUno.getEdad() + " años\n" + "El teléfono para contacto es: " + clienteUno.getTelefono() + "\n" + "El estado del crédito es: " + clienteUno.getCredito());
        System.out.println("*****************************************************");

        Trabajador trabajadorUno = new Trabajador();
        trabajadorUno.setEdad(43);
        trabajadorUno.setNombre("Pablo");
        trabajadorUno.setSalario("USD 1.200");
        trabajadorUno.setTelefono("+549022-2456-6589");
        System.out.println("El trabajador se llama: " + trabajadorUno.getNombre() + "\n" + "La edad es: " + trabajadorUno.getEdad() + " años\n" + "El salario mensual es de : " + trabajadorUno.getSalario() + "\n" + "El teléfono para contacto es: " + trabajadorUno.getTelefono());

    }
} 

class Persona {
    int edad;
    String nombre;
    String telefono;

    
    public Persona() {
    }

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

class Cliente extends Persona {
    String credito;

    
    public Cliente() {
        super();
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
    
}

class Trabajador extends Persona {
    String Salario;

    
    public Trabajador() {
        super();
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String salario) {
        Salario = salario;
    }
    
}


