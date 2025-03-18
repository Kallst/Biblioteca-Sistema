
package autonoma.bibliotecagit.app.models;

/**
 *
 * @author Luisa Fernanda Henao Posada
 * @since 20251703
 * @version 1.0.0
 */
public abstract class Persona {
    
    //Atributos
    
    //Nombre de la persona
     private String nombre;
     //Numero de identificacion de la persona
     private String numeroIdentificacion;
     // Correo electronico de la persona
     private String correoElectronico;

     //Metodo constructor
    public Persona(String nombre, String numeroIdentificacion, String correoElectronico) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoElectronico = correoElectronico;
    }
 //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    
}
