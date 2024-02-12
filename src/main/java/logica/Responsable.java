package logica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable  extends Persona {
    
    //private int id_responsable;
    private String tipoResp;

    public Responsable() {
    }

    public Responsable( String tipoResp, String nombre, String apellido, String telefono, Date fecha_nac) {
        super(nombre, apellido, telefono, fecha_nac);
        //this.id_responsable = id_responsable;
        this.tipoResp = tipoResp;
    }

//    public int getId_responsable() {
//        return id_responsable;
//    }
//
//    public void setId_responsable(int id_responsable) {
//        this.id_responsable = id_responsable;
//    }

    public String getTipoResp() {
        return tipoResp;
    }

    public void setTipoResp(String tipoResp) {
        this.tipoResp = tipoResp;
    }
}
