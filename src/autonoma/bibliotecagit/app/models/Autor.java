
package autonoma.bibliotecagit.app.models;

/**
 *
 * @author Sofia Bermudez
 * @since 20251003
 * @version 1.0.0
 */

public class Autor extends Persona{
    
    //Nombre de la editorial
    private String editorial;
    
    //Profesion del autor
    private String profesion;

    //Metodo Constructor
    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correoElectronico) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }

    // Getters y Setters
    public String getEditorial() {
        return editorial;
    }
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}