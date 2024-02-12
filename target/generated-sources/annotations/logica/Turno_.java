package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Odontologo;
import logica.Paciente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-11T23:28:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, String> afeccion;
    public static volatile SingularAttribute<Turno, String> hora_turno;
    public static volatile SingularAttribute<Turno, Paciente> unPaciente;
    public static volatile SingularAttribute<Turno, Odontologo> unOdontologo;
    public static volatile SingularAttribute<Turno, Date> fecha_turno;
    public static volatile SingularAttribute<Turno, Integer> id_turno;

}