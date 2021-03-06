/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;

/**
 *
 * @author Karen
 */
public class puesto_departa extends javax.swing.JFrame {

    /**
     * Creates new form puesto_departa
     */
    int contador=0;
    public puesto_departa() {
        initComponents();
        mostrarpuesto();
        mostrardepartamento();
        this.setLocationRelativeTo(null);
    }
    
     
    public void vercodigopuesto()
    {
        try {
           
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("update puesto set codigo_puesto = ?  where   = CB_buscar_puesto ");
            
            pst.setString(1, T_mostrar.getText().trim());
            pst.executeUpdate();
            
            
        } catch (Exception e) {
        }
    }
   
   public void mostrarpuesto()
    {
        try{
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/base_datos", "root", "");

            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from puesto");
            CB_buscar_puesto.addItem("Seleccione puesto");
                 while(rs.next())
                  {
                      this.CB_buscar_puesto.addItem(rs.getString("nombre_puesto"));
                  }
              }catch (Exception e){
                  System.out.println("Error "+e);
              }
    }
    
     public void mostrardepartamento()
    {
        try{
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/base_datos", "root", "");

            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from departamento");
                CB_buscar_departamento.addItem("Seleccione departamento");
                 while(rs.next())
                  {
                      this.CB_buscar_departamento.addItem(rs.getString("nombre_departamento"));
                  }
              }catch (Exception e){
                  System.out.println("Error "+e);
              }
    }
     
    public void ingresopuesto()        
    {
         try
         {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/base_datos", "root", "");
            PreparedStatement pst1 = cn.prepareStatement("insert into puesto(codigo_puesto,nombre_puesto) values(?,?)");
            
            pst1.setString(1, T_codigo_puesto.getText().trim());
            pst1.setString(2, T_nom_puesto.getText().trim());
            pst1.executeUpdate();
            
            T_nom_puesto.setText("");
            
            L_veri.setText("Registro exitoso.");
            
         }catch (Exception e){
            System.out.println("Error "+e);
         }
    }
    
    public void ingresodepartamento()
    {
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Base_Datos", "root", "");
            PreparedStatement pst2 = cn.prepareStatement("insert into departamento(codigo_departamento,nombre_departamento) values(?,?)");
           
            pst2.setString(1, T_codigo_departamento.getText().trim());
            pst2.setString(2, T_nom_departamento.getText().trim());
            pst2.executeUpdate();
            
            T_nom_departamento.setText("");
            L_veri.setText("Registro exitoso.");
        
           
           }catch (Exception e){
            System.out.println("Error "+e);
        }
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
        T_nom_puesto = new javax.swing.JTextField();
        T_nom_departamento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        L_veri = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        T_codigo_puesto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        T_codigo_departamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CB_buscar_puesto = new javax.swing.JComboBox<>();
        CB_buscar_departamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        L_mostrar = new javax.swing.JLabel();
        T_mostrar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T_nom_puesto.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jPanel1.add(T_nom_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 189, -1));

        T_nom_departamento.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jPanel1.add(T_nom_departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 188, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jButton1.setText("Agregar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        L_veri.setBackground(new java.awt.Color(204, 204, 255));
        L_veri.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        L_veri.setOpaque(true);
        jPanel1.add(L_veri, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 200, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 70, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        T_codigo_puesto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(T_codigo_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 70, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 20));

        T_codigo_departamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(T_codigo_departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 70, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel5.setText("PUESTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel6.setText("DEPARTAMENTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        CB_buscar_puesto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CB_buscar_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_buscar_puestoActionPerformed(evt);
            }
        });
        jPanel1.add(CB_buscar_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, -1));

        CB_buscar_departamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(CB_buscar_departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 160, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel7.setText("Buscar Codigo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        L_mostrar.setText("jLabel8");
        jPanel1.add(L_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 100, 30));

        T_mostrar.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jPanel1.add(T_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ingresopuesto();
        ingresodepartamento();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CB_buscar_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_buscar_puestoActionPerformed
   
        vercodigopuesto();
        
    }//GEN-LAST:event_CB_buscar_puestoActionPerformed

    
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
            java.util.logging.Logger.getLogger(puesto_departa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puesto_departa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puesto_departa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puesto_departa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puesto_departa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_buscar_departamento;
    private javax.swing.JComboBox<String> CB_buscar_puesto;
    private javax.swing.JLabel L_mostrar;
    private javax.swing.JLabel L_veri;
    private javax.swing.JTextField T_codigo_departamento;
    private javax.swing.JTextField T_codigo_puesto;
    private javax.swing.JTextField T_mostrar;
    private javax.swing.JTextField T_nom_departamento;
    private javax.swing.JTextField T_nom_puesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
