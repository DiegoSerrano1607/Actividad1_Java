/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego Serrano
 */
public class Empleado extends Persona{
    private String cod_empleado, puesto;
    
    public Empleado(){};
    public Empleado(String cod_empleado, String puesto, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.cod_empleado = cod_empleado;
        this.puesto = puesto;
    }

    public String getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(String cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public void agregar(){
    System.out.println("Codigo empleado: "+ getCod_empleado() );
    System.out.println("Puesto: "+ getPuesto() );
    System.out.println("Nombres: "+ getNombres() );
    System.out.println("Apellidos: "+ getApellidos() );
    System.out.println("Direccion: "+getDireccion() );
    System.out.println("Telefono: "+getTelefono() );
    System.out.println("Fecha Nacimiento: "+ getFecha_nacimiento() );
}
}