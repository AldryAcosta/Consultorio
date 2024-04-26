/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazPrincipal;

import java.util.Date;

/**
 *
 * @author aldry
 */
public  abstract class Persona {
    
    private String nombreYapellido;
    private String documento;
    private Date   fechaNacimiento;
    private String genero;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    
    public Persona(String nombreYapellido,String documento, Date fechaNacimiento, String genero, String direccion, String telefono, String correoElectronico) {
        this.nombreYapellido = nombreYapellido;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    public String getNombreYapellido(){
        return nombreYapellido;
    }
    
    public String getDocumento(){
        return documento;
    }
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public String getGenero(){
        return genero;
    }
    public String getDirrecion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getCorreo(){
        return correoElectronico;
    }

    
    public abstract void obtenerInformacionEspecifica();

    
}


class Paciente extends Persona {
    private String afiliacion;
    

    
    public Paciente(String nombreYapellido,String documento, Date fechaNacimiento, String genero, String direccion, String telefono, String correoElectronico, String afiliacion) {
        super(nombreYapellido,documento, fechaNacimiento, genero, direccion, telefono, correoElectronico);
        this.afiliacion = afiliacion;
        
    }
    
    public String getAfiliacion(){
        return afiliacion;
    }
    
    public void obtenerInformacionEspecifica() {
        
    }
}

