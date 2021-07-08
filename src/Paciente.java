import java.util.Date;

public class Paciente {
    private String codPaciente;
    private String nombrePaciente;
    private String primerApellidoPaciente;
    private String segundoapellidoPaciente;
    private String DNIPaciente;
    private Date fechaNacimiento;
    private String numeroSeguridadSocial;
    public  Paciente(String codPaciente,String nombrePaciente,String primerApellidoPaciente,String segundoapellidoPaciente
    ,String DNIPaciente,String numeroSeguridadSocial,Date fechaNacimiento){
        this.setCodPaciente(codPaciente);
        this.setNombrePaciente(nombrePaciente);
        this.setPrimerApellidoPaciente(primerApellidoPaciente);
        this.setSegundoapellidoPaciente(segundoapellidoPaciente);
        this.setDNIPaciente(DNIPaciente);
        this.setFechaNacimiento(fechaNacimiento);
        this.setNumeroSeguridadSocial(numeroSeguridadSocial);
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getPrimerApellidoPaciente() {
        return primerApellidoPaciente;
    }

    public void setPrimerApellidoPaciente(String primerApellidoPaciente) {
        this.primerApellidoPaciente = primerApellidoPaciente;
    }

    public String getSegundoapellidoPaciente() {
        return segundoapellidoPaciente;
    }

    public void setSegundoapellidoPaciente(String segundoapellidoPaciente) {
        this.segundoapellidoPaciente = segundoapellidoPaciente;
    }

    public String getDNIPaciente() {
        return DNIPaciente;
    }

    public void setDNIPaciente(String DNIPaciente) {
        this.DNIPaciente = DNIPaciente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "codPaciente='" + codPaciente + '\'' +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", primerApellidoPaciente='" + primerApellidoPaciente + '\'' +
                ", segundoapellidoPaciente='" + segundoapellidoPaciente + '\'' +
                ", DNIPaciente='" + DNIPaciente + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                '}';
    }
}
