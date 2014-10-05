package es.javier.ecp1;

public class Usuario {

    private String nombre;

    private String apellidos;

    private int edad;

    private String sexo;

    private String profesion;

    public Usuario(String nombre, String apellidos, int edad, String sexo, String profesion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.profesion = profesion;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Profesion: " + this.profesion);
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
