/*
 Karen Roxana Roldán Hernandez 0901-17-63
 */
package laboratorio2;

public class laboratorio2 extends javax.swing.JFrame {

int[][] numeroale= new int[10][10];
int[] departa = new int[5];
int[] ISR = new int[10];
   
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
        Label = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        Ltitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Ltitulo.setText("PLANILLA");

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

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel2.setText("Sueldo Base");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel3.setText("Bonificaciones");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel4.setText("Comisiones");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel5.setText("IGSS");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel6.setText("Descuento Judicial");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel7.setText("ISR Total");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel8.setText("Sueldo Liquido");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel9.setText("Departamento");

        Ltotal1.setText("jLabel10");

        Ltotal2.setText("jLabel11");

        Ltotal3.setText("jLabel12");

        Ltotal4.setText("jLabel13");

        Ltotal5.setText("jLabel14");

        Label.setText("jLabel10");

        Tnombre2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre2ActionPerformed(evt);
            }
        });

        Tnombre3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre3ActionPerformed(evt);
            }
        });

        Tnombre4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre4ActionPerformed(evt);
            }
        });

        Tnombre5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre5ActionPerformed(evt);
            }
        });

        Tnombre6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre6ActionPerformed(evt);
            }
        });

        Tnombre7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre7ActionPerformed(evt);
            }
        });

        Tnombre8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre8ActionPerformed(evt);
            }
        });

        Tnombre9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre9.setText("jTextField8");
        Tnombre9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre9ActionPerformed(evt);
            }
        });

        Tnombre10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Tnombre10.setText("jTextField9");

        Lsuelbase2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lsuelbase3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lsuelbase4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lsuelbase5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lsuelbase6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lsuelbase7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lsuelbase8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lsuelbase9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lsuelbase10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lboni2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lboni3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lboni4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lboni5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lboni6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lboni7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lboni8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lboni9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lboni10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lcomi2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lcomi3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lcomi4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lcomi5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lcomi6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lcomi7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lcomi8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lcomi9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Lcomi10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Ligss2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ligss3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ligss4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ligss5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ligss6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ligss7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ligss8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ligss9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ligss10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ldescjudi2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi2.setToolTipText("");

        Ldescjudi3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi3.setToolTipText("");

        Ldescjudi4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi4.setToolTipText("");

        Ldescjudi5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi5.setToolTipText("");

        Ldescjudi6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi6.setToolTipText("");

        Ldescjudi7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi7.setToolTipText("");

        Ldescjudi8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi8.setToolTipText("");

        Ldescjudi9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi9.setToolTipText("");

        Ldescjudi10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Ldescjudi10.setToolTipText("");

        Lisrtotal2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal2.setToolTipText("");

        Lisrtotal3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal3.setToolTipText("");

        Lisrtotal4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal4.setToolTipText("");

        Lisrtotal5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal5.setToolTipText("");

        Lisrtotal6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal6.setToolTipText("");

        Lisrtotal7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal7.setToolTipText("");

        Lisrtotal8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal8.setToolTipText("");

        Lisrtotal9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal9.setToolTipText("");

        Lisrtotal10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lisrtotal10.setToolTipText("");

        Lsueliqui2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui2.setToolTipText("");

        Lsueliqui3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui3.setToolTipText("");

        Lsueliqui4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui4.setToolTipText("");

        Lsueliqui5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui5.setToolTipText("");

        Lsueliqui6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui6.setToolTipText("");

        Lsueliqui7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui7.setToolTipText("");

        Lsueliqui8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui8.setToolTipText("");

        Lsueliqui9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui9.setToolTipText("");

        Lsueliqui10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Lsueliqui10.setToolTipText("");

        Ldepar2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ldepar3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ldepar4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ldepar5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ldepar6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ldepar7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ldepar8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ldepar9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        Ldepar10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Label)
                                        .addGap(175, 175, 175))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lsuelbase1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lboni1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lsuelbase2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lboni2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lboni3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lboni4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lboni5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lboni6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lboni7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lboni8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lboni9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lboni10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Tnombre10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(Tnombre9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tnombre8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tnombre7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tnombre6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tnombre5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tnombre4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tnombre3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Lsuelbase3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lsuelbase4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lsuelbase5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lsuelbase6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lsuelbase7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lsuelbase8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lsuelbase9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lsuelbase10, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Lcomi7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lcomi10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Lcomi1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Lcomi8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(Lcomi6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Lcomi5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Lcomi4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Lcomi3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Lcomi2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Ligss10, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(Ligss7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Ligss3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Ligss4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Ligss5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Ligss6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Ligss8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Ligss9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Ligss2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Ligss1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                            .addComponent(Ltotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Ldescjudi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Ldescjudi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Ldescjudi5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Ldescjudi8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Ldescjudi9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Ldescjudi10, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                .addComponent(Ldescjudi6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Ldescjudi7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(Ldescjudi2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(Ltotal4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Ldescjudi1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addComponent(Ltotal5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(Ltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ltotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lcomi9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 348, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lisrtotal1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(Lisrtotal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lisrtotal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lisrtotal4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lisrtotal5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lisrtotal6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lisrtotal7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lisrtotal8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lisrtotal9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lisrtotal10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(Lsueliqui1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ldepar1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lsueliqui6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lsueliqui5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lsueliqui4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lsueliqui3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lsueliqui10, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(Lsueliqui2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lsueliqui7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lsueliqui8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lsueliqui9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ldepar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ldepar3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ldepar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ldepar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ldepar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ldepar7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ldepar8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ldepar9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ldepar10, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lboni1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lsuelbase1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lcomi1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ligss1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Lsueliqui1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ldepar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lisrtotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ldescjudi1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ldepar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Ldescjudi2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lisrtotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lsueliqui2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lsuelbase2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lboni2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lcomi2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ligss2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lboni3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lcomi3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ligss3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ldescjudi3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lisrtotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lsueliqui3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ldepar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tnombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lsuelbase3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lboni4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lcomi4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ligss4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldescjudi4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lisrtotal4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lsueliqui4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldepar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tnombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lsuelbase4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lcomi5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ligss5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lisrtotal5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lsueliqui5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldepar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tnombre5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lsuelbase5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lboni5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ldescjudi5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lboni6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(Lcomi6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ligss6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ldescjudi6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lisrtotal6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Tnombre6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lsuelbase6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lboni7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(Ligss7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ldescjudi7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lisrtotal7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Tnombre7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lsuelbase7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lcomi7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lsueliqui7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ldepar7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lsueliqui6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ldepar6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ligss8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tnombre8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lsuelbase8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lboni8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lcomi8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ldescjudi8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lisrtotal8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lsueliqui8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ldepar8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lboni9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lcomi9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ligss9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldescjudi9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lisrtotal9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lsueliqui9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldepar9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lsuelbase9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Tnombre9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ldepar10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Lsueliqui10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lisrtotal10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Ldescjudi10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Lsuelbase10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Lboni10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Ligss10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Ltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Ltotal4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Ltotal5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Ltotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lcomi10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(Ltotal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tnombre10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre1ActionPerformed
       
        String nombre1=Tnombre1.getText();
       if(nombre1.equals("")==false && nombre1.matches("[a-zA-Z]*"))
       {
        for(int i=0; i<=5;i++)
        {    
            numeroale[0][i]=2000+(int)(Math.random()*5000);
            Lsuelbase1.setText(""+numeroale[0][0]);
            Lboni1.setText(""+numeroale[0][1]);
            Lcomi1.setText(""+numeroale[0][2]);
            Ligss1.setText(""+numeroale[0][3]);
            Ldescjudi1.setText(""+numeroale[0][4]);                
        }
           if(numeroale[0][0]>=2600 || numeroale[0][0]<=5000)
        {
            ISR[0]=(int) (numeroale[0][0]*0.03);
            Lisrtotal1.setText(""+ISR[0]);
        }   
           
            numeroale[0][5]=numeroale[0][0]+numeroale[0][1]+numeroale[0][2]-numeroale[0][3]-numeroale[0][4]-ISR[0];
            Lsueliqui1.setText(""+numeroale[0][5]);
        
            numeroale[0][6]=1+(int)(Math.random()*5);
            Ldepar1.setText(""+numeroale[0][6]);
            
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

    private void Tnombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tnombre1KeyReleased
       
    }//GEN-LAST:event_Tnombre1KeyReleased

    private void Tnombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre2ActionPerformed
       String nombre2=Tnombre2.getText();
       if(nombre2.equals("")==false && nombre2.matches("[a-zA-Z]*"))
       {
        for(int i=0; i<=5;i++)
        {    
            numeroale[1][i]=2000+(int)(Math.random()*5000);
            Lsuelbase2.setText(""+numeroale[1][0]);
            Lboni2.setText(""+numeroale[1][1]);
            Lcomi2.setText(""+numeroale[1][2]);
            Ligss2.setText(""+numeroale[1][3]);
            Ldescjudi2.setText(""+numeroale[1][4]);                
        }
           if(numeroale[1][0]>=2600 || numeroale[1][0]<=5000)
        {
            ISR[1]=(int) (numeroale[1][0]*0.03);
            Lisrtotal2.setText(""+ISR[1]);
        }   
           
            numeroale[1][5]=numeroale[1][0]+numeroale[1][1]+numeroale[1][2]-numeroale[1][3]-numeroale[1][4]-ISR[1];
            Lsueliqui2.setText(""+numeroale[1][5]);
        
            numeroale[1][6]=1+(int)(Math.random()*5);
            Ldepar2.setText(""+numeroale[1][6]);
            
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

    private void Tnombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre4ActionPerformed
     String nombre4=Tnombre4.getText();
       if(nombre4.equals("")==false && nombre4.matches("[a-zA-Z]*"))
       {
        for(int i=0; i<=5;i++)
        {    
            numeroale[3][i]=2000+(int)(Math.random()*5000);
            Lsuelbase4.setText(""+numeroale[3][0]);
            Lboni4.setText(""+numeroale[3][1]);
            Lcomi4.setText(""+numeroale[3][2]);
            Ligss4.setText(""+numeroale[3][3]);
            Ldescjudi4.setText(""+numeroale[3][4]);                
        }
           if(numeroale[3][0]>=2600 || numeroale[3][0]<=5000)
        {
            ISR[3]=(int) (numeroale[3][0]*0.03);
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
        for(int i=0; i<=5;i++)
        {    
            numeroale[2][i]=2000+(int)(Math.random()*5000);
            Lsuelbase3.setText(""+numeroale[2][0]);
            Lboni3.setText(""+numeroale[2][1]);
            Lcomi3.setText(""+numeroale[2][2]);
            Ligss3.setText(""+numeroale[2][3]);
            Ldescjudi3.setText(""+numeroale[2][4]);                
        }
           if(numeroale[2][0]>=2600 || numeroale[2][0]<=5000)
        {
            ISR[2]=(int) (numeroale[2][0]*0.03);
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

    private void Tnombre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre5ActionPerformed
      String nombre5=Tnombre5.getText();
       if(nombre5.equals("")==false && nombre5.matches("[a-zA-Z]*"))
       {
        for(int i=0; i<=5;i++)
        {    
            numeroale[4][i]=2000+(int)(Math.random()*5000);
            Lsuelbase5.setText(""+numeroale[4][0]);
            Lboni5.setText(""+numeroale[4][1]);
            Lcomi5.setText(""+numeroale[4][2]);
            Ligss5.setText(""+numeroale[4][3]);
            Ldescjudi5.setText(""+numeroale[4][4]);                
        }
           if(numeroale[4][0]>=2600 || numeroale[4][0]<=5000)
        {
            ISR[4]=(int) (numeroale[4][0]*0.03);
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

    private void Tnombre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tnombre6ActionPerformed
       String nombre6=Tnombre6.getText();
       if(nombre6.equals("")==false && nombre6.matches("[a-zA-Z]*"))
       {
        for(int i=0; i<=5;i++)
        {    
            numeroale[5][i]=2000+(int)(Math.random()*5000);
            Lsuelbase6.setText(""+numeroale[5][0]);
            Lboni6.setText(""+numeroale[5][1]);
            Lcomi6.setText(""+numeroale[5][2]);
            Ligss6.setText(""+numeroale[5][3]);
            Ldescjudi6.setText(""+numeroale[5][4]);                
        }
           if(numeroale[5][0]>=2600 || numeroale[5][0]<=5000)
        {
            ISR[5]=(int) (numeroale[5][0]*0.03);
            Lisrtotal6.setText(""+ISR[5]);
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
    }//GEN-LAST:event_Tnombre9ActionPerformed

    
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
    private javax.swing.JLabel Label;
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
