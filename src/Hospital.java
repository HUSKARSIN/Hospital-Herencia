public class Hospital {
    protected String codHospital;
    protected String nombre;
    protected int telefono;

    public Hospital(String codHospital, String nombre, int telefono) {
        this.setCodHospital(codHospital);
        this.setNombre(nombre);
        this.setTelefono(telefono);
    }

    public String getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(String codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "codHospital='" + codHospital + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
