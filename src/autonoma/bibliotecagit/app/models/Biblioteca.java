
package autonoma.bibliotecagit.app.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Luisa Fernanda Henao Posada
 * @since 20251703
 * @version 1.0.0
 */

public class Biblioteca {
    // Se crea la lista para almacenar los libros
    private ArrayList<Libro> libros;

    // Método constructor de el Array
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para mostrar los libros
    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "La biblioteca no tiene libros";
        }
        String resultados = "Libros en la biblioteca\n";
        for (Libro libro : libros) {
            resultados += "ID: " + libro.getId() + ", Titulo: " + libro.getTitulo() + "\n";
        }
        return resultados;
    }

    // Método para agregar libro
    public boolean agregarLibro(Libro libro) {
        if (libro == null) {
            return false;
        }
        return libros.add(libro);
    }

    // Método para buscar un libro por ID
    public Libro buscarLibroPorId(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null; // Si no se encuentra el libro, retorna null
    }

    // Método para actualizar un libro
    public boolean actualizarLibro(int id, String nuevoTitulo) {
        Libro libro = buscarLibroPorId(id);
        if (libro != null) {
            libro.setTitulo(nuevoTitulo);
            return true;
        }
        return false; // Si no se encuentra el libro, retorna false
    }

    // Método para eliminar un libro por ID
    public boolean eliminarLibro(int id) {
        Libro libro = buscarLibroPorId(id);
        if (libro != null) {
            return libros.remove(libro);
        }
        return false; // Si no se encuentra el libro, retorna false
    }

    // Método para obtener los libros ordenados alfabéticamente por título
    public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
        Collections.sort(librosOrdenados, (Libro libro1, Libro libro2) -> libro1.getTitulo().compareToIgnoreCase(libro2.getTitulo()));
        return librosOrdenados;
    }

    public List<Libro> getLibros() {
        return libros; // Retorna la lista de libros almacenados
    }
}