/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

/**
 *
 * @author USER
 */
public class VerUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public VerUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icon_agregar = new javax.swing.JLabel();
        lbl_cuaAgregar = new javax.swing.JLabel();
        icon_eliminar = new javax.swing.JLabel();
        lbl_cuaEliminar = new javax.swing.JLabel();
        icon_editar = new javax.swing.JLabel();
        lbl_cuaEditar = new javax.swing.JLabel();
        icon_volver = new javax.swing.JLabel();
        lbl_cuaVolver = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_listaMostrando = new javax.swing.JList<>();
        lbl_titulo1 = new javax.swing.JLabel();
        lbl_fondo2 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconAgregar.png"))); // NOI18N
        jPanel1.add(icon_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 50, 50));

        lbl_cuaAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 50));

        icon_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconEliminar.png"))); // NOI18N
        jPanel1.add(icon_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 50, 50));

        lbl_cuaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 50));

        icon_editar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconEditar.png"))); // NOI18N
        jPanel1.add(icon_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 50, 50));

        lbl_cuaEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 50));

        icon_volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconVolver.png"))); // NOI18N
        jPanel1.add(icon_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 50, 50));

        lbl_cuaVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 50));

        list_listaMostrando.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(list_listaMostrando);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 260, 200));

        lbl_titulo1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_titulo1.setForeground(new java.awt.Color(128, 173, 216));
        lbl_titulo1.setText("USUARIOS");
        jPanel1.add(lbl_titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        lbl_fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/fondo2.png"))); // NOI18N
        jPanel1.add(lbl_fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 330));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/fondo.png"))); // NOI18N
        jPanel1.add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon_agregar;
    private javax.swing.JLabel icon_editar;
    private javax.swing.JLabel icon_eliminar;
    private javax.swing.JLabel icon_volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_cuaAgregar;
    private javax.swing.JLabel lbl_cuaEditar;
    private javax.swing.JLabel lbl_cuaEliminar;
    private javax.swing.JLabel lbl_cuaVolver;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondo2;
    private javax.swing.JLabel lbl_titulo1;
    private javax.swing.JList<String> list_listaMostrando;
    // End of variables declaration//GEN-END:variables
}
