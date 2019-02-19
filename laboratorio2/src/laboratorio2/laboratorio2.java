/*
 Karen Roxana Roldán Hernandez 0901-17-63
 */
package laboratorio2;

import javax.swing.JOptionPane;

public class laboratorio2 extends javax.swing.JFrame {

int[][] numeroale= new int[10][10]; //matris que contiene los datos de los 10 empleados
int[] departa = new int[5];
int[] ISR = new int[10];
String opcion, opcion1, opcion2,opcion3,opcion4,opcion5; //variables que permiten comparar si se calcula bonificacion,comision,igss, descuento judicial etc.
int opc,opc1,opc2,opc3,opc4,opc5;
   
    public laboratorio2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ltitulo = new javax.swing.JLabel();
        Tnombre1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Lsuelbase1 = new javax.swing.JLabel();
        Lboni1 = new javax.swing.JLabel();
        Lcomi1 = new javax.swing.JLabel();
        Ligss1 = new javax.swing.JLabel();
        Ldescjudi1 = new javax.swing.JLabel();
        Lisrtotal1 = new javax.swing.JLabel();
        Ldepar1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Lsueliqui1 = new javax.swing.JLabel();
        Ltotal1 = new javax.swing.JLabel();
        Ltotal2 = new javax.swing.JLabel();
        Ltotal3 = new javax.swing.JLabel();
        Ltotal4 = new javax.swing.JLabel();
        Ltotal5 = new javax.swing.JLabel();
        Tnombre2 = new javax.swing.JTextField();
        Tnombre3 = new javax.swing.JTextField();
        Tnombre4 = new javax.swing.JTextField();
        Tnombre5 = new javax.swing.JTextField();
        Tnombre6 = new javax.swing.JTextField();
        Tnombre7 = new javax.swing.JTextField();
        Tnombre8 = new javax.swing.JTextField();
        Tnombre9 = new javax.swing.JTextField();
        Tnombre10 = new javax.swing.JTextField();
        Lsuelbase2 = new javax.swing.JLabel();
        Lsuelbase3 = new javax.swing.JLabel();
        Lsuelbase4 = new javax.swing.JLabel();
        Lsuelbase5 = new javax.swing.JLabel();
        Lsuelbase6 = new javax.swing.JLabel();
        Lsuelbase7 = new javax.swing.JLabel();
        Lsuelbase8 = new javax.swing.JLabel();
        Lsuelbase9 = new javax.swing.JLabel();
        Lsuelbase10 = new javax.swing.JLabel();
        Lboni2 = new javax.swing.JLabel();
        Lboni3 = new javax.swing.JLabel();
        Lboni4 = new javax.swing.JLabel();
        Lboni5 = new javax.swing.JLabel();
        Lboni6 = new javax.swing.JLabel();
        Lboni7 = new javax.swing.JLabel();
        Lboni8 = new javax.swing.JLabel();
        Lboni9 = new javax.swing.JLabel();
        Lboni10 = new javax.swing.JLabel();
        Lcomi2 = new javax.swing.JLabel();
        Lcomi3 = new javax.swing.JLabel();
        Lcomi4 = new javax.swing.JLabel();
        Lcomi5 = new javax.swing.JLabel();
        Lcomi6 = new javax.swing.JLabel();
        Lcomi7 = new javax.swing.JLabel();
        Lcomi8 = new javax.swing.JLabel();
        Lcomi9 = new javax.swing.JLabel();
        Lcomi10 = new javax.swing.JLabel();
        Ligss2 = new javax.swing.JLabel();
        Ligss3 = new javax.swing.JLabel();
        Ligss4 = new javax.swing.JLabel();
        Ligss5 = new javax.swing.JLabel();
        Ligss6 = new javax.swing.JLabel();
        Ligss7 = new javax.swing.JLabel();
        Ligss8 = new javax.swing.JLabel();
        Ligss9 = new javax.swing.JLabel();
        Ligss10 = new javax.swing.JLabel();
        Ldescjudi2 = new javax.swing.JLabel();
        Ldescjudi3 = new javax.swing.JLabel();
        Ldescjudi4 = new javax.swing.JLabel();
        Ldescjudi5 = new javax.swing.JLabel();
        Ldescjudi6 = new javax.swing.JLabel();
        Ldescjudi7 = new javax.swing.JLabel();
        Ldescjudi8 = new javax.swing.JLabel();
        Ldescjudi9 = new javax.swing.JLabel();
        Ldescjudi10 = new javax.swing.JLabel();
        Lisrtotal2 = new javax.swing.JLabel();
        Lisrtotal3 = new javax.swing.JLabel();
        Lisrtotal4 = new javax.swing.JLabel();
        Lisrtotal5 = new javax.swing.JLabel();
        Lisrtotal6 = new javax.swing.JLabel();
        Lisrtotal7 = new javax.swing.JLabel();
        Lisrtotal8 = new javax.swing.JLabel();
        Lisrtotal9 = new javax.swing.JLabel();
        Lisrtotal10 = new javax.swing.JLabel();
        Lsueliqui2 = new javax.swing.JLabel();
        Lsueliqui3 = new javax.swing.JLabel();
        Lsueliqui4 = new javax.swing.JLabel();
        Lsueliqui5 = new javax.swing.JLabel();
        Lsueliqui6 = new javax.swing.JLabel();
        Lsueliqui7 = new javax.swing.JLabel();
        Lsueliqui8 = new javax.swing.JLabel();
        Lsueliqui9 = new javax.swing.JLabel();
        Lsueliqui10 = new javax.swing.JLabel();
        Ldepar2 = new javax.swing.JLabel();
        Ldepar3 = new javax.swing.JLabel();
        Ldepar4 = new javax.swing.JLabel();
        Ldepar5 = new javax.swing.JLabel();
        Ldepar6 = new javax.swing.JLabel();
        Ldepar7 = new javax.swing.JLabel();
        Ldepar8 = new javax.swing.JLabel();
        Ldepar9 = new javax.swing.JLabel();
        Ldepar10 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ltitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Ltitulo.setText("PLANILLA");
        jPanel1.add(Ltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 127, 48));

        Tnombre1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre1ActionPerformed(evt);
            }
        });
        Tnombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre1KeyReleased(evt);
            }
        });
        jPanel1.add(Tnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 108, 130, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 77, 93, 20));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel2.setText("Sueldo Base");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel3.setText("Bonificaciones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel4.setText("Comisiones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 92, 20));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel5.setText("IGSS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 40, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel6.setText("Descuento Judicial");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 80, -1, 23));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel7.setText("ISR Total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 80, -1, 22));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel8.setText("Sueldo Liquido");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 76, -1, 23));

        Lsuelbase1.setBackground(new java.awt.Color(204, 204, 255));
        Lsuelbase1.setOpaque(true);
        jPanel1.add(Lsuelbase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 104, 100, 27));

        Lboni1.setBackground(new java.awt.Color(204, 204, 255));
        Lboni1.setOpaque(true);
        jPanel1.add(Lboni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 104, 92, 27));

        Lcomi1.setBackground(new java.awt.Color(204, 204, 255));
        Lcomi1.setOpaque(true);
        jPanel1.add(Lcomi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 104, 90, 27));

        Ligss1.setBackground(new java.awt.Color(204, 204, 255));
        Ligss1.setOpaque(true);
        jPanel1.add(Ligss1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 104, 90, 27));

        Ldescjudi1.setBackground(new java.awt.Color(204, 204, 255));
        Ldescjudi1.setOpaque(true);
        jPanel1.add(Ldescjudi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 104, 124, 27));

        Lisrtotal1.setBackground(new java.awt.Color(204, 204, 255));
        Lisrtotal1.setOpaque(true);
        jPanel1.add(Lisrtotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 104, 100, 27));

        Ldepar1.setBackground(new java.awt.Color(204, 204, 255));
        Ldepar1.setOpaque(true);
        jPanel1.add(Ldepar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 104, 87, 27));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel9.setText("Departamento");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 76, 107, 23));

        Lsueliqui1.setBackground(new java.awt.Color(204, 204, 255));
        Lsueliqui1.setOpaque(true);
        jPanel1.add(Lsueliqui1, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 104, 93, 27));

        Ltotal1.setBackground(new java.awt.Color(204, 204, 255));
        Ltotal1.setOpaque(true);
        jPanel1.add(Ltotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 77, 23));

        Ltotal2.setBackground(new java.awt.Color(204, 204, 255));
        Ltotal2.setOpaque(true);
        jPanel1.add(Ltotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 76, 23));

        Ltotal3.setBackground(new java.awt.Color(204, 204, 255));
        Ltotal3.setOpaque(true);
        jPanel1.add(Ltotal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 68, 23));

        Ltotal4.setBackground(new java.awt.Color(204, 204, 255));
        Ltotal4.setOpaque(true);
        jPanel1.add(Ltotal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 72, 22));

        Ltotal5.setBackground(new java.awt.Color(204, 204, 255));
        Ltotal5.setOpaque(true);
        jPanel1.add(Ltotal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 73, 22));

        Tnombre2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre2ActionPerformed(evt);
            }
        });
        jPanel1.add(Tnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 144, 130, -1));

        Tnombre3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre3ActionPerformed(evt);
            }
        });
        jPanel1.add(Tnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 176, 130, 33));

        Tnombre4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre4ActionPerformed(evt);
            }
        });
        jPanel1.add(Tnombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 215, 130, -1));

        Tnombre5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre5ActionPerformed(evt);
            }
        });
        jPanel1.add(Tnombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 246, 130, -1));

        Tnombre6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre6ActionPerformed(evt);
            }
        });
        jPanel1.add(Tnombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 278, 130, -1));

        Tnombre7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre7ActionPerformed(evt);
            }
        });
        jPanel1.add(Tnombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 309, 130, -1));

        Tnombre8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre8ActionPerformed(evt);
            }
        });
        jPanel1.add(Tnombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 339, 130, -1));

        Tnombre9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre9ActionPerformed(evt);
            }
        });
        jPanel1.add(Tnombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 370, 130, -1));

        Tnombre10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre10ActionPerformed(evt);
            }
        });
        jPanel1.add(Tnombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 400, 130, 24));

        Lsuelbase2.setBackground(new java.awt.Color(204, 204, 255));
        Lsuelbase2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lsuelbase2.setOpaque(true);
        jPanel1.add(Lsuelbase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 144, 100, 25));

        Lsuelbase3.setBackground(new java.awt.Color(204, 204, 255));
        Lsuelbase3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lsuelbase3.setOpaque(true);
        jPanel1.add(Lsuelbase3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 176, 100, 33));

        Lsuelbase4.setBackground(new java.awt.Color(204, 204, 255));
        Lsuelbase4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lsuelbase4.setOpaque(true);
        jPanel1.add(Lsuelbase4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 215, 100, 25));

        Lsuelbase5.setBackground(new java.awt.Color(204, 204, 255));
        Lsuelbase5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lsuelbase5.setOpaque(true);
        jPanel1.add(Lsuelbase5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 246, 100, 25));

        Lsuelbase6.setBackground(new java.awt.Color(204, 204, 255));
        Lsuelbase6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lsuelbase6.setOpaque(true);
        jPanel1.add(Lsuelbase6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 278, 100, 25));

        Lsuelbase7.setBackground(new java.awt.Color(204, 204, 255));
        Lsuelbase7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lsuelbase7.setOpaque(true);
        jPanel1.add(Lsuelbase7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 309, 100, 25));

        Lsuelbase8.setBackground(new java.awt.Color(204, 204, 255));
        Lsuelbase8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lsuelbase8.setOpaque(true);
        jPanel1.add(Lsuelbase8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 339, 100, 25));

        Lsuelbase9.setBackground(new java.awt.Color(204, 204, 255));
        Lsuelbase9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lsuelbase9.setOpaque(true);
        jPanel1.add(Lsuelbase9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 100, 25));

        Lsuelbase10.setBackground(new java.awt.Color(204, 204, 255));
        Lsuelbase10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lsuelbase10.setOpaque(true);
        jPanel1.add(Lsuelbase10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 100, 24));

        Lboni2.setBackground(new java.awt.Color(204, 204, 255));
        Lboni2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lboni2.setOpaque(true);
        jPanel1.add(Lboni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 144, 92, 25));

        Lboni3.setBackground(new java.awt.Color(204, 204, 255));
        Lboni3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lboni3.setOpaque(true);
        jPanel1.add(Lboni3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 176, 92, 33));

        Lboni4.setBackground(new java.awt.Color(204, 204, 255));
        Lboni4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lboni4.setOpaque(true);
        jPanel1.add(Lboni4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 215, 92, 25));

        Lboni5.setBackground(new java.awt.Color(204, 204, 255));
        Lboni5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lboni5.setOpaque(true);
        jPanel1.add(Lboni5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 246, 92, 25));

        Lboni6.setBackground(new java.awt.Color(204, 204, 255));
        Lboni6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lboni6.setOpaque(true);
        jPanel1.add(Lboni6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 278, 92, 25));

        Lboni7.setBackground(new java.awt.Color(204, 204, 255));
        Lboni7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lboni7.setOpaque(true);
        jPanel1.add(Lboni7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 309, 92, 25));

        Lboni8.setBackground(new java.awt.Color(204, 204, 255));
        Lboni8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lboni8.setOpaque(true);
        jPanel1.add(Lboni8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 339, 92, 25));

        Lboni9.setBackground(new java.awt.Color(204, 204, 255));
        Lboni9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lboni9.setOpaque(true);
        jPanel1.add(Lboni9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 92, 25));

        Lboni10.setBackground(new java.awt.Color(204, 204, 255));
        Lboni10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lboni10.setOpaque(true);
        jPanel1.add(Lboni10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 92, 24));

        Lcomi2.setBackground(new java.awt.Color(204, 204, 255));
        Lcomi2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lcomi2.setOpaque(true);
        jPanel1.add(Lcomi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 144, 90, 25));

        Lcomi3.setBackground(new java.awt.Color(204, 204, 255));
        Lcomi3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lcomi3.setOpaque(true);
        jPanel1.add(Lcomi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 176, 90, 33));

        Lcomi4.setBackground(new java.awt.Color(204, 204, 255));
        Lcomi4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lcomi4.setOpaque(true);
        jPanel1.add(Lcomi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 215, 90, 26));

        Lcomi5.setBackground(new java.awt.Color(204, 204, 255));
        Lcomi5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lcomi5.setOpaque(true);
        jPanel1.add(Lcomi5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 246, 90, 25));

        Lcomi6.setBackground(new java.awt.Color(204, 204, 255));
        Lcomi6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lcomi6.setOpaque(true);
        jPanel1.add(Lcomi6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 278, 90, 24));

        Lcomi7.setBackground(new java.awt.Color(204, 204, 255));
        Lcomi7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lcomi7.setOpaque(true);
        jPanel1.add(Lcomi7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 309, 90, 25));

        Lcomi8.setBackground(new java.awt.Color(204, 204, 255));
        Lcomi8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lcomi8.setOpaque(true);
        jPanel1.add(Lcomi8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 339, 90, 25));

        Lcomi9.setBackground(new java.awt.Color(204, 204, 255));
        Lcomi9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lcomi9.setOpaque(true);
        jPanel1.add(Lcomi9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 90, 25));

        Lcomi10.setBackground(new java.awt.Color(204, 204, 255));
        Lcomi10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Lcomi10.setOpaque(true);
        jPanel1.add(Lcomi10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 90, 24));

        Ligss2.setBackground(new java.awt.Color(204, 204, 255));
        Ligss2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ligss2.setOpaque(true);
        jPanel1.add(Ligss2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 144, 90, 25));

        Ligss3.setBackground(new java.awt.Color(204, 204, 255));
        Ligss3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ligss3.setOpaque(true);
        jPanel1.add(Ligss3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 176, 90, 33));

        Ligss4.setBackground(new java.awt.Color(204, 204, 255));
        Ligss4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ligss4.setOpaque(true);
        jPanel1.add(Ligss4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 215, 90, 26));

        Ligss5.setBackground(new java.awt.Color(204, 204, 255));
        Ligss5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ligss5.setOpaque(true);
        jPanel1.add(Ligss5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 246, 90, 25));

        Ligss6.setBackground(new java.awt.Color(204, 204, 255));
        Ligss6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ligss6.setOpaque(true);
        jPanel1.add(Ligss6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 278, 90, 24));

        Ligss7.setBackground(new java.awt.Color(204, 204, 255));
        Ligss7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ligss7.setOpaque(true);
        jPanel1.add(Ligss7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 309, 90, 25));

        Ligss8.setBackground(new java.awt.Color(204, 204, 255));
        Ligss8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ligss8.setOpaque(true);
        jPanel1.add(Ligss8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 339, 90, 25));

        Ligss9.setBackground(new java.awt.Color(204, 204, 255));
        Ligss9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ligss9.setOpaque(true);
        jPanel1.add(Ligss9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 90, 25));

        Ligss10.setBackground(new java.awt.Color(204, 204, 255));
        Ligss10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ligss10.setOpaque(true);
        jPanel1.add(Ligss10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 90, 24));

        Ldescjudi2.setBackground(new java.awt.Color(204, 204, 255));
        Ldescjudi2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi2.setToolTipText("");
        Ldescjudi2.setOpaque(true);
        jPanel1.add(Ldescjudi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 144, 124, 25));

        Ldescjudi3.setBackground(new java.awt.Color(204, 204, 255));
        Ldescjudi3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi3.setToolTipText("");
        Ldescjudi3.setOpaque(true);
        jPanel1.add(Ldescjudi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 184, 124, 25));

        Ldescjudi4.setBackground(new java.awt.Color(204, 204, 255));
        Ldescjudi4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi4.setToolTipText("");
        Ldescjudi4.setOpaque(true);
        jPanel1.add(Ldescjudi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 215, 124, 26));

        Ldescjudi5.setBackground(new java.awt.Color(204, 204, 255));
        Ldescjudi5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi5.setToolTipText("");
        Ldescjudi5.setOpaque(true);
        jPanel1.add(Ldescjudi5, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 246, 124, 25));

        Ldescjudi6.setBackground(new java.awt.Color(204, 204, 255));
        Ldescjudi6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi6.setToolTipText("");
        Ldescjudi6.setOpaque(true);
        jPanel1.add(Ldescjudi6, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 278, 124, 24));

        Ldescjudi7.setBackground(new java.awt.Color(204, 204, 255));
        Ldescjudi7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi7.setToolTipText("");
        Ldescjudi7.setOpaque(true);
        jPanel1.add(Ldescjudi7, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 309, 124, 25));

        Ldescjudi8.setBackground(new java.awt.Color(204, 204, 255));
        Ldescjudi8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi8.setToolTipText("");
        Ldescjudi8.setOpaque(true);
        jPanel1.add(Ldescjudi8, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 339, 124, 25));

        Ldescjudi9.setBackground(new java.awt.Color(204, 204, 255));
        Ldescjudi9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi9.setToolTipText("");
        Ldescjudi9.setOpaque(true);
        jPanel1.add(Ldescjudi9, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 370, 124, 25));

        Ldescjudi10.setBackground(new java.awt.Color(204, 204, 255));
        Ldescjudi10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi10.setToolTipText("");
        Ldescjudi10.setOpaque(true);
        jPanel1.add(Ldescjudi10, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 400, 124, 24));

        Lisrtotal2.setBackground(new java.awt.Color(204, 204, 255));
        Lisrtotal2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal2.setToolTipText("");
        Lisrtotal2.setOpaque(true);
        jPanel1.add(Lisrtotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 144, 100, 25));

        Lisrtotal3.setBackground(new java.awt.Color(204, 204, 255));
        Lisrtotal3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal3.setToolTipText("");
        Lisrtotal3.setOpaque(true);
        jPanel1.add(Lisrtotal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 176, 100, 33));

        Lisrtotal4.setBackground(new java.awt.Color(204, 204, 255));
        Lisrtotal4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal4.setToolTipText("");
        Lisrtotal4.setOpaque(true);
        jPanel1.add(Lisrtotal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 215, 100, 26));

        Lisrtotal5.setBackground(new java.awt.Color(204, 204, 255));
        Lisrtotal5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal5.setToolTipText("");
        Lisrtotal5.setOpaque(true);
        jPanel1.add(Lisrtotal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 246, 100, 25));

        Lisrtotal6.setBackground(new java.awt.Color(204, 204, 255));
        Lisrtotal6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal6.setToolTipText("");
        Lisrtotal6.setOpaque(true);
        jPanel1.add(Lisrtotal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 278, 100, 24));

        Lisrtotal7.setBackground(new java.awt.Color(204, 204, 255));
        Lisrtotal7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal7.setToolTipText("");
        Lisrtotal7.setOpaque(true);
        jPanel1.add(Lisrtotal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 309, 100, 25));

        Lisrtotal8.setBackground(new java.awt.Color(204, 204, 255));
        Lisrtotal8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal8.setToolTipText("");
        Lisrtotal8.setOpaque(true);
        jPanel1.add(Lisrtotal8, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 339, 100, 25));

        Lisrtotal9.setBackground(new java.awt.Color(204, 204, 255));
        Lisrtotal9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal9.setToolTipText("");
        Lisrtotal9.setOpaque(true);
        jPanel1.add(Lisrtotal9, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 370, 100, 25));

        Lisrtotal10.setBackground(new java.awt.Color(204, 204, 255));
        Lisrtotal10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal10.setToolTipText("");
        Lisrtotal10.setOpaque(true);
        jPanel1.add(Lisrtotal10, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 400, 100, 24));

        Lsueliqui2.setBackground(new java.awt.Color(204, 204, 255));
        Lsueliqui2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui2.setToolTipText("");
        Lsueliqui2.setOpaque(true);
        jPanel1.add(Lsueliqui2, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 144, 93, 26));

        Lsueliqui3.setBackground(new java.awt.Color(204, 204, 255));
        Lsueliqui3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui3.setToolTipText("");
        Lsueliqui3.setOpaque(true);
        jPanel1.add(Lsueliqui3, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 176, 93, 33));

        Lsueliqui4.setBackground(new java.awt.Color(204, 204, 255));
        Lsueliqui4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui4.setToolTipText("");
        Lsueliqui4.setOpaque(true);
        jPanel1.add(Lsueliqui4, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 215, 93, 26));

        Lsueliqui5.setBackground(new java.awt.Color(204, 204, 255));
        Lsueliqui5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui5.setToolTipText("");
        Lsueliqui5.setOpaque(true);
        jPanel1.add(Lsueliqui5, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 246, 93, 25));

        Lsueliqui6.setBackground(new java.awt.Color(204, 204, 255));
        Lsueliqui6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui6.setToolTipText("");
        Lsueliqui6.setOpaque(true);
        jPanel1.add(Lsueliqui6, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 279, 93, 24));

        Lsueliqui7.setBackground(new java.awt.Color(204, 204, 255));
        Lsueliqui7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui7.setToolTipText("");
        Lsueliqui7.setOpaque(true);
        jPanel1.add(Lsueliqui7, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 309, 93, 25));

        Lsueliqui8.setBackground(new java.awt.Color(204, 204, 255));
        Lsueliqui8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui8.setToolTipText("");
        Lsueliqui8.setOpaque(true);
        jPanel1.add(Lsueliqui8, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 339, 93, 25));

        Lsueliqui9.setBackground(new java.awt.Color(204, 204, 255));
        Lsueliqui9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui9.setToolTipText("");
        Lsueliqui9.setOpaque(true);
        jPanel1.add(Lsueliqui9, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 370, 93, 25));

        Lsueliqui10.setBackground(new java.awt.Color(204, 204, 255));
        Lsueliqui10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui10.setToolTipText("");
        Lsueliqui10.setOpaque(true);
        jPanel1.add(Lsueliqui10, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 400, 93, 24));

        Ldepar2.setBackground(new java.awt.Color(204, 204, 255));
        Ldepar2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldepar2.setOpaque(true);
        jPanel1.add(Ldepar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 144, 86, 26));

        Ldepar3.setBackground(new java.awt.Color(204, 204, 255));
        Ldepar3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldepar3.setOpaque(true);
        jPanel1.add(Ldepar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 176, 86, 33));

        Ldepar4.setBackground(new java.awt.Color(204, 204, 255));
        Ldepar4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldepar4.setOpaque(true);
        jPanel1.add(Ldepar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 215, 86, 26));

        Ldepar5.setBackground(new java.awt.Color(204, 204, 255));
        Ldepar5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldepar5.setOpaque(true);
        jPanel1.add(Ldepar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 246, 86, 25));

        Ldepar6.setBackground(new java.awt.Color(204, 204, 255));
        Ldepar6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldepar6.setOpaque(true);
        jPanel1.add(Ldepar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 277, 86, 26));

        Ldepar7.setBackground(new java.awt.Color(204, 204, 255));
        Ldepar7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldepar7.setOpaque(true);
        jPanel1.add(Ldepar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 309, 86, 25));

        Ldepar8.setBackground(new java.awt.Color(204, 204, 255));
        Ldepar8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldepar8.setOpaque(true);
        jPanel1.add(Ldepar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 339, 86, 25));

        Ldepar9.setBackground(new java.awt.Color(204, 204, 255));
        Ldepar9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldepar9.setOpaque(true);
        jPanel1.add(Ldepar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 370, 86, 25));

        Ldepar10.setBackground(new java.awt.Color(204, 204, 255));
        Ldepar10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldepar10.setOpaque(true);
        jPanel1.add(Ldepar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 400, 86, 24));

        jLabel10.setText("DEPARTAMENTO 1");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        jLabel11.setText("DEPARTAMENTO 2");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        jLabel12.setText("DEPARTAMENTO 3");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, -1, -1));

        jLabel13.setText("DEPARTAMENTO 4");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, -1, -1));

        jLabel14.setText("DEPARTAMENTO 5");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tnombre10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre10ActionPerformed
        String nombre10=Tnombre10.getText();
        if(nombre10.equals("")==false && nombre10.matches("[a-zA-Z]*")) // si se ingresa una letra o nombre  en el Text empezara a ejecutarse la condicion
        {
            for(int i=0; i<=5;i++)
            {
                numeroale[9][i]=2000+(int)(Math.random()*5000);
                Lsuelbase10.setText(""+numeroale[9][0]);
                Lboni10.setText(""+numeroale[9][1]);
                Lcomi10.setText(""+numeroale[9][2]);
                Ligss10.setText(""+numeroale[9][3]);
                Ldescjudi10.setText(""+numeroale[9][4]);
            }
            if(numeroale[9][0]>=2600 || numeroale[9][0]<=5000)
            {
                ISR[9]=(int) (numeroale[9][0]*0.03);
                Lisrtotal10.setText(""+ISR[9]);
            }

            numeroale[9][5]=numeroale[9][0]+numeroale[9][1]+numeroale[9][2]-numeroale[9][3]-numeroale[9][4]-ISR[9];
            Lsueliqui10.setText(""+numeroale[9][5]);

            numeroale[9][6]=1+(int)(Math.random()*5);
            Ldepar10.setText(""+numeroale[9][6]);

            if(numeroale[9][6]==1)
            {
                departa[0]+=numeroale[9][5];
                Ltotal1.setText(""+departa[0]);
            }
            if(numeroale[9][6]==2)
            {
                departa[1]+=numeroale[9][5];
                Ltotal2.setText(""+departa[1]);
            }
            if(numeroale[9][6]==3)
            {
                departa[2]+=numeroale[9][5];
                Ltotal3.setText(""+departa[2]);
            }
            if(numeroale[9][6]==4)
            {
                departa[3]+=numeroale[9][5];
                Ltotal4.setText(""+departa[3]);
            }

            if(numeroale[9][6]==5)
            {
                departa[4]+=numeroale[9][5];
                Ltotal5.setText(""+departa[4]);
            }
        }
    }//GEN-LAST:event_Tnombre10ActionPerformed

    private void Tnombre9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre9ActionPerformed
        String nombre9=Tnombre9.getText();
        if(nombre9.equals("")==false && nombre9.matches("[a-zA-Z]*"))
        {
            for(int i=0; i<=5;i++)
            {
                numeroale[8][i]=2000+(int)(Math.random()*5000);
                Lsuelbase9.setText(""+numeroale[8][0]);
                Lboni9.setText(""+numeroale[8][1]);
                Lcomi9.setText(""+numeroale[8][2]);
                Ligss9.setText(""+numeroale[8][3]);
                Ldescjudi9.setText(""+numeroale[8][4]);
            }
            if(numeroale[8][0]>=2600 || numeroale[8][0]<=5000)
            {
                ISR[8]=(int) (numeroale[8][0]*0.03);
                Lisrtotal9.setText(""+ISR[8]);
            }

            numeroale[8][5]=numeroale[8][0]+numeroale[8][1]+numeroale[8][2]-numeroale[8][3]-numeroale[8][4]-ISR[8];
            Lsueliqui9.setText(""+numeroale[8][5]);

            numeroale[8][6]=1+(int)(Math.random()*5);
            Ldepar9.setText(""+numeroale[8][6]);

            if(numeroale[8][6]==1)
            {
                departa[0]+=numeroale[8][5];
                Ltotal1.setText(""+departa[0]);
            }
            if(numeroale[8][6]==2)
            {
                departa[1]+=numeroale[8][5];
                Ltotal2.setText(""+departa[1]);
            }
            if(numeroale[8][6]==3)
            {
                departa[2]+=numeroale[8][5];
                Ltotal3.setText(""+departa[2]);
            }
            if(numeroale[8][6]==4)
            {
                departa[3]+=numeroale[8][5];
                Ltotal4.setText(""+departa[3]);
            }

            if(numeroale[8][6]==5)
            {
                departa[4]+=numeroale[8][5];
                Ltotal5.setText(""+departa[4]);
            }
        }
    }//GEN-LAST:event_Tnombre9ActionPerformed

    private void Tnombre8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre8ActionPerformed
        String nombre8=Tnombre8.getText();
        if(nombre8.equals("")==false && nombre8.matches("[a-zA-Z]*"))
        {
            for(int i=0; i<=5;i++)
            {
                numeroale[7][i]=2000+(int)(Math.random()*5000);
                Lsuelbase8.setText(""+numeroale[7][0]);
                Lboni8.setText(""+numeroale[7][1]);
                Lcomi8.setText(""+numeroale[7][2]);
                Ligss8.setText(""+numeroale[7][3]);
                Ldescjudi8.setText(""+numeroale[7][4]);
            }
            if(numeroale[7][0]>=2600 || numeroale[7][0]<=5000)
            {
                ISR[7]=(int) (numeroale[7][0]*0.03);
                Lisrtotal8.setText(""+ISR[7]);
            }

            numeroale[7][5]=numeroale[7][0]+numeroale[7][1]+numeroale[7][2]-numeroale[7][3]-numeroale[7][4]-ISR[7];
            Lsueliqui8.setText(""+numeroale[7][5]);

            numeroale[7][6]=1+(int)(Math.random()*5);
            Ldepar8.setText(""+numeroale[7][6]);

            if(numeroale[7][6]==1)
            {
                departa[0]+=numeroale[7][5];
                Ltotal1.setText(""+departa[0]);
            }
            if(numeroale[7][6]==2)
            {
                departa[1]+=numeroale[7][5];
                Ltotal2.setText(""+departa[1]);
            }
            if(numeroale[7][6]==3)
            {
                departa[2]+=numeroale[7][5];
                Ltotal3.setText(""+departa[2]);
            }
            if(numeroale[7][6]==4)
            {
                departa[3]+=numeroale[7][5];
                Ltotal4.setText(""+departa[3]);
            }

            if(numeroale[7][6]==5)
            {
                departa[4]+=numeroale[7][5];
                Ltotal5.setText(""+departa[4]);
            }
        }
    }//GEN-LAST:event_Tnombre8ActionPerformed

    private void Tnombre7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre7ActionPerformed
        String nombre7=Tnombre7.getText();
        if(nombre7.equals("")==false && nombre7.matches("[a-zA-Z]*"))
        {
            for(int i=0; i<=5;i++)
            {
                numeroale[6][i]=2000+(int)(Math.random()*5000);
                Lsuelbase7.setText(""+numeroale[6][0]);
                Lboni7.setText(""+numeroale[6][1]);
                Lcomi7.setText(""+numeroale[6][2]);
                Ligss7.setText(""+numeroale[6][3]);
                Ldescjudi7.setText(""+numeroale[6][4]);
            }
            if(numeroale[6][0]>=2600 || numeroale[6][0]<=5000)
            {
                ISR[6]=(int) (numeroale[6][0]*0.03);
                Lisrtotal7.setText(""+ISR[6]);
            }

            numeroale[6][5]=numeroale[6][0]+numeroale[6][1]+numeroale[6][2]-numeroale[6][3]-numeroale[6][4]-ISR[6];
            Lsueliqui7.setText(""+numeroale[6][5]);

            numeroale[6][6]=1+(int)(Math.random()*5);
            Ldepar7.setText(""+numeroale[6][6]);

            if(numeroale[6][6]==1)
            {
                departa[0]+=numeroale[6][5];
                Ltotal1.setText(""+departa[0]);
            }
            if(numeroale[6][6]==2)
            {
                departa[1]+=numeroale[6][5];
                Ltotal2.setText(""+departa[1]);
            }
            if(numeroale[6][6]==3)
            {
                departa[2]+=numeroale[6][5];
                Ltotal3.setText(""+departa[2]);
            }
            if(numeroale[6][6]==4)
            {
                departa[3]+=numeroale[6][5];
                Ltotal4.setText(""+departa[3]);
            }

            if(numeroale[6][6]==5)
            {
                departa[4]+=numeroale[6][5];
                Ltotal5.setText(""+departa[4]);
            }
        }
    }//GEN-LAST:event_Tnombre7ActionPerformed

    private void Tnombre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre6ActionPerformed
        String nombre6=Tnombre6.getText();
        if(nombre6.equals("")==false && nombre6.matches("[a-zA-Z]*"))
        {
                numeroale[5][0]=2000+(int)(Math.random()*5000);
                Lsuelbase6.setText(""+numeroale[5][0]);
            
            opcion=JOptionPane.showInputDialog("DESEA CALCULAR BONIFICACION \n 1. SI  \n 0. NO"); 
        opc=Integer.parseInt(opcion);
            if(opc==1)
            {
                numeroale[5][1]=250;
                 Lboni6.setText(""+numeroale[5][1]);
            }
            else if(opc==0)
            {
                numeroale[5][1]=0;
                Lboni6.setText(""+numeroale[5][1]);
            }
            
        opcion1=JOptionPane.showInputDialog("DESEA CALCULAR COMISIONES \n 1. SI  \n 0. NO");
        opc1=Integer.parseInt(opcion1);
            if(opc1==1)
            {
               numeroale[5][2]=200+(int)(Math.random()*500);
               Lcomi6.setText(""+numeroale[5][2]);
            }
            else if(opc1==0)
            {
                numeroale[5][2]=0;  
                Lcomi6.setText(""+numeroale[5][2]);
            }
            
        opcion2=JOptionPane.showInputDialog("DESEA CALCULAR IGSS \n 1. SI  \n 0. NO");
        opc2=Integer.parseInt(opcion2);
            if(opc2==1)
            {
               numeroale[5][3]=200+(int)(Math.random()*500);
                Ligss6.setText(""+numeroale[5][3]);
            }
            else if(opc2==0)
            {
              numeroale[5][3]=0;
               Ligss6.setText(""+numeroale[5][3]);   
            }
            
        opcion3=JOptionPane.showInputDialog("DESEA CALCULAR DESCUENTO JUDICIAL \n 1. SI  \n 0. NO");
        opc3=Integer.parseInt(opcion3);
            if(opc3==1)
            {
               numeroale[5][4]=200+(int)(Math.random()*500);
              Ldescjudi6.setText(""+numeroale[5][4]);
            }
            else if(opc3==0)
            {
               numeroale[5][4]=0;
               Ldescjudi6.setText(""+numeroale[5][4]);    
            }
            
        opcion4=JOptionPane.showInputDialog("DESEA CALCULAR ISR \n 1. SI  \n 0. NO");
        opc4=Integer.parseInt(opcion4);
            if(opc4==1)
            {
                // verifica si el salario base se encuentra en los parametros indicados
                if(numeroale[5][0]>=2600 && numeroale[5][0]<=5000)
                {
                    ISR[5]=(int) (numeroale[5][0]*0.03);
                    Lisrtotal6.setText(""+ISR[5]);
                }
                else if(numeroale[5][0]>=5000 && numeroale[5][0]<=10000)
                {
                  ISR[5]=(int) (numeroale[5][0]*0.05);
                  Lisrtotal6.setText(""+ISR[5]);
                }
            }
            else if(opc4==0)
            {
                ISR[5]=0;
                Lisrtotal6.setText(""+ISR[6]);   
            }   
                   
            numeroale[5][5]=numeroale[5][0]+numeroale[5][1]+numeroale[5][2]-numeroale[5][3]-numeroale[5][4]-ISR[5];
            Lsueliqui6.setText(""+numeroale[5][5]);

            numeroale[5][6]=1+(int)(Math.random()*5);
            Ldepar6.setText(""+numeroale[5][6]);

            if(numeroale[5][6]==1)
            {
                departa[0]+=numeroale[5][5];
                Ltotal1.setText(""+departa[0]);
            }
            if(numeroale[5][6]==2)
            {
                departa[1]+=numeroale[5][5];
                Ltotal2.setText(""+departa[1]);
            }
            if(numeroale[5][6]==3)
            {
                departa[2]+=numeroale[5][5];
                Ltotal3.setText(""+departa[2]);
            }
            if(numeroale[5][6]==4)
            {
                departa[3]+=numeroale[5][5];
                Ltotal4.setText(""+departa[3]);
            }

            if(numeroale[5][6]==5)
            {
                departa[4]+=numeroale[5][5];
                Ltotal5.setText(""+departa[4]);
            }
        }
    }//GEN-LAST:event_Tnombre6ActionPerformed

    private void Tnombre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre5ActionPerformed
        String nombre5=Tnombre5.getText();
        if(nombre5.equals("")==false && nombre5.matches("[a-zA-Z]*"))
        {
                numeroale[4][0]=2000+(int)(Math.random()*5000);
                Lsuelbase5.setText(""+numeroale[4][0]);
                
        opcion=JOptionPane.showInputDialog("DESEA CALCULAR BONIFICACION \n 1. SI  \n 0. NO"); 
        opc=Integer.parseInt(opcion);
            if(opc==1)
            {
                numeroale[4][1]=250;
                Lboni5.setText(""+numeroale[4][1]);
            }
            else if(opc==0)
            {
                numeroale[4][1]=0;
                Lboni5.setText(""+numeroale[4][1]);
            }
            
        opcion1=JOptionPane.showInputDialog("DESEA CALCULAR COMISIONES \n 1. SI  \n 0. NO");
        opc1=Integer.parseInt(opcion1);
            if(opc1==1)
            {
               numeroale[4][2]=200+(int)(Math.random()*500);
               Lcomi5.setText(""+numeroale[4][2]);
            }
            else if(opc1==0)
            {
                numeroale[4][2]=0;  
                Lcomi5.setText(""+numeroale[4][2]); 
            }
            
        opcion2=JOptionPane.showInputDialog("DESEA CALCULAR IGSS \n 1. SI  \n 0. NO");
        opc2=Integer.parseInt(opcion2);
            if(opc2==1)
            {
               numeroale[4][3]=200+(int)(Math.random()*500);
               Ligss5.setText(""+numeroale[4][3]);
            }
            else if(opc2==0)
            {
              numeroale[4][3]=0;
              Ligss5.setText(""+numeroale[4][3]);   
            }
            
        opcion3=JOptionPane.showInputDialog("DESEA CALCULAR DESCUENTO JUDICIAL \n 1. SI  \n 0. NO");
        opc3=Integer.parseInt(opcion3);
            if(opc3==1)
            {
               numeroale[4][4]=200+(int)(Math.random()*500);
               Ldescjudi5.setText(""+numeroale[4][4]);
            }
            else if(opc3==0)
            {
               numeroale[4][4]=0;
               Ldescjudi5.setText(""+numeroale[4][4]);     
            }
            
        opcion4=JOptionPane.showInputDialog("DESEA CALCULAR ISR \n 1. SI  \n 0. NO");
        opc4=Integer.parseInt(opcion4);
            if(opc4==1)
            {
                // verifica si el salario base se encuentra en los parametros indicados
              if(numeroale[4][0]>=2600 && numeroale[4][0]<=5000)
                {
                    ISR[4]=(int) (numeroale[4][0]*0.03);
                    Lisrtotal5.setText(""+ISR[4]);
                }
                else if(numeroale[4][0]>=5000 && numeroale[4][0]<=10000)
                {
                  ISR[4]=(int) (numeroale[4][0]*0.05);
                  Lisrtotal5.setText(""+ISR[4]);
                }
            }
            else if(opc4==0)
            {
                ISR[4]=0;
                Lisrtotal5.setText(""+ISR[4]);   
            }   
      
            numeroale[4][5]=numeroale[4][0]+numeroale[4][1]+numeroale[4][2]-numeroale[4][3]-numeroale[4][4]-ISR[4];
            Lsueliqui5.setText(""+numeroale[4][5]);

            numeroale[4][6]=1+(int)(Math.random()*5);
            Ldepar5.setText(""+numeroale[4][6]);

            if(numeroale[4][6]==1)
            {
                departa[0]+=numeroale[4][5];
                Ltotal1.setText(""+departa[0]);
            }
            if(numeroale[4][6]==2)
            {
                departa[1]+=numeroale[4][5];
                Ltotal2.setText(""+departa[1]);
            }
            if(numeroale[4][6]==3)
            {
                departa[2]+=numeroale[4][5];
                Ltotal3.setText(""+departa[2]);
            }
            if(numeroale[4][6]==4)
            {
                departa[3]+=numeroale[4][5];
                Ltotal4.setText(""+departa[3]);
            }

            if(numeroale[4][6]==5)
            {
                departa[4]+=numeroale[4][5];
                Ltotal5.setText(""+departa[4]);
            }
        }
    }//GEN-LAST:event_Tnombre5ActionPerformed

    private void Tnombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre4ActionPerformed
        String nombre4=Tnombre4.getText();
        if(nombre4.equals("")==false && nombre4.matches("[a-zA-Z]*"))
        {
               numeroale[3][0]=2000+(int)(Math.random()*5000);
                Lsuelbase4.setText(""+numeroale[3][0]);
                
        opcion=JOptionPane.showInputDialog("DESEA CALCULAR BONIFICACION \n 1. SI  \n 0. NO"); 
        opc=Integer.parseInt(opcion);
            if(opc==1)
            {
                numeroale[3][1]=250;
               Lboni4.setText(""+numeroale[3][1]);
            }
            else if(opc==0)
            {
                numeroale[3][1]=0;
                Lboni4.setText(""+numeroale[3][1]);
            }
            
        opcion1=JOptionPane.showInputDialog("DESEA CALCULAR COMISIONES \n 1. SI  \n 0. NO");
        opc1=Integer.parseInt(opcion1);
            if(opc1==1)
            {
               numeroale[3][2]=200+(int)(Math.random()*500);
                Lcomi4.setText(""+numeroale[3][2]);
            }
            else if(opc1==0)
            {
                numeroale[3][2]=0;  
                Lcomi4.setText(""+numeroale[3][2]); 
            }
            
        opcion2=JOptionPane.showInputDialog("DESEA CALCULAR IGSS \n 1. SI  \n 0. NO");
        opc2=Integer.parseInt(opcion2);
            if(opc2==1)
            {
               numeroale[3][3]=200+(int)(Math.random()*500);
                Ligss4.setText(""+numeroale[3][3]);
            }
            else if(opc2==0)
            {
                numeroale[2][3]=0;
                Ligss4.setText(""+numeroale[4][3]);   
            }
            
        opcion3=JOptionPane.showInputDialog("DESEA CALCULAR DESCUENTO JUDICIAL \n 1. SI  \n 0. NO");
        opc3=Integer.parseInt(opcion3);
               if(opc3==1)
            {
               numeroale[3][4]=200+(int)(Math.random()*500);
               Ldescjudi4.setText(""+numeroale[3][4]);
            }
            else if(opc3==0)
            {
                numeroale[3][4]=0;
               Ldescjudi4.setText(""+numeroale[3][4]);      
            }
            
        opcion4=JOptionPane.showInputDialog("DESEA CALCULAR ISR \n 1. SI  \n 0. NO");
        opc4=Integer.parseInt(opcion4);
            if(opc4==1)
            {
                // verifica si el salario base se encuentra en los parametros indicados
               if(numeroale[3][0]>=2600 || numeroale[3][0]<=5000)
                {
                    ISR[3]=(int) (numeroale[3][0]*0.03);
                    Lisrtotal4.setText(""+ISR[3]);
                }
                else if(numeroale[3][0]>=5000 && numeroale[3][0]<=10000)
                {
                  ISR[3]=(int) (numeroale[3][0]*0.05);
                  Lisrtotal4.setText(""+ISR[3]);
                }
            }
            else if(opc4==0)
            {
                ISR[3]=0;
                Lisrtotal4.setText(""+ISR[3]);   
            }
             
            numeroale[3][5]=numeroale[3][0]+numeroale[3][1]+numeroale[3][2]-numeroale[3][3]-numeroale[3][4]-ISR[3];
            Lsueliqui4.setText(""+numeroale[3][5]);

            numeroale[3][6]=1+(int)(Math.random()*5);
            Ldepar4.setText(""+numeroale[3][6]);

            if(numeroale[3][6]==1)
            {
                departa[0]+=numeroale[3][5];
                Ltotal1.setText(""+departa[0]);
            }
            if(numeroale[3][6]==2)
            {
                departa[1]+=numeroale[3][5];
                Ltotal2.setText(""+departa[1]);
            }
            if(numeroale[3][6]==3)
            {
                departa[2]+=numeroale[3][5];
                Ltotal3.setText(""+departa[2]);
            }
            if(numeroale[3][6]==4)
            {
                departa[3]+=numeroale[3][5];
                Ltotal4.setText(""+departa[3]);
            }

            if(numeroale[3][6]==5)
            {
                departa[4]+=numeroale[3][5];
                Ltotal5.setText(""+departa[4]);
            }
        }

    }//GEN-LAST:event_Tnombre4ActionPerformed

    private void Tnombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre3ActionPerformed
        String nombre3=Tnombre3.getText();
        if(nombre3.equals("")==false && nombre3.matches("[a-zA-Z]*"))
        {
            
            numeroale[2][0]=2000+(int)(Math.random()*5000);
            Lsuelbase3.setText(""+numeroale[2][0]);
                      
        opcion=JOptionPane.showInputDialog("DESEA CALCULAR BONIFICACION \n 1. SI  \n 0. NO"); 
        opc=Integer.parseInt(opcion);
            if(opc==1)
            {
                numeroale[2][1]=250;
               Lboni3.setText(""+numeroale[2][1]);
            }
            else if(opc==0)
            {
                numeroale[2][1]=0;
                Lboni3.setText(""+numeroale[2][1]); 
            }
            
        opcion1=JOptionPane.showInputDialog("DESEA CALCULAR COMISIONES \n 1. SI  \n 0. NO");
        opc1=Integer.parseInt(opcion1);
            if(opc1==1)
            {
               numeroale[2][2]=200+(int)(Math.random()*500);
               Lcomi3.setText(""+numeroale[2][2]);
            }
            else if(opc1==0)
            {
                numeroale[2][2]=0;  
                Lcomi3.setText(""+numeroale[2][2]); 
            }
            
        opcion2=JOptionPane.showInputDialog("DESEA CALCULAR IGSS \n 1. SI  \n 0. NO");
        opc2=Integer.parseInt(opcion2);
            if(opc2==1)
            {
               numeroale[2][3]=200+(int)(Math.random()*500);
                Ligss3.setText(""+numeroale[2][3]);
            }
            else if(opc2==0)
            {
                numeroale[2][3]=0;
                Ligss3.setText(""+numeroale[2][3]);   
            }
            
        opcion3=JOptionPane.showInputDialog("DESEA CALCULAR DESCUENTO JUDICIAL \n 1. SI  \n 0. NO");
        opc3=Integer.parseInt(opcion3);
               if(opc3==1)
            {
               numeroale[2][4]=200+(int)(Math.random()*500);
               Ldescjudi3.setText(""+numeroale[2][4]);
            }
            else if(opc3==0)
            {
                numeroale[2][4]=0;
                Ldescjudi3.setText(""+numeroale[2][4]);
                   
            }
            
        opcion4=JOptionPane.showInputDialog("DESEA CALCULAR ISR \n 1. SI  \n 0. NO");
        opc4=Integer.parseInt(opcion4);
            if(opc4==1)
            {
                // verifica si el salario base se encuentra en los parametros indicados
                if(numeroale[2][0]>=2600 && numeroale[2][0]<=5000)
                {
                  ISR[2]=(int) (numeroale[2][0]*0.03);
                  Lisrtotal3.setText(""+ISR[2]);
                }
                else if(numeroale[2][0]>=5000 && numeroale[2][0]<=10000)
                {
                  ISR[2]=(int) (numeroale[2][0]*0.05);
                  Lisrtotal3.setText(""+ISR[2]);
                }
            }
            else if(opc4==0)
            {
                ISR[2]=0;
                Lisrtotal3.setText(""+ISR[2]);   
            }
            
            numeroale[2][5]=numeroale[2][0]+numeroale[2][1]+numeroale[2][2]-numeroale[2][3]-numeroale[2][4]-ISR[2];
            Lsueliqui3.setText(""+numeroale[2][5]);

            numeroale[2][6]=1+(int)(Math.random()*5);
            Ldepar3.setText(""+numeroale[2][6]);

            if(numeroale[2][6]==1)
            {
                departa[0]+=numeroale[2][5];
                Ltotal1.setText(""+departa[0]);
            }
            if(numeroale[2][6]==2)
            {
                departa[1]+=numeroale[2][5];
                Ltotal2.setText(""+departa[1]);
            }
            if(numeroale[2][6]==3)
            {
                departa[2]+=numeroale[2][5];
                Ltotal3.setText(""+departa[2]);
            }
            if(numeroale[2][6]==4)
            {
                departa[3]+=numeroale[2][5];
                Ltotal4.setText(""+departa[3]);
            }

            if(numeroale[2][6]==5)
            {
                departa[4]+=numeroale[2][5];
                Ltotal5.setText(""+departa[4]);
            }
        }
    }//GEN-LAST:event_Tnombre3ActionPerformed

    private void Tnombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre2ActionPerformed
        String nombre2=Tnombre2.getText();
        if(nombre2.equals("")==false && nombre2.matches("[a-zA-Z]*"))
        {
       
            numeroale[1][0]=2000+(int)(Math.random()*5000);
            Lsuelbase2.setText(""+numeroale[1][0]); 
            
        // verifica si se agrega bonificacion, comisiones, igss, descuento,isr    
        opcion=JOptionPane.showInputDialog("DESEA CALCULAR BONIFICACION \n 1. SI  \n 0. NO"); 
        opc=Integer.parseInt(opcion);
            if(opc==1)
            {
                numeroale[1][1]=250;
                Lboni2.setText(""+numeroale[1][1]);
            }
            else if(opc==0)
            {
                numeroale[1][1]=0;
                Lboni2.setText(""+numeroale[1][1]);  
            }
            
        opcion1=JOptionPane.showInputDialog("DESEA CALCULAR COMISIONES \n 1. SI  \n 0. NO");
        opc1=Integer.parseInt(opcion1);
            if(opc1==1)
            {
               numeroale[1][2]=200+(int)(Math.random()*500);
               Lcomi2.setText(""+numeroale[1][2]);
            }
            else if(opc1==0)
            {
                numeroale[1][2]=0;  
                Lcomi2.setText(""+numeroale[1][2]);  
            }
            
        opcion2=JOptionPane.showInputDialog("DESEA CALCULAR IGSS \n 1. SI  \n 0. NO");
        opc2=Integer.parseInt(opcion2);
            if(opc2==1)
            {
               numeroale[1][3]=200+(int)(Math.random()*500);
               Ligss2.setText(""+numeroale[1][3]);
            }
            else if(opc2==0)
            {
                numeroale[1][3]=0;
                 Ligss2.setText(""+numeroale[1][3]);   
            }
            
        opcion3=JOptionPane.showInputDialog("DESEA CALCULAR DESCUENTO JUDICIAL \n 1. SI  \n 0. NO");
        opc3=Integer.parseInt(opcion3);
               if(opc3==1)
            {
               numeroale[1][4]=200+(int)(Math.random()*500);
               Ldescjudi2.setText(""+numeroale[1][4]);
            }
            else if(opc3==0)
            {
                numeroale[1][4]=0;
                Ldescjudi2.setText(""+numeroale[1][4]);
                   
            }
            
        opcion4=JOptionPane.showInputDialog("DESEA CALCULAR ISR \n 1. SI  \n 0. NO");
        opc4=Integer.parseInt(opcion4);
            if(opc4==1)
            {
                // verifica si el salario base se encuentra en los parametros indicados
                if(numeroale[1][0]>=2600 && numeroale[1][0]<=5000)
                {
                  ISR[1]=(int) (numeroale[1][0]*0.03);
                  Lisrtotal2.setText(""+ISR[1]);
                }
                else if(numeroale[1][0]>=5000 && numeroale[1][0]<=10000)
                {
                  ISR[1]=(int) (numeroale[1][0]*0.05);
                  Lisrtotal2.setText(""+ISR[1]);
                }
            }
            else if(opc4==0)
            {
                ISR[1]=0;
                Lisrtotal2.setText(""+ISR[1]);   
            }        
           

            numeroale[1][5]=numeroale[1][0]+numeroale[1][1]+numeroale[1][2]-numeroale[1][3]-numeroale[1][4]-ISR[1];
            Lsueliqui2.setText(""+numeroale[1][5]);
            
            numeroale[1][6]=1+(int)(Math.random()*5);
            Ldepar2.setText(""+numeroale[1][6]);
            
            // verifica si en dichas casillas se encuentra los valores 1,2,3,4,5 para colocarlos en los espacios correspondientes
            if(numeroale[1][6]==1)
            {
                departa[0]+=numeroale[1][5];
                Ltotal1.setText(""+departa[0]);
            }
            if(numeroale[1][6]==2)
            {
                departa[1]+=numeroale[1][5];
                Ltotal2.setText(""+departa[1]);
            }
            if(numeroale[1][6]==3)
            {
                departa[2]+=numeroale[1][5];
                Ltotal3.setText(""+departa[2]);
            }
            if(numeroale[1][6]==4)
            {
                departa[3]+=numeroale[1][5];
                Ltotal4.setText(""+departa[3]);
            }

            if(numeroale[1][6]==5)
            {
                departa[4]+=numeroale[1][5];
                Ltotal5.setText(""+departa[4]);
            }
        }
    }//GEN-LAST:event_Tnombre2ActionPerformed

    private void Tnombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre1KeyReleased

    }//GEN-LAST:event_Tnombre1KeyReleased

    private void Tnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre1ActionPerformed
        
        String nombre1=Tnombre1.getText();
        
        if(nombre1.equals("")==false && nombre1.matches("[a-zA-Z]*"))   // verifica si hay ingreso o no 
        {
           
                numeroale[0][0]=2000+(int)(Math.random()*5000);
                Lsuelbase1.setText(""+numeroale[0][0]);
                
         // verifica si se agrega bonificacion, comisiones, igss, descuento,isr    
        opcion=JOptionPane.showInputDialog("DESEA CALCULAR BONIFICACION \n 1. SI  \n 0. NO"); 
        opc=Integer.parseInt(opcion);
            if(opc==1)
            {
                numeroale[0][1]=250;
                Lboni1.setText(""+numeroale[0][1]);
            }
            else if(opc==0)
            {
                numeroale[0][1]=0;
                Lboni1.setText(""+numeroale[0][1]);   
            }
            
        opcion1=JOptionPane.showInputDialog("DESEA CALCULAR COMISIONES \n 1. SI  \n 0. NO");
        opc1=Integer.parseInt(opcion1);
            if(opc1==1)
            {
               numeroale[0][2]=200+(int)(Math.random()*500);
               Lcomi1.setText(""+numeroale[0][2]);
            }
            else if(opc1==0)
            {
                numeroale[0][2]=0;  
                Lcomi1.setText(""+numeroale[0][2]);   
            }
            
        opcion2=JOptionPane.showInputDialog("DESEA CALCULAR IGSS \n 1. SI  \n 0. NO");
        opc2=Integer.parseInt(opcion2);
            if(opc2==1)
            {
               numeroale[0][3]=200+(int)(Math.random()*500);
               Ligss1.setText(""+numeroale[0][3]);
            }
            else if(opc2==0)
            {
                numeroale[0][3]=0;
                Ligss1.setText(""+numeroale[0][3]);    
            }
            
        opcion3=JOptionPane.showInputDialog("DESEA CALCULAR DESCUENTO JUDICIAL \n 1. SI  \n 0. NO");
        opc3=Integer.parseInt(opcion3);
               if(opc3==1)
            {
               numeroale[0][4]=200+(int)(Math.random()*500);
               Ldescjudi1.setText(""+numeroale[0][4]);
            }
            else if(opc3==0)
            {
                numeroale[0][4]=0;
                Ldescjudi1.setText(""+numeroale[0][4]);
                   
            }
            
        opcion4=JOptionPane.showInputDialog("DESEA CALCULAR ISR \n 1. SI  \n 0. NO");
        opc4=Integer.parseInt(opcion4);
            if(opc4==1)
            {
                // verifica si el salario base se encuentra en los parametros indicados
                if(numeroale[0][0]>=2600 && numeroale[0][0]<=5000)
                {
                  ISR[0]=(int) (numeroale[0][0]*0.03);
                  Lisrtotal1.setText(""+ISR[0]);
                }
                else if(numeroale[0][0]>=5000 && numeroale[0][0]<=10000)
                {
                  ISR[0]=(int) (numeroale[0][0]*0.05);
                  Lisrtotal1.setText(""+ISR[0]);
                }
            }
            else if(opc4==0)
            {
                ISR[0]=0;
                Lisrtotal1.setText(""+ISR[0]);   
            }   
               
        numeroale[0][5]=numeroale[0][0]+numeroale[0][1]+numeroale[0][2]-numeroale[0][3]-numeroale[0][4]-ISR[0];
        Lsueliqui1.setText(""+numeroale[0][5]);

            numeroale[0][6]=1+(int)(Math.random()*5);
            Ldepar1.setText(""+numeroale[0][6]);

            // verifica si en dichas casillas se encuentra los valores 1,2,3,4,5 para colocarlos en los espacios correspondientes
            if(numeroale[0][6]==1)
            {
                departa[0]+=numeroale[0][5];
                Ltotal1.setText(""+departa[0]);
            }
            if(numeroale[0][6]==2)
            {
                departa[1]+=numeroale[0][5];
                Ltotal2.setText(""+departa[1]);
            }
            if(numeroale[0][6]==3)
            {
                departa[2]+=numeroale[0][5];
                Ltotal3.setText(""+departa[2]);
            }
            if(numeroale[0][6]==4)
            {
                departa[3]+=numeroale[0][5];
                Ltotal4.setText(""+departa[3]);
            }

            if(numeroale[0][6]==5)
            {
                departa[4]+=numeroale[0][5];
                Ltotal5.setText(""+departa[4]);
            }
        }
    }//GEN-LAST:event_Tnombre1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(laboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laboratorio2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lboni1;
    private javax.swing.JLabel Lboni10;
    private javax.swing.JLabel Lboni2;
    private javax.swing.JLabel Lboni3;
    private javax.swing.JLabel Lboni4;
    private javax.swing.JLabel Lboni5;
    private javax.swing.JLabel Lboni6;
    private javax.swing.JLabel Lboni7;
    private javax.swing.JLabel Lboni8;
    private javax.swing.JLabel Lboni9;
    private javax.swing.JLabel Lcomi1;
    private javax.swing.JLabel Lcomi10;
    private javax.swing.JLabel Lcomi2;
    private javax.swing.JLabel Lcomi3;
    private javax.swing.JLabel Lcomi4;
    private javax.swing.JLabel Lcomi5;
    private javax.swing.JLabel Lcomi6;
    private javax.swing.JLabel Lcomi7;
    private javax.swing.JLabel Lcomi8;
    private javax.swing.JLabel Lcomi9;
    private javax.swing.JLabel Ldepar1;
    private javax.swing.JLabel Ldepar10;
    private javax.swing.JLabel Ldepar2;
    private javax.swing.JLabel Ldepar3;
    private javax.swing.JLabel Ldepar4;
    private javax.swing.JLabel Ldepar5;
    private javax.swing.JLabel Ldepar6;
    private javax.swing.JLabel Ldepar7;
    private javax.swing.JLabel Ldepar8;
    private javax.swing.JLabel Ldepar9;
    private javax.swing.JLabel Ldescjudi1;
    private javax.swing.JLabel Ldescjudi10;
    private javax.swing.JLabel Ldescjudi2;
    private javax.swing.JLabel Ldescjudi3;
    private javax.swing.JLabel Ldescjudi4;
    private javax.swing.JLabel Ldescjudi5;
    private javax.swing.JLabel Ldescjudi6;
    private javax.swing.JLabel Ldescjudi7;
    private javax.swing.JLabel Ldescjudi8;
    private javax.swing.JLabel Ldescjudi9;
    private javax.swing.JLabel Ligss1;
    private javax.swing.JLabel Ligss10;
    private javax.swing.JLabel Ligss2;
    private javax.swing.JLabel Ligss3;
    private javax.swing.JLabel Ligss4;
    private javax.swing.JLabel Ligss5;
    private javax.swing.JLabel Ligss6;
    private javax.swing.JLabel Ligss7;
    private javax.swing.JLabel Ligss8;
    private javax.swing.JLabel Ligss9;
    private javax.swing.JLabel Lisrtotal1;
    private javax.swing.JLabel Lisrtotal10;
    private javax.swing.JLabel Lisrtotal2;
    private javax.swing.JLabel Lisrtotal3;
    private javax.swing.JLabel Lisrtotal4;
    private javax.swing.JLabel Lisrtotal5;
    private javax.swing.JLabel Lisrtotal6;
    private javax.swing.JLabel Lisrtotal7;
    private javax.swing.JLabel Lisrtotal8;
    private javax.swing.JLabel Lisrtotal9;
    private javax.swing.JLabel Lsuelbase1;
    private javax.swing.JLabel Lsuelbase10;
    private javax.swing.JLabel Lsuelbase2;
    private javax.swing.JLabel Lsuelbase3;
    private javax.swing.JLabel Lsuelbase4;
    private javax.swing.JLabel Lsuelbase5;
    private javax.swing.JLabel Lsuelbase6;
    private javax.swing.JLabel Lsuelbase7;
    private javax.swing.JLabel Lsuelbase8;
    private javax.swing.JLabel Lsuelbase9;
    private javax.swing.JLabel Lsueliqui1;
    private javax.swing.JLabel Lsueliqui10;
    private javax.swing.JLabel Lsueliqui2;
    private javax.swing.JLabel Lsueliqui3;
    private javax.swing.JLabel Lsueliqui4;
    private javax.swing.JLabel Lsueliqui5;
    private javax.swing.JLabel Lsueliqui6;
    private javax.swing.JLabel Lsueliqui7;
    private javax.swing.JLabel Lsueliqui8;
    private javax.swing.JLabel Lsueliqui9;
    private javax.swing.JLabel Ltitulo;
    private javax.swing.JLabel Ltotal1;
    private javax.swing.JLabel Ltotal2;
    private javax.swing.JLabel Ltotal3;
    private javax.swing.JLabel Ltotal4;
    private javax.swing.JLabel Ltotal5;
    private javax.swing.JTextField Tnombre1;
    private javax.swing.JTextField Tnombre10;
    private javax.swing.JTextField Tnombre2;
    private javax.swing.JTextField Tnombre3;
    private javax.swing.JTextField Tnombre4;
    private javax.swing.JTextField Tnombre5;
    private javax.swing.JTextField Tnombre6;
    private javax.swing.JTextField Tnombre7;
    private javax.swing.JTextField Tnombre8;
    private javax.swing.JTextField Tnombre9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
