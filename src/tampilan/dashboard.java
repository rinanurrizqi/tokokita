/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

/**
 *
 * @author UsEr
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
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

        jLabel1 = new javax.swing.JLabel();
        tUsername = new javax.swing.JLabel();
        tNama = new javax.swing.JLabel();
        tEmail = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        mUser = new javax.swing.JMenu();
        mCategory = new javax.swing.JMenu();
        mProduct = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SELAMAT DATANG");

        tUsername.setText("jLabel2");

        tNama.setText("jLabel3");

        tEmail.setText("jLabel4");

        mFile.setText("File");
        jMenuBar1.add(mFile);

        mUser.setText("User");
        mUser.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mUserMenuSelected(evt);
            }
        });
        jMenuBar1.add(mUser);

        mCategory.setText("Category");
        mCategory.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mCategoryMenuSelected(evt);
            }
        });
        jMenuBar1.add(mCategory);

        mProduct.setText("Product");
        mProduct.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mProductMenuSelected(evt);
            }
        });
        jMenuBar1.add(mProduct);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNama)
                            .addComponent(tUsername)
                            .addComponent(tEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tUsername)
                .addGap(18, 18, 18)
                .addComponent(tNama)
                .addGap(18, 18, 18)
                .addComponent(tEmail)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mUserMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mUserMenuSelected
        new frameUser().setVisible(true);
    }//GEN-LAST:event_mUserMenuSelected

    private void mCategoryMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mCategoryMenuSelected
        new frameCategory().setVisible(true);
    }//GEN-LAST:event_mCategoryMenuSelected

    private void mProductMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mProductMenuSelected
        // TODO add your handling code here:
        new frameProduct().setVisible(true);
    }//GEN-LAST:event_mProductMenuSelected

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mCategory;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenu mProduct;
    private javax.swing.JMenu mUser;
    private javax.swing.JLabel tEmail;
    private javax.swing.JLabel tNama;
    private javax.swing.JLabel tUsername;
    // End of variables declaration//GEN-END:variables
}
