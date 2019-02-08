import javax.swing.JOptionPane;

/*
 Karen Roxana Roldán Hernández 0901-17-63
 */

public class Lab2 extends javax.swing.JFrame {
        
       int[] departamento =new int[10];
       int[][] numeroale= new int[10][5];
       int[] departa = new int[5];
     
    public Lab2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LTituloPlanilla = new javax.swing.JLabel();
        Tnombre1 = new javax.swing.JTextField();
        LtituloNom = new javax.swing.JLabel();
        LtituloSuelBa = new javax.swing.JLabel();
        LtituloTotDep = new javax.swing.JLabel();
        LtituloTotPer = new javax.swing.JLabel();
        LtituloSuelLiqui = new javax.swing.JLabel();
        LtituloDepart = new javax.swing.JLabel();
        LtotDepre3 = new javax.swing.JLabel();
        LsuelBase1 = new javax.swing.JLabel();
        LtotDepre1 = new javax.swing.JLabel();
        LtotPer1 = new javax.swing.JLabel();
        LsueLiqui1 = new javax.swing.JLabel();
        Ldepart1 = new javax.swing.JLabel();
        Tnombre2 = new javax.swing.JTextField();
        LsuelBase2 = new javax.swing.JLabel();
        LtotDepre2 = new javax.swing.JLabel();
        LtotPer2 = new javax.swing.JLabel();
        LsueLiqui2 = new javax.swing.JLabel();
        Ldepart2 = new javax.swing.JLabel();
        LsuelBase3 = new javax.swing.JLabel();
        LtotPer3 = new javax.swing.JLabel();
        Tnombre3 = new javax.swing.JTextField();
        LsueLiqui3 = new javax.swing.JLabel();
        Ldepart3 = new javax.swing.JLabel();
        Lmostrar1 = new javax.swing.JLabel();
        Lmostrar2 = new javax.swing.JLabel();
        Lmostrar3 = new javax.swing.JLabel();
        Lmostrar4 = new javax.swing.JLabel();
        Lmostrar5 = new javax.swing.JLabel();
        LsuelBase4 = new javax.swing.JLabel();
        Tnombre4 = new javax.swing.JTextField();
        LtotDepre4 = new javax.swing.JLabel();
        LtotPer4 = new javax.swing.JLabel();
        LsueLiqui4 = new javax.swing.JLabel();
        Ldepart4 = new javax.swing.JLabel();
        Tnombre5 = new javax.swing.JTextField();
        Tnombre6 = new javax.swing.JTextField();
        Tnombre7 = new javax.swing.JTextField();
        Tnombre8 = new javax.swing.JTextField();
        Tnombre9 = new javax.swing.JTextField();
        Tnombre10 = new javax.swing.JTextField();
        LsuelBase5 = new javax.swing.JLabel();
        LtotDepre5 = new javax.swing.JLabel();
        LtotPer5 = new javax.swing.JLabel();
        LsueLiqui5 = new javax.swing.JLabel();
        Ldepart5 = new javax.swing.JLabel();
        LsuelBase6 = new javax.swing.JLabel();
        LtotDepre6 = new javax.swing.JLabel();
        LtotPer6 = new javax.swing.JLabel();
        LsueLiqui6 = new javax.swing.JLabel();
        Ldepart6 = new javax.swing.JLabel();
        LsuelBase7 = new javax.swing.JLabel();
        LtotDepre7 = new javax.swing.JLabel();
        LtotPer7 = new javax.swing.JLabel();
        LsueLiqui7 = new javax.swing.JLabel();
        Ldepart7 = new javax.swing.JLabel();
        LsuelBase8 = new javax.swing.JLabel();
        LtotDepre8 = new javax.swing.JLabel();
        LtotPer8 = new javax.swing.JLabel();
        LsueLiqui8 = new javax.swing.JLabel();
        Ldepart8 = new javax.swing.JLabel();
        LsuelBase9 = new javax.swing.JLabel();
        LtotDepre9 = new javax.swing.JLabel();
        LtotPer9 = new javax.swing.JLabel();
        LsueLiqui9 = new javax.swing.JLabel();
        Ldepart9 = new javax.swing.JLabel();
        LsuelBase10 = new javax.swing.JLabel();
        LtotDepre10 = new javax.swing.JLabel();
        LtotPer10 = new javax.swing.JLabel();
        LsueLiqui10 = new javax.swing.JLabel();
        Ldepart10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LTituloPlanilla.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        LTituloPlanilla.setText("PLANILLA");
        getContentPane().add(LTituloPlanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        Tnombre1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
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
        getContentPane().add(Tnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 108, -1));

