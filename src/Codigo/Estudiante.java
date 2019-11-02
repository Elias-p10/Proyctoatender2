package Codigo;


public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String carnet;

    public Estudiante(String nombre, String apellido, String carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    
}



