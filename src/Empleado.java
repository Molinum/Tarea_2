public class Empleado implements Invitable{

    private String id;
    private String appellidos;
    private String nombre;
    private String correo;

    public Empleado(String id, String appellidos, String nombre, String correo) {
        this.id = id;
        this.appellidos = appellidos;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void invitar() {                     //TBD

    }
}
