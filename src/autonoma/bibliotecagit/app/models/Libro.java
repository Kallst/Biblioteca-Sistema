package autonoma.bibliotecagit.app.models;

/**
 *
 * @author Juan Jacobo Cañas Henao
 * @since 20251703
 * @version 1.0.0
 */
public class Libro {
    // Atributos
    
    private long id; // Número ID del libro
    private String titulo; // Título del libro
    private Autor autor; // Autor del libro

    // Constructor
    public Libro(long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor; // ✅ Se almacena el autor correctamente
    }

    // Métodos Get y Set

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

    public Autor getAutor() { //Método para obtener el autor
        return autor;
    }

    public void setAutor(Autor autor) { //Método para asignar un autor
        this.autor = autor;
    }
}


    