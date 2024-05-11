
package InterfazPrincipal.Clases;

import java.util.Date;


public class CitasMedicas {
    private static int contadorCitas = 0;
    private int numeroCita;
    private String documentoPaciente;
    private String nombreyApellidoPaciente;
    private Date fechaNacimientoPaciente;
    private String afiliadoPaciente;
    private String nombreMedico;
    private String tipoEspecialidad;
    private Date fechaCita;
    private String horaCita;
    private String ConsultorioCita;
    private String EstadoCitas;
    private int coPago;
    

    public CitasMedicas(String documentoPaciente, String nombreyApellidoPaciente, Date fechaNacimientoPaciente, String afiliadoPaciente, String nombreMedico, String tipoEspecialidad, Date fechaCita, String horaCita, String ConsultorioCita, String EstadoCitas, int coPago, int numeroCita) {
        this.numeroCita = ++contadorCitas;;
        this.documentoPaciente = documentoPaciente;
        this.nombreyApellidoPaciente = nombreyApellidoPaciente;
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
        this.afiliadoPaciente = afiliadoPaciente;
        this.nombreMedico = nombreMedico;
        this.tipoEspecialidad = tipoEspecialidad;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.ConsultorioCita = ConsultorioCita;
        this.EstadoCitas = EstadoCitas;
        this.coPago = coPago;
    }
    
    public int getNumeroCita() {
        return numeroCita;
    }

    public String getEstadoCitas() {
        return EstadoCitas;
    }
    
    public void setEstadoCitas(String estadoCitas) {
        this.EstadoCitas = estadoCitas;
    }

    public int getCoPago() {
        return coPago;
    }

    public String getDocumentoPaciente() {
        return documentoPaciente;
    }

    public String getNombreyApellidoPaciente() {
        return nombreyApellidoPaciente;
    }

    public Date getFechaNacimientoPaciente() {
        return fechaNacimientoPaciente;
    }

    public String getAfiliadoPaciente() {
        return afiliadoPaciente;
    }
    public String getNombreMedico(){
        return nombreMedico;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public String getConsultorioCita() {
        return ConsultorioCita;
    }
    
    
}
