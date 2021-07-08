import java.util.Date;

public class Medico extends Hospital{
    protected String codMedico;
    protected String nombreMedico;
    protected String primerApellido;
    protected String segundopApellido;
    protected String DNI;
    protected Date fechaNacimiento;



    public  Medico(String codHospital, String nombre, int telefono,String codMedico,String nombreMedico,String primerApellido
    ,String segundopApellido,String DNI,Date fechaNacimiento){
        super(codHospital,nombre,telefono);
        this.setCodMedico(codMedico);
        this.setNombreMedico(nombreMedico);
        this.setPrimerApellido(primerApellido);
        this.setSegundopApellido(segundopApellido);
        this.setDNI(DNI);
        this.setFechaNacimiento(fechaNacimiento);
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundopApellido() {
        return segundopApellido;
    }

    public void setSegundopApellido(String segundopApellido) {
        this.segundopApellido = segundopApellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
