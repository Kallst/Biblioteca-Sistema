package autonoma.bibliotecagit.app.views;

import autonoma.bibliotecagit.app.models.Biblioteca;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class VentanaPrincipal extends javax.swing.JFrame {
    private Biblioteca biblioteca;

    public VentanaPrincipal(javax.swing.JFrame parent, Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        this.setLocationRelativeTo(parent); // Centrar la ventana respecto a la ventana padre

        // Cargar la imagen del ícono
        URL imageUrl = getClass().getClassLoader().getResource("autonoma/bibliotecagit/app/images/Biblioteca.png");
        if (imageUrl == null) {
            System.out.println("No se encontró la imagen. Verifica la ruta.");
        } else {
            System.out.println("Ruta de la imagen: " + imageUrl.toExternalForm());
            this.setIconImage(new ImageIcon(imageUrl).getImage());
        }
    }

    private void mouseEntered(JPanel panel) {
        panel.setBackground(new Color(220, 200, 200));
    }

    private void mouseExited(JPanel panel) {
        panel.setBackground(new Color(87, 180, 186));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarLibros = new javax.swing.JButton();
        btnActualizarLibro = new javax.swing.JButton();
        btnMostrarLibros = new javax.swing.JButton();
        btnOrdenarLibroAlfabeticamente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarLibros = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 102));
        setResizable(false);

        btnAgregarLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/bibliotecagit/app/images/AgregarLibros.png"))); // NOI18N
        btnAgregarLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarLibrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarLibrosMouseExited(evt);
            }
        });
        btnAgregarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibrosActionPerformed(evt);
            }
        });

        btnActualizarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/bibliotecagit/app/images/ActualizarLibros.png"))); // NOI18N
        btnActualizarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarLibroMouseExited(evt);
            }
        });
        btnActualizarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarLibroActionPerformed(evt);
            }
        });

        btnMostrarLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/bibliotecagit/app/images/MostrarLibros.png"))); // NOI18N
        btnMostrarLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarLibrosMouseExited(evt);
            }
        });
        btnMostrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLibrosActionPerformed(evt);
            }
        });

        btnOrdenarLibroAlfabeticamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/bibliotecagit/app/images/OrdenarLibros.png"))); // NOI18N
        btnOrdenarLibroAlfabeticamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenarLibroAlfabeticamenteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOrdenarLibroAlfabeticamenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOrdenarLibroAlfabeticamenteMouseExited(evt);
            }
        });
        btnOrdenarLibroAlfabeticamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarLibroAlfabeticamenteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel2.setText("Agregar Libros");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel3.setText(" Actualizar Libros");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel4.setText("Mostrar Libros");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel5.setText("Ordenar Libros Alfabeticamente");

        jPanel1.setBackground(new java.awt.Color(118, 68, 138));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIBLIOTECA  \"LAS INGENIERAS QUE RESUELVEN\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        btnBuscarLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/bibliotecagit/app/images/BuscarLibros.png"))); // NOI18N
        btnBuscarLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarLibrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarLibrosMouseExited(evt);
            }
        });
        btnBuscarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibrosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel6.setText("Buscar Libros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnAgregarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnMostrarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(btnOrdenarLibroAlfabeticamente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnAgregarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(btnBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnOrdenarLibroAlfabeticamente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(btnMostrarLibros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibrosActionPerformed
    AgregarLibros agregarLibros = new AgregarLibros(this, true, this, biblioteca);
    agregarLibros.setVisible(true); 
    }//GEN-LAST:event_btnAgregarLibrosActionPerformed

    private void btnActualizarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLibroActionPerformed
    
    }//GEN-LAST:event_btnActualizarLibroActionPerformed

    private void btnMostrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLibrosActionPerformed
      
    }//GEN-LAST:event_btnMostrarLibrosActionPerformed

    private void btnOrdenarLibroAlfabeticamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarLibroAlfabeticamenteActionPerformed
        
    }//GEN-LAST:event_btnOrdenarLibroAlfabeticamenteActionPerformed

    private void btnAgregarLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibrosMouseEntered
    btnAgregarLibros.setBackground(new Color(198, 128, 226));
    }//GEN-LAST:event_btnAgregarLibrosMouseEntered

    private void btnAgregarLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibrosMouseExited
     btnAgregarLibros.setBackground(new Color(253, 247, 255));
    }//GEN-LAST:event_btnAgregarLibrosMouseExited

    private void btnActualizarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseEntered
    btnActualizarLibro.setBackground(new Color(198, 128, 226));
    }//GEN-LAST:event_btnActualizarLibroMouseEntered

    private void btnActualizarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseExited
    btnActualizarLibro.setBackground(new Color(253, 247, 255));
    }//GEN-LAST:event_btnActualizarLibroMouseExited

    private void btnMostrarLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseEntered
    btnMostrarLibros.setBackground(new Color(198, 128, 226));
    }//GEN-LAST:event_btnMostrarLibrosMouseEntered

    private void btnMostrarLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseExited
    btnMostrarLibros.setBackground(new Color(253, 247, 255));
    }//GEN-LAST:event_btnMostrarLibrosMouseExited

    private void btnOrdenarLibroAlfabeticamenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenarLibroAlfabeticamenteMouseEntered
     btnOrdenarLibroAlfabeticamente.setBackground(new Color(198, 128, 226));
    }//GEN-LAST:event_btnOrdenarLibroAlfabeticamenteMouseEntered

    private void btnOrdenarLibroAlfabeticamenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenarLibroAlfabeticamenteMouseExited
    btnOrdenarLibroAlfabeticamente.setBackground(new Color(253, 247, 255));
    }//GEN-LAST:event_btnOrdenarLibroAlfabeticamenteMouseExited

    private void btnBuscarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibrosActionPerformed
    BuscarLibros buscarLibros = new BuscarLibros(this, true, this, biblioteca);
    buscarLibros.setVisible(true);
    }//GEN-LAST:event_btnBuscarLibrosActionPerformed

    private void btnBuscarLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibrosMouseEntered
    btnBuscarLibros.setBackground(new Color(198, 128, 226));
    }//GEN-LAST:event_btnBuscarLibrosMouseEntered

    private void btnBuscarLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibrosMouseExited
    btnBuscarLibros.setBackground(new Color(253, 247, 255));
    }//GEN-LAST:event_btnBuscarLibrosMouseExited

    private void btnAgregarLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibrosMouseClicked

    }//GEN-LAST:event_btnAgregarLibrosMouseClicked

    private void btnActualizarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarLibroMouseClicked
    
    }//GEN-LAST:event_btnActualizarLibroMouseClicked

    private void btnMostrarLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarLibrosMouseClicked

    }//GEN-LAST:event_btnMostrarLibrosMouseClicked

    private void btnBuscarLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibrosMouseClicked

    }//GEN-LAST:event_btnBuscarLibrosMouseClicked

    private void btnOrdenarLibroAlfabeticamenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenarLibroAlfabeticamenteMouseClicked
  
    }//GEN-LAST:event_btnOrdenarLibroAlfabeticamenteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarLibro;
    private javax.swing.JButton btnAgregarLibros;
    private javax.swing.JButton btnBuscarLibros;
    private javax.swing.JButton btnMostrarLibros;
    private javax.swing.JButton btnOrdenarLibroAlfabeticamente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}