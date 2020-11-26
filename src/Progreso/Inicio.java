/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progreso;



/**
 *
 * @author Sergio
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setSize(400,550);//tamaño de la interfaz
        setResizable(false);//evita que el usuruario modifica las dimenciones de la interfaz
        setTitle("Acceso al sistema");//nombre de la interfaz
        setLocationRelativeTo(null);//Sentrar la interfaz
        
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
        logingUserName = new javax.swing.JTextField();
        logingPasword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Progreso/logo1.2.PNG"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 70));

        logingUserName.setBackground(new java.awt.Color(102, 0, 102));
        logingUserName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        logingUserName.setForeground(new java.awt.Color(255, 255, 255));
        logingUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        logingUserName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logingUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logingUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(logingUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 330, 210, -1));

        logingPasword.setBackground(new java.awt.Color(102, 0, 102));
        logingPasword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        logingPasword.setForeground(new java.awt.Color(255, 255, 255));
        logingPasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        logingPasword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(logingPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 370, 210, -1));

        jButton1.setText("Loging");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Progreso/fondo3.0.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logingUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logingUserNameActionPerformed


    }//GEN-LAST:event_logingUserNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String userName = logingUserName.getText().trim(); //capturando los datos escritos en el textbox
        String userPasword = logingPasword.getText().trim(); 
        if (userName.equals("Admin")&&userPasword.equals("Admin"))
        {
            new RegistroE().setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField logingPasword;
    private javax.swing.JTextField logingUserName;
    // End of variables declaration//GEN-END:variables
}
