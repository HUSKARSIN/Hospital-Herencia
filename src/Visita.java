import java.util.Date;

public class Visita extends Hospital{
    protected String codVisita;
    protected Date fechaHora;
    protected String tratamiento;
    protected String diagnostico;
    protected Date fechaSalida;

    public Visita(String codHospital, String nombre, int telefono,String codVisita,Date fechaSalida,Date fechaHora
    ,String tratamiento ,String diagnostico) {
        super(codHospital, nombre, telefono);
        this.setCodVisita(codVisita);
        this.setFechaHora(fechaHora);
        this.setTratamiento(tratamiento);
        this.setDiagnostico(diagnostico);
        this.setFechaSalida(fechaSalida);

    }

    public String getCodVisita() {
        return codVisita;
    }

    public void setCodVisita(String codVisita) {
        this.codVisita = codVisita;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
