import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public abstract class Reunion {
    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Instant horaInicio;
    private Instant horaFin;
    private List<Asistencia> asistencias;

    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista) {
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
    }
    public List obtenerAsistencias(){                      //TBD
        return asistencias;
    }
    public List obtenerAusencias(){                        //TBD
    }

    public List obtenerRetrasos(){                        //TBD
    }

    public List obtenerTotalAsistencia() {                 //TBD
    }

    public List obtenerPorcentajeAsistencia() {            //TBD
    }

    public float calcularTiempoReal() {                    //TBD
    }

    public void iniciar() {                                //TBD
    }

    public void finalizar() {                             //TBD
    }
}
