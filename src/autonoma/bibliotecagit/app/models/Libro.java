
package autonoma.bibliotecagit.app.models;

/**
 *
 * @author Juan Jacobo Cañas Henao
 * @since 20251403
 * @version 1.0.0
 */
public class Libro {
    //Atributos
    
    //Numero id del Libro
    private long id;
    
    //titulo del Libro
    private String titulo;
    
    //Metodo constructor

    public Libro(long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
    
    //Metodos get and set

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
