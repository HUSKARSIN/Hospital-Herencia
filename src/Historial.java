import java.util.Date;

public class Historial extends Paciente{
    protected String codHistorial;


    public Historial(String codPaciente, String nombrePaciente, String primerApellidoPaciente, String segundoapellidoPaciente,
                     String DNIPaciente, String numeroSeguridadSocial, Date fechaNacimiento) {
        super(codPaciente, nombrePaciente, primerApellidoPaciente, segundoapellidoPaciente, DNIPaciente,
                numeroSeguridadSocial, fechaNacimiento);
        this.setCodHistorial(getCodHistorial());
    }

    public String getCodHistorial() {
        return codHistorial;
    }

    public void setCodHistorial(String codHistorial) {
        this.codHistorial = codHistorial;
    }
}
