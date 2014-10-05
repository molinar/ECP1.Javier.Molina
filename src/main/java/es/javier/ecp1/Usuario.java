package es.javier.ecp1;

public class Usuario {

    private String nombre;

    private String apellidos;

    private int edad;

    private int telefono;

    private String sexo;

    private String profesion;

    private int dni;

    public Usuario(String nombre, String apellidos, int edad, int telefono, String sexo,
            String profesion, int dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.sexo = sexo;
        this.profesion = profesion;
        this.dni = dni;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Profesion: " + this.profesion);
        System.out.println("DNI: " + this.dni);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public int getDNI() {
        return this.dni;
    }

    public String getProfesion() {
        return this.profesion;
    }
}
