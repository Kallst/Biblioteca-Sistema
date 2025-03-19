package autonoma.bibliotecagit.app.views;
import autonoma.bibliotecagit.app.models.Biblioteca;
import autonoma.bibliotecagit.app.models.Libro;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Luisa Fernanda Henao Posada
 * @since 20250318
 * @version 1.0.0
 */
public class BuscarLibros extends javax.swing.JDialog {
    private Biblioteca biblioteca;
    private VentanaPrincipal ventanaPrincipal;

    public BuscarLibros(java.awt.Frame parent, boolean modal, VentanaPrincipal ventanaPrincipal, Biblioteca biblioteca) {
        super(parent, modal); // Llamada al constructor de JDialog
        this.biblioteca = biblioteca;
        this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        this.setLocationRelativeTo(parent); // Centrar la ventana respecto a la principal
        // Cargar la imagen del ícono
        URL imageUrl = getClass().getClassLoader().getResource("autonoma/bibliotecagit/app/images/Biblioteca.png");
        
        if (imageUrl == null) {
            System.out.println("No se encontró la imagen. Verifica la ruta.");
        } else {
            System.out.println("Ruta de la imagen: " + imageUrl.toExternalForm());
            this.setIconImage(new ImageIcon(imageUrl).getImage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnBuscarLibro = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(118, 68, 138));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Libros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel2.setText("Ingrese el id del libro a buscar ");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnBuscarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/bibliotecagit/app/images/BuscarLibros.png"))); // NOI18N
        btnBuscarLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    String idStr = jTextField1.getText().trim();

        // Validar que el campo no esté vacío
        if (idStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo ID no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            // Convertir el ID a entero
            int id = Integer.parseInt(idStr);
            // Buscar el libro en la biblioteca
            Libro libro = biblioteca.buscarLibroPorId(id);
            if (libro != null) {
                // Mostrar los detalles del libro encontrado
                String mensaje = "Libro encontrado:\n"
                        + "ID: " + libro.getId() + "\n"
                        + "Título: " + libro.getTitulo();
                JOptionPane.showMessageDialog(this, mensaje, "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un libro con el ID " + id, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed
    jTextField1ActionPerformed(evt);
    }//GEN-LAST:event_btnBuscarLibroActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
                                          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLibro;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
