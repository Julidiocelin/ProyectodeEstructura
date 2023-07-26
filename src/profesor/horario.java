package profesor;

public class horario {
    protected String codigoMat;
    protected int numParalelo;
    protected String day;
    protected String horaInicio;
    protected String horaFin;
    
    public void horario(){
        
    }

    public String getCodigoMat() {
        return codigoMat;
    }

    public void setCodigoMat(String codigoMat) {
        this.codigoMat = codigoMat;
    }

    public int getNumParalelo() {
        return numParalelo;
    }

    public void setNumParalelo(int numParalelo) {
        this.numParalelo = numParalelo;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
}
