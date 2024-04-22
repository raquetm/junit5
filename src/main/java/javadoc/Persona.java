package javadoc;

public class Persona {

    private String nombre; // Nombre de la persona
    private int edad;      // Edad de la persona

    /**
     * Constructor de la clase Persona.
     * String nombre: El nombre de la persona.
     * int edad: La edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece una nueva edad para la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Imprime por pantalla los detalles de la persona.
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

