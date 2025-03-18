package autonoma.bibliotecagit.app.main;

import autonoma.bibliotecagit.app.models.Biblioteca;
import autonoma.bibliotecagit.app.views.VentanaPrincipal;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        // Crear una instancia de la biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear y mostrar la ventana principal
        java.awt.EventQueue.invokeLater(() -> {
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(null, false, null, biblioteca);
            ventanaPrincipal.setVisible(true); // Hacer visible la ventana principal
        });
    }
}