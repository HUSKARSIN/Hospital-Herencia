public class Ciudad  extends Hospital {
    private String codCiudad;
    private String nombreCiudad;
    public  Ciudad(String codHospital, String nombre, int telefono,String codCiudad,String nombreCiudad){
        super(codHospital,nombre,telefono);
        this.setCodCiudad(codCiudad);
        this.setNombreCiudad(nombreCiudad);
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
}
