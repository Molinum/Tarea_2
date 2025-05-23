import java.time.Instant;
import java.util.List;

public class Retraso extends Asistencia{
    private Instant hora;

    public Retraso(Empleado empleado, Instant hora) {
        super(empleado);
        this.hora = hora;
    }
}
