public class Servicio  extends Hospital{
     protected String idServicio;
     protected int numeroCama;
     protected String comentario;
    public Servicio(String codHospital, String nombre, int telefono,String idServicio,String comentario,int numeroCama){
        super(codHospital,nombre,telefono);
        this.setIdServicio(idServicio);
        this.setComentario(comentario);
        this.setNumeroCama(numeroCama);

    }


    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public int getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(int numeroCama) {
        this.numeroCama = numeroCama;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

