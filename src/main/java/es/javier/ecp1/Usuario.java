package es.javier.ecp1;

public class Usuario {

    private String nombre;

    private String apellidos;

    private int edad;

    private String sexo;

    public Usuario(String nombre, String apellidos, int edad, String sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + this.sexo);
    }
}
