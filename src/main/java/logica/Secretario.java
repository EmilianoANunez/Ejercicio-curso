package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Secretario extends Persona {

    //private int id_secretario;
    private String sector;
    
    @OneToOne
    private Usuario unUsuario;

    public Secretario() {
    }

    public Secretario(String sector, Usuario unUsuario, String nombre, String apellido, String telefono, Date fecha_nac) {
        super(nombre, apellido, telefono, fecha_nac);
        //this.id_secretario = id_secretario;
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

//    public int getId_secretario() {
//        return id_secretario;
//    }
//
//    public void setId_secretario(int id_secretario) {
//        this.id_secretario = id_secretario;
//    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    
}