        LtituloNom.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        LtituloNom.setText("Nombre Empleado");
        getContentPane().add(LtituloNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 122, -1, 24));

        LtituloSuelBa.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        LtituloSuelBa.setText("Sueldpo Liquido");
        getContentPane().add(LtituloSuelBa, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 119, -1, 30));

        LtituloTotDep.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        LtituloTotDep.setText("Total Depreciaciones");
        getContentPane().add(LtituloTotDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 123, -1, -1));

        LtituloTotPer.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        LtituloTotPer.setText("Total Percepcion");
        getContentPane().add(LtituloTotPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 119, 119, 30));

        LtituloSuelLiqui.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        LtituloSuelLiqui.setText("Sueldo Liquido");
        getContentPane().add(LtituloSuelLiqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 123, -1, -1));

        LtituloDepart.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        LtituloDepart.setText("Departamento");
        getContentPane().add(LtituloDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 119, 140, 30));

        LtotDepre3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotDepre3.setText("jLabel1");
        getContentPane().add(LtotDepre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 237, 110, 30));

        LsuelBase1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsuelBase1.setText("jLabel2");
        getContentPane().add(LsuelBase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 24));

        LtotDepre1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotDepre1.setText("jLabel3");
        getContentPane().add(LtotDepre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 162, 106, 24));

        LtotPer1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotPer1.setText("jLabel4");
        getContentPane().add(LtotPer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 162, 110, 24));

        LsueLiqui1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsueLiqui1.setText("jLabel5");
        getContentPane().add(LsueLiqui1, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 162, 90, 30));

        Ldepart1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ldepart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ldepart1MouseEntered(evt);
            }
        });
        Ldepart1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Ldepart1KeyReleased(evt);
            }
        });
        getContentPane().add(Ldepart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 160, 80, 30));

        Tnombre2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Tnombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre2ActionPerformed(evt);
            }
        });
        Tnombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre2KeyReleased(evt);
            }
        });
        getContentPane().add(Tnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 108, -1));

        LsuelBase2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsuelBase2.setText("jLabel1");
        getContentPane().add(LsuelBase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, 30));

        LtotDepre2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotDepre2.setText("jLabel2");
        getContentPane().add(LtotDepre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 199, 106, 28));

        LtotPer2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotPer2.setText("jLabel3");
        getContentPane().add(LtotPer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 199, 104, 28));

        LsueLiqui2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsueLiqui2.setText("jLabel4");
        getContentPane().add(LsueLiqui2, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 201, 100, 30));

        Ldepart2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ldepart2.setText("jLabel5");
        getContentPane().add(Ldepart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 193, 77, 30));

        LsuelBase3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsuelBase3.setText("jLabel1");
        getContentPane().add(LsuelBase3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 110, 30));

        LtotPer3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotPer3.setText("jLabel1");
        getContentPane().add(LtotPer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 231, 110, 30));

        Tnombre3.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Tnombre3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre3KeyReleased(evt);
            }
        });
        getContentPane().add(Tnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, 108, -1));

        LsueLiqui3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsueLiqui3.setText("jLabel1");
        getContentPane().add(LsueLiqui3, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 237, 100, 30));

        Ldepart3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ldepart3.setText("jLabel1");
        getContentPane().add(Ldepart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 229, 70, 30));

        Lmostrar1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Lmostrar1.setText("jLabel1");
        getContentPane().add(Lmostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 104, 20));

        Lmostrar2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Lmostrar2.setText("jLabel1");
        getContentPane().add(Lmostrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 100, 30));

        Lmostrar3.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Lmostrar3.setText("jLabel1");
        getContentPane().add(Lmostrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 113, 20));

        Lmostrar4.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Lmostrar4.setText("jLabel1");
        getContentPane().add(Lmostrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 100, 20));

        Lmostrar5.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Lmostrar5.setText("jLabel1");
        getContentPane().add(Lmostrar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 590, 80, 20));

        LsuelBase4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsuelBase4.setText("jLabel1");
        getContentPane().add(LsuelBase4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 110, 30));

        Tnombre4.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Tnombre4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre4KeyReleased(evt);
            }
        });
        getContentPane().add(Tnombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 276, 108, 26));

        LtotDepre4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotDepre4.setText("jLabel2");
        getContentPane().add(LtotDepre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 275, 97, 28));

        LtotPer4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotPer4.setText("jLabel3");
        getContentPane().add(LtotPer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 110, 28));

        LsueLiqui4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsueLiqui4.setText("jLabel4");
        getContentPane().add(LsueLiqui4, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 274, 91, 31));

        Ldepart4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ldepart4.setText("jLabel5");
        getContentPane().add(Ldepart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 77, 30));

        Tnombre5.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Tnombre5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre5KeyReleased(evt);
            }
        });
        getContentPane().add(Tnombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 108, 30));

        Tnombre6.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Tnombre6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre6KeyReleased(evt);
            }
        });
        getContentPane().add(Tnombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 108, 31));

        Tnombre7.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Tnombre7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre7KeyReleased(evt);
            }
        });
        getContentPane().add(Tnombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 110, -1));

        Tnombre8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre8KeyReleased(evt);
            }
        });
        getContentPane().add(Tnombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 110, 30));

        Tnombre9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre9KeyReleased(evt);
            }
        });
        getContentPane().add(Tnombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 110, 30));

        Tnombre10.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Tnombre10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre10KeyReleased(evt);
            }
        });
        getContentPane().add(Tnombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 110, 30));

        LsuelBase5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsuelBase5.setText("jLabel6");
        getContentPane().add(LsuelBase5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 110, 30));

        LtotDepre5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotDepre5.setText("jLabel7");
        getContentPane().add(LtotDepre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 100, 30));

        LtotPer5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotPer5.setText("jLabel8");
        getContentPane().add(LtotPer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 110, 30));

        LsueLiqui5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsueLiqui5.setText("jLabel9");
        getContentPane().add(LsueLiqui5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 90, 30));

        Ldepart5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ldepart5.setText("jLabel10");
        getContentPane().add(Ldepart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 80, 30));

        LsuelBase6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsuelBase6.setText("jLabel11");
        getContentPane().add(LsuelBase6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 110, 30));

        LtotDepre6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotDepre6.setText("jLabel12");
        getContentPane().add(LtotDepre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 110, 30));

        LtotPer6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotPer6.setText("jLabel13");
        getContentPane().add(LtotPer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 110, 30));

        LsueLiqui6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsueLiqui6.setText("jLabel14");
        getContentPane().add(LsueLiqui6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 100, 30));

        Ldepart6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ldepart6.setText("jLabel15");
        getContentPane().add(Ldepart6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 80, 30));

        LsuelBase7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsuelBase7.setText("jLabel16");
        getContentPane().add(LsuelBase7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 110, 30));

        LtotDepre7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotDepre7.setText("jLabel17");
        getContentPane().add(LtotDepre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 110, 30));

        LtotPer7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotPer7.setText("jLabel18");
        getContentPane().add(LtotPer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 110, 30));

        LsueLiqui7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsueLiqui7.setText("jLabel19");
        getContentPane().add(LsueLiqui7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 100, 30));

        Ldepart7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ldepart7.setText("jLabel20");
        getContentPane().add(Ldepart7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 80, 30));

        LsuelBase8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(LsuelBase8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 110, 30));

        LtotDepre8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotDepre8.setText("jLabel22");
        getContentPane().add(LtotDepre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 110, 30));

        LtotPer8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotPer8.setText("jLabel23");
        getContentPane().add(LtotPer8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 110, 30));

        LsueLiqui8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsueLiqui8.setText("jLabel24");
        getContentPane().add(LsueLiqui8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 100, 30));

        Ldepart8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ldepart8.setText("jLabel25");
        getContentPane().add(Ldepart8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, 80, 30));

        LsuelBase9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsuelBase9.setText("jLabel26");
        getContentPane().add(LsuelBase9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 110, 30));

        LtotDepre9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotDepre9.setText("jLabel27");
        getContentPane().add(LtotDepre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 110, 30));

        LtotPer9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotPer9.setText("jLabel28");
        getContentPane().add(LtotPer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 110, 30));

        LsueLiqui9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsueLiqui9.setText("jLabel29");
        getContentPane().add(LsueLiqui9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 100, 30));

        Ldepart9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ldepart9.setText("jLabel30");
        getContentPane().add(Ldepart9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 70, 30));

        LsuelBase10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsuelBase10.setText("jLabel31");
        getContentPane().add(LsuelBase10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 110, 30));

        LtotDepre10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotDepre10.setText("jLabel32");
        getContentPane().add(LtotDepre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 110, 30));

        LtotPer10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LtotPer10.setText("jLabel33");
        getContentPane().add(LtotPer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 110, 30));

        LsueLiqui10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LsueLiqui10.setText("jLabel34");
        getContentPane().add(LsueLiqui10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 100, 30));

        Ldepart10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ldepart10.setText("jLabel35");
        getContentPane().add(Ldepart10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 70, 30));

        jLabel1.setText("Departamento 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 90, -1));

        jLabel2.setText("Departamento 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 90, 20));

        jLabel3.setText("Departamento 3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 90, -1));

        jLabel4.setText("Departamento 4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 90, -1));

        jLabel5.setText("Departamento 5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 90, -1));

        jLabel6.setText("Sueldo Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tnombre1ActionPerformed

    private void Tnombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre1KeyReleased
      String nombre1=Tnombre1.getText();
      int totalLiquido=0; 
      
       if(nombre1.equals("")==false && nombre1.matches("[a-zA-Z]*"))
       {
          for(int i =0; i<=2; i++)
          {
              numeroale[0][i]= 2000+(int)(Math.random()*5000);
              LsuelBase1.setText(" "+numeroale[0][0]);
              LtotDepre1.setText(" "+numeroale[0][1]);
              LtotPer1.setText(" "+numeroale[0][2]);    
          } 
          
            numeroale[0][3]= numeroale[0][0]-numeroale[0][1]+numeroale[0][2];
            LsueLiqui1.setText(" "+numeroale[0][3]);
              
              numeroale[0][4]= 1+(int)(Math.random()*5);
              Ldepart1.setText(" "+numeroale[0][4]);
              
       
                if(numeroale[0][4]==1)
                {
                      departa[0]=departa[0]+numeroale[0][3];  
                      Lmostrar1.setText(" "+departa[0]);
                } 
                if(numeroale[0][4]==2)
                {
                      departa[1]=departa[1]+numeroale[0][3];  
                      Lmostrar2.setText(" "+departa[1]);
                } 
                 if(numeroale[0][4]==3)
                {
                      departa[2]=departa[2]+numeroale[0][3];  
                      Lmostrar3.setText(" "+departa[2]);
                } 
                 if(numeroale[0][4]==4)
                {
                      departa[3]=departa[3]+numeroale[0][3];  
                      Lmostrar4.setText(" "+departa[3]);
                } 
                  if(numeroale[0][4]==5)
                {
                      departa[4]=departa[4]+numeroale[0][3];  
                      Lmostrar5.setText(" "+departa[4]);
                }
       }     
          
    }//GEN-LAST:event_Tnombre1KeyReleased

    private void Tnombre2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre2KeyReleased
      String nombre2=Tnombre2.getText();
      int totalLiquido2;
      
       if(nombre2.equals("")==false && nombre2.matches("[a-zA-Z]*"))
       {
          for(int i =0; i<=2; i++)
          {
              numeroale[1][i]= 2000+(int)(Math.random()*5000);
              LsuelBase2.setText(" "+numeroale[1][0]);
              LtotDepre2.setText(" "+numeroale[1][1]);
              LtotPer2.setText(" "+numeroale[1][2]);    
          } 
          
            numeroale[1][3]= numeroale[1][0]-numeroale[1][1]+numeroale[1][2];
            LsueLiqui2.setText(" "+numeroale[1][3]);
              
              numeroale[1][4]= 1+(int)(Math.random()*5);
              Ldepart2.setText(" "+numeroale[1][4]);
              
       
                if(numeroale[1][4]==1)
                {
                      departa[0]=departa[0]+numeroale[1][3];  
                      Lmostrar1.setText(" "+departa[0]);
                } 
                if(numeroale[1][4]==2)
                {
                      departa[1]=departa[1]+numeroale[1][3];  
                      Lmostrar2.setText(" "+departa[1]);
                } 
                 if(numeroale[1][4]==3)
                {
                      departa[2]=departa[2]+numeroale[1][3];  
                      Lmostrar3.setText(" "+departa[2]);
                } 
                 if(numeroale[1][4]==4)
                {
                      departa[3]=departa[3]+numeroale[1][3];  
                      Lmostrar4.setText(" "+departa[3]);
                } 
                  if(numeroale[1][4]==5)
                {
                      departa[4]=departa[4]+numeroale[1][3];  
                      Lmostrar5.setText(" "+departa[4]);
                }
       }     
    }//GEN-LAST:event_Tnombre2KeyReleased

    private void Ldepart1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Ldepart1KeyReleased
     
    }//GEN-LAST:event_Ldepart1KeyReleased

    private void Ldepart1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ldepart1MouseEntered

    }//GEN-LAST:event_Ldepart1MouseEntered

    private void Tnombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre2ActionPerformed
       
    }//GEN-LAST:event_Tnombre2ActionPerformed

    private void Tnombre3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre3KeyReleased
       String nombre3=Tnombre3.getText();
      int totalLiquido3;
      
       if(nombre3.equals("")==false && nombre3.matches("[a-zA-Z]*"))
       {
           for(int i =0; i<=2; i++)
          {
              numeroale[2][i]= 2000+(int)(Math.random()*5000);
              LsuelBase3.setText(" "+numeroale[2][0]);
              LtotDepre3.setText(" "+numeroale[2][1]);
              LtotPer3.setText(" "+numeroale[2][2]);    
          } 
          
            numeroale[2][3]= numeroale[2][0]-numeroale[2][1]+numeroale[2][2];
            LsueLiqui3.setText(" "+numeroale[2][3]);
              
              numeroale[2][4]= 1+(int)(Math.random()*5);
              Ldepart3.setText(" "+numeroale[2][4]);
              
       
                if(numeroale[2][4]==1)
                {
                      departa[0]=departa[0]+numeroale[2][3];  
                      Lmostrar1.setText(" "+departa[0]);
                } 
                if(numeroale[2][4]==2)
                {
                      departa[1]=departa[1]+numeroale[2][3];  
                      Lmostrar2.setText(" "+departa[1]);
                } 
                 if(numeroale[2][4]==3)
                {
                      departa[2]=departa[2]+numeroale[2][3];  
                      Lmostrar3.setText(" "+departa[2]);
                } 
                 if(numeroale[2][4]==4)
                {
                      departa[3]=departa[3]+numeroale[2][3];  
                      Lmostrar4.setText(" "+departa[3]);
                } 
                  if(numeroale[2][4]==5)
                {
                      departa[4]=departa[4]+numeroale[2][3];  
                      Lmostrar5.setText(" "+departa[4]);
                }
       }    
    }//GEN-LAST:event_Tnombre3KeyReleased

    private void Tnombre4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre4KeyReleased
      String nombre4=Tnombre4.getText();
      int totalLiquido=0; 
      
       if(nombre4.equals("")==false && nombre4.matches("[a-zA-Z]*"))
       {
           for(int i =0; i<=2; i++)
          {
              numeroale[3][i]= 2000+(int)(Math.random()*5000);
              LsuelBase4.setText(" "+numeroale[3][0]);
              LtotDepre4.setText(" "+numeroale[3][1]);
              LtotPer4.setText(" "+numeroale[3][2]);    
          } 
          
            numeroale[3][3]= numeroale[3][0]-numeroale[3][1]+numeroale[3][2];
            LsueLiqui4.setText(" "+numeroale[3][3]);
              
              numeroale[3][4]= 1+(int)(Math.random()*5);
              Ldepart4.setText(" "+numeroale[3][4]);
              
       
                if(numeroale[3][4]==1)
                {
                      departa[0]=departa[0]+numeroale[3][3];  
                      Lmostrar1.setText(" "+departa[0]);
                } 
                if(numeroale[3][4]==2)
                {
                      departa[1]=departa[1]+numeroale[3][3];  
                      Lmostrar2.setText(" "+departa[1]);
                } 
                 if(numeroale[3][4]==3)
                {
                      departa[2]=departa[2]+numeroale[3][3];  
                      Lmostrar3.setText(" "+departa[2]);
                } 
                 if(numeroale[3][4]==4)
                {
                      departa[3]=departa[3]+numeroale[3][3];  
                      Lmostrar4.setText(" "+departa[3]);
                } 
                  if(numeroale[3][4]==5)
                {
                      departa[4]=departa[4]+numeroale[3][3];  
                      Lmostrar5.setText(" "+departa[4]);
                }
       } 
    }//GEN-LAST:event_Tnombre4KeyReleased

    private void Tnombre5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre5KeyReleased
        String nombre5=Tnombre5.getText();
      int totalLiquido=0; 
      
       if(nombre5.equals("")==false && nombre5.matches("[a-zA-Z]*"))
       {
             for(int i =0; i<=2; i++)
          {
              numeroale[4][i]= 2000+(int)(Math.random()*5000);
              LsuelBase5.setText(" "+numeroale[4][0]);
              LtotDepre5.setText(" "+numeroale[4][1]);
              LtotPer5.setText(" "+numeroale[4][2]);    
          } 
          
            numeroale[4][3]= numeroale[4][0]-numeroale[4][1]+numeroale[4][2];
            LsueLiqui5.setText(" "+numeroale[4][3]);
              
              numeroale[4][4]= 1+(int)(Math.random()*5);
              Ldepart5.setText(" "+numeroale[4][4]);
              
       
                if(numeroale[4][4]==1)
                {
                      departa[0]=departa[0]+numeroale[4][3];  
                      Lmostrar1.setText(" "+departa[0]);
                } 
                if(numeroale[4][4]==2)
                {
                      departa[1]=departa[1]+numeroale[4][3];  
                      Lmostrar2.setText(" "+departa[1]);
                } 
                 if(numeroale[4][4]==3)
                {
                      departa[2]=departa[2]+numeroale[4][3];  
                      Lmostrar3.setText(" "+departa[2]);
                } 
                 if(numeroale[4][4]==4)
                {
                      departa[3]=departa[3]+numeroale[4][3];  
                      Lmostrar4.setText(" "+departa[3]);
                } 
                  if(numeroale[4][4]==5)
                {
                      departa[4]=departa[4]+numeroale[4][3];  
                      Lmostrar5.setText(" "+departa[4]);
                }
       } 
    }//GEN-LAST:event_Tnombre5KeyReleased

    private void Tnombre6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre6KeyReleased
      String nombre6=Tnombre6.getText();
      int totalLiquido=0; 
      
       if(nombre6.equals("")==false && nombre6.matches("[a-zA-Z]*"))
       {
             for(int i =0; i<=2; i++)
          {
              numeroale[5][i]= 2000+(int)(Math.random()*5000);
              LsuelBase6.setText(" "+numeroale[5][0]);
              LtotDepre6.setText(" "+numeroale[5][1]);
              LtotPer6.setText(" "+numeroale[5][2]);    
          } 
          
            numeroale[5][3]= numeroale[5][0]-numeroale[5][1]+numeroale[5][2];
            LsueLiqui6.setText(" "+numeroale[5][3]);
              
              numeroale[5][4]= 1+(int)(Math.random()*5);
              Ldepart6.setText(" "+numeroale[5][4]);
              
       
                if(numeroale[5][4]==1)
                {
                      departa[0]=departa[0]+numeroale[5][3];  
                      Lmostrar1.setText(" "+departa[0]);
                } 
                if(numeroale[5][4]==2)
                {
                      departa[1]=departa[1]+numeroale[5][3];  
                      Lmostrar2.setText(" "+departa[1]);
                } 
                 if(numeroale[5][4]==3)
                {
                      departa[2]=departa[2]+numeroale[5][3];  
                      Lmostrar3.setText(" "+departa[2]);
                } 
                 if(numeroale[5][4]==4)
                {
                      departa[3]=departa[3]+numeroale[5][3];  
                      Lmostrar4.setText(" "+departa[3]);
                } 
                  if(numeroale[5][4]==5)
                {
                      departa[4]=departa[4]+numeroale[5][3];  
                      Lmostrar5.setText(" "+departa[4]);
                }
       }
    }//GEN-LAST:event_Tnombre6KeyReleased

    private void Tnombre7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre7KeyReleased
     String nombre7=Tnombre7.getText();
      int totalLiquido=0; 
      
       if(nombre7.equals("")==false && nombre7.matches("[a-zA-Z]*"))
       {
              for(int i =0; i<=2; i++)
          {
              numeroale[6][i]= 2000+(int)(Math.random()*5000);
              LsuelBase7.setText(" "+numeroale[6][0]);
              LtotDepre7.setText(" "+numeroale[6][1]);
              LtotPer7.setText(" "+numeroale[6][2]);    
          } 
          
            numeroale[6][3]= numeroale[6][0]-numeroale[6][1]+numeroale[6][2];
            LsueLiqui7.setText(" "+numeroale[5][3]);
              
              numeroale[6][4]= 1+(int)(Math.random()*5);
              Ldepart7.setText(" "+numeroale[6][4]);
              
       
                if(numeroale[6][4]==1)
                {
                      departa[0]=departa[0]+numeroale[6][3];  
                      Lmostrar1.setText(" "+departa[0]);
                } 
                if(numeroale[6][4]==2)
                {
                      departa[1]=departa[1]+numeroale[6][3];  
                      Lmostrar2.setText(" "+departa[1]);
                } 
                 if(numeroale[6][4]==3)
                {
                      departa[2]=departa[2]+numeroale[6][3];  
                      Lmostrar3.setText(" "+departa[2]);
                } 
                 if(numeroale[6][4]==4)
                {
                      departa[3]=departa[3]+numeroale[6][3];  
                      Lmostrar4.setText(" "+departa[3]);
                } 
                  if(numeroale[6][4]==5)
                {
                      departa[4]=departa[4]+numeroale[6][3];  
                      Lmostrar5.setText(" "+departa[4]);
                }
       }
    }//GEN-LAST:event_Tnombre7KeyReleased

    private void Tnombre8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre8KeyReleased
      String nombre8=Tnombre8.getText();
      int totalLiquido=0; 
      
       if(nombre8.equals("")==false && nombre8.matches("[a-zA-Z]*"))
       {
              for(int i =0; i<=2; i++)
          {
              numeroale[7][i]= 2000+(int)(Math.random()*5000);
              LsuelBase8.setText(" "+numeroale[7][0]);
              LtotDepre8.setText(" "+numeroale[7][1]);
              LtotPer8.setText(" "+numeroale[7][2]);    
          } 
          
            numeroale[7][3]= numeroale[7][0]-numeroale[7][1]+numeroale[7][2];
            LsueLiqui8.setText(" "+numeroale[7][3]);
              
              numeroale[7][4]= 1+(int)(Math.random()*5);
              Ldepart8.setText(" "+numeroale[7][4]);
              
       
                if(numeroale[7][4]==1)
                {
                      departa[0]=departa[0]+numeroale[7][3];  
                      Lmostrar1.setText(" "+departa[0]);
                } 
                if(numeroale[7][4]==2)
                {
                      departa[1]=departa[1]+numeroale[7][3];  
                      Lmostrar2.setText(" "+departa[1]);
                } 
                 if(numeroale[7][4]==3)
                {
                      departa[2]=departa[2]+numeroale[7][3];  
                      Lmostrar3.setText(" "+departa[2]);
                } 
                 if(numeroale[7][4]==4)
                {
                      departa[3]=departa[3]+numeroale[7][3];  
                      Lmostrar4.setText(" "+departa[3]);
                } 
                  if(numeroale[7][4]==5)
                {
                      departa[4]=departa[4]+numeroale[7][3];  
                      Lmostrar5.setText(" "+departa[4]);
                }
       }
    }//GEN-LAST:event_Tnombre8KeyReleased

    private void Tnombre9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre9KeyReleased
      String nombre9=Tnombre9.getText();
      int totalLiquido=0; 
      
       if(nombre9.equals("")==false && nombre9.matches("[a-zA-Z]*"))
       {
          for(int i =0; i<=2; i++)
          {
              numeroale[8][i]= 2000+(int)(Math.random()*5000);
              LsuelBase9.setText(" "+numeroale[8][0]);
              LtotDepre9.setText(" "+numeroale[8][1]);
              LtotPer9.setText(" "+numeroale[8][2]);    
          } 
          
            numeroale[8][3]= numeroale[8][0]-numeroale[8][1]+numeroale[8][2];
            LsueLiqui9.setText(" "+numeroale[8][3]);
              
              numeroale[8][4]= 1+(int)(Math.random()*5);
              Ldepart9.setText(" "+numeroale[8][4]);
              
       
                if(numeroale[8][4]==1)
                {
                      departa[0]=departa[0]+numeroale[8][3];  
                      Lmostrar1.setText(" "+departa[0]);
                } 
                if(numeroale[8][4]==2)
                {
                      departa[1]=departa[1]+numeroale[8][3];  
                      Lmostrar2.setText(" "+departa[1]);
                } 
                 if(numeroale[8][4]==3)
                {
                      departa[2]=departa[2]+numeroale[8][3];  
                      Lmostrar3.setText(" "+departa[2]);
                } 
                 if(numeroale[8][4]==4)
                {
                      departa[3]=departa[3]+numeroale[8][3];  
                      Lmostrar4.setText(" "+departa[3]);
                } 
                  if(numeroale[8][4]==5)
                {
                      departa[4]=departa[4]+numeroale[8][3];  
                      Lmostrar5.setText(" "+departa[4]);
                }
       }  
    }//GEN-LAST:event_Tnombre9KeyReleased

    private void Tnombre10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre10KeyReleased
      String nombre10=Tnombre10.getText();
      int totalLiquido=0; 
      
       if(nombre10.equals("")==false && nombre10.matches("[a-zA-Z]*"))
       {
          for(int i =0; i<=2; i++)
          {
              numeroale[9][i]= 2000+(int)(Math.random()*5000);
              LsuelBase10.setText(" "+numeroale[9][0]);
              LtotDepre10.setText(" "+numeroale[9][1]);
              LtotPer10.setText(" "+numeroale[9][2]);    
          } 
          
            numeroale[9][3]= numeroale[9][0]-numeroale[9][1]+numeroale[9][2];
            LsueLiqui10.setText(" "+numeroale[9][3]);
              
              numeroale[9][4]= 1+(int)(Math.random()*5);
              Ldepart10.setText(" "+numeroale[9][4]);
              
       
                if(numeroale[9][4]==1)
                {
                      departa[0]=departa[0]+numeroale[9][3];  
                      Lmostrar1.setText(" "+departa[0]);
                } 
                if(numeroale[9][4]==2)
                {
                      departa[1]=departa[1]+numeroale[9][3];  
                      Lmostrar2.setText(" "+departa[1]);
                } 
                 if(numeroale[9][4]==3)
                {
                      departa[2]=departa[2]+numeroale[9][3];  
                      Lmostrar3.setText(" "+departa[2]);
                } 
                 if(numeroale[9][4]==4)
                {
                      departa[3]=departa[3]+numeroale[9][3];  
                      Lmostrar4.setText(" "+departa[3]);
                } 
                  if(numeroale[9][4]==5)
                {
                      departa[4]=departa[4]+numeroale[9][3];  
                      Lmostrar5.setText(" "+departa[4]);
                }
       }
    }//GEN-LAST:event_Tnombre10KeyReleased

    
    
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
            java.util.logging.Logger.getLogger(Lab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LTituloPlanilla;
    private javax.swing.JLabel Ldepart1;
    private javax.swing.JLabel Ldepart10;
    private javax.swing.JLabel Ldepart2;
    private javax.swing.JLabel Ldepart3;
    private javax.swing.JLabel Ldepart4;
    private javax.swing.JLabel Ldepart5;
    private javax.swing.JLabel Ldepart6;
    private javax.swing.JLabel Ldepart7;
    private javax.swing.JLabel Ldepart8;
    private javax.swing.JLabel Ldepart9;
    private javax.swing.JLabel Lmostrar1;
    private javax.swing.JLabel Lmostrar2;
    private javax.swing.JLabel Lmostrar3;
    private javax.swing.JLabel Lmostrar4;
    private javax.swing.JLabel Lmostrar5;
    private javax.swing.JLabel LsueLiqui1;
    private javax.swing.JLabel LsueLiqui10;
    private javax.swing.JLabel LsueLiqui2;
    private javax.swing.JLabel LsueLiqui3;
    private javax.swing.JLabel LsueLiqui4;
    private javax.swing.JLabel LsueLiqui5;
    private javax.swing.JLabel LsueLiqui6;
    private javax.swing.JLabel LsueLiqui7;
    private javax.swing.JLabel LsueLiqui8;
    private javax.swing.JLabel LsueLiqui9;
    private javax.swing.JLabel LsuelBase1;
    private javax.swing.JLabel LsuelBase10;
    private javax.swing.JLabel LsuelBase2;
    private javax.swing.JLabel LsuelBase3;
    private javax.swing.JLabel LsuelBase4;
    private javax.swing.JLabel LsuelBase5;
    private javax.swing.JLabel LsuelBase6;
    private javax.swing.JLabel LsuelBase7;
    private javax.swing.JLabel LsuelBase8;
    private javax.swing.JLabel LsuelBase9;
    private javax.swing.JLabel LtituloDepart;
    private javax.swing.JLabel LtituloNom;
    private javax.swing.JLabel LtituloSuelBa;
    private javax.swing.JLabel LtituloSuelLiqui;
    private javax.swing.JLabel LtituloTotDep;
    private javax.swing.JLabel LtituloTotPer;
    private javax.swing.JLabel LtotDepre1;
    private javax.swing.JLabel LtotDepre10;
    private javax.swing.JLabel LtotDepre2;
    private javax.swing.JLabel LtotDepre3;
    private javax.swing.JLabel LtotDepre4;
    private javax.swing.JLabel LtotDepre5;
    private javax.swing.JLabel LtotDepre6;
    private javax.swing.JLabel LtotDepre7;
    private javax.swing.JLabel LtotDepre8;
    private javax.swing.JLabel LtotDepre9;
    private javax.swing.JLabel LtotPer1;
    private javax.swing.JLabel LtotPer10;
    private javax.swing.JLabel LtotPer2;
    private javax.swing.JLabel LtotPer3;
    private javax.swing.JLabel LtotPer4;
    private javax.swing.JLabel LtotPer5;
    private javax.swing.JLabel LtotPer6;
    private javax.swing.JLabel LtotPer7;
    private javax.swing.JLabel LtotPer8;
    private javax.swing.JLabel LtotPer9;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
