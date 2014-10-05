package es.javier.ecp1;

public class Usuario {

    private String nombre;

    private String apellidos;

    private int edad;
    
    private int dni;

    public Usuario(String nombre, String apellidos, int edad, int dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
        System.out.println("DNI: " + this.dni);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getEdad() {
        return this.edad;
    }
}
