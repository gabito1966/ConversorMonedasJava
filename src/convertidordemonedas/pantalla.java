package convertidordemonedas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.awt.Dimension;

public class pantalla extends javax.swing.JFrame {

    int con = 0;

    public pantalla() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setMinimumSize(new Dimension(800, 450));
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruOpciones = new javax.swing.ButtonGroup();
        btnConvertir = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtConvertir1 = new javax.swing.JTextField();
        txtConvertir2 = new javax.swing.JTextField();
        txtConvertir3 = new javax.swing.JTextField();
        txtConvertir4 = new javax.swing.JTextField();
        txtConvertir5 = new javax.swing.JTextField();
        txtConvertir6 = new javax.swing.JTextField();
        txtConvertir7 = new javax.swing.JTextField();
        txtConvertir8 = new javax.swing.JTextField();
        txtConvertir9 = new javax.swing.JTextField();
        txtConvertir10 = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        lblConvertir1 = new javax.swing.JLabel();
        lblConvertir2 = new javax.swing.JLabel();
        lblConvertir3 = new javax.swing.JLabel();
        lblConvertir4 = new javax.swing.JLabel();
        lblConvertir5 = new javax.swing.JLabel();
        lblConvertir6 = new javax.swing.JLabel();
        lblConvertir7 = new javax.swing.JLabel();
        lblConvertir8 = new javax.swing.JLabel();
        lblConvertir9 = new javax.swing.JLabel();
        lblConvertir10 = new javax.swing.JLabel();
        rbtARS = new javax.swing.JRadioButton();
        rbtUSD = new javax.swing.JRadioButton();
        rbtEUR = new javax.swing.JRadioButton();
        rbtGBP = new javax.swing.JRadioButton();
        rbtBRL = new javax.swing.JRadioButton();
        rbtPYG = new javax.swing.JRadioButton();
        rbtCOP = new javax.swing.JRadioButton();
        rbtUYU = new javax.swing.JRadioButton();
        rbtMXN = new javax.swing.JRadioButton();
        rbtKRW = new javax.swing.JRadioButton();
        rbtJPY = new javax.swing.JRadioButton();
        lblOpciones = new javax.swing.JLabel();
        lblDesarrollador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        btnConvertir.setBackground(new java.awt.Color(255, 255, 51));
        btnConvertir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnConvertir.setText("Convertir Cantidad");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCantidad.setText("Cantidad a Convertir");

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTitulo.setText("Conversor de Monedas: ARS, USD, EUR, GBP,BRL, PYG, COP, UYU, MXN, KRW, JPY");

        btnBorrar.setBackground(new java.awt.Color(255, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar Valor");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 204));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtConvertir1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtConvertir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConvertir1ActionPerformed(evt);
            }
        });

        txtConvertir2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtConvertir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConvertir2ActionPerformed(evt);
            }
        });

        txtConvertir3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtConvertir4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtConvertir5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtConvertir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConvertir5ActionPerformed(evt);
            }
        });

        txtConvertir6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtConvertir7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtConvertir8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtConvertir9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtConvertir10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lblResultado.setBackground(new java.awt.Color(0, 102, 51));
        lblResultado.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 153, 0));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Resultados");

        lblConvertir1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConvertir1.setText("Tipo");

        lblConvertir2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConvertir2.setText("Tipo");

        lblConvertir3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConvertir3.setText("Tipo");

        lblConvertir4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConvertir4.setText("Tipo");

        lblConvertir5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConvertir5.setText("Tipo");

        lblConvertir6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConvertir6.setText("Tipo");

        lblConvertir7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConvertir7.setText("Tipo");

        lblConvertir8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConvertir8.setText("Tipo");

        lblConvertir9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConvertir9.setText("Tipo");

        lblConvertir10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConvertir10.setText("Tipo");

        rbtARS.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtARS);
        rbtARS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtARS.setForeground(new java.awt.Color(0, 0, 204));
        rbtARS.setText("ARS");
        rbtARS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rbtUSD.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtUSD);
        rbtUSD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtUSD.setForeground(new java.awt.Color(0, 0, 204));
        rbtUSD.setText("USD");
        rbtUSD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rbtEUR.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtEUR);
        rbtEUR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtEUR.setForeground(new java.awt.Color(0, 0, 204));
        rbtEUR.setText("EUR");
        rbtEUR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rbtGBP.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtGBP);
        rbtGBP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtGBP.setForeground(new java.awt.Color(0, 0, 204));
        rbtGBP.setText("GBP");
        rbtGBP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rbtBRL.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtBRL);
        rbtBRL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtBRL.setForeground(new java.awt.Color(0, 0, 204));
        rbtBRL.setText("BRL");
        rbtBRL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rbtPYG.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtPYG);
        rbtPYG.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtPYG.setForeground(new java.awt.Color(0, 0, 204));
        rbtPYG.setText("PYG");
        rbtPYG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rbtCOP.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtCOP);
        rbtCOP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtCOP.setForeground(new java.awt.Color(0, 0, 204));
        rbtCOP.setText("COP");
        rbtCOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rbtUYU.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtUYU);
        rbtUYU.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtUYU.setForeground(new java.awt.Color(0, 0, 204));
        rbtUYU.setText("UYU");
        rbtUYU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rbtMXN.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtMXN);
        rbtMXN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtMXN.setForeground(new java.awt.Color(0, 0, 204));
        rbtMXN.setText("MXN");
        rbtMXN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rbtKRW.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtKRW);
        rbtKRW.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtKRW.setForeground(new java.awt.Color(0, 0, 204));
        rbtKRW.setText("KRW");
        rbtKRW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rbtJPY.setBackground(new java.awt.Color(255, 255, 204));
        gruOpciones.add(rbtJPY);
        rbtJPY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtJPY.setForeground(new java.awt.Color(0, 0, 204));
        rbtJPY.setText("JPY");
        rbtJPY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblOpciones.setBackground(new java.awt.Color(0, 0, 0));
        lblOpciones.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblOpciones.setForeground(new java.awt.Color(0, 0, 153));
        lblOpciones.setText("Opciones de cambio");

        lblDesarrollador.setBackground(new java.awt.Color(0, 0, 204));
        lblDesarrollador.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDesarrollador.setForeground(new java.awt.Color(0, 0, 102));
        lblDesarrollador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesarrollador.setText("Desarrollado por Gabriel Jorge Garcia - 2022");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblDesarrollador, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(129, 129, 129)
                                            .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(txtConvertir6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txtConvertir7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(lblConvertir7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblConvertir8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtConvertir8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addGap(6, 6, 6)
                                                                    .addComponent(lblConvertir1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(lblConvertir6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(lblConvertir2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addGap(6, 6, 6)
                                                            .addComponent(txtConvertir1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(txtConvertir2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblConvertir3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtConvertir3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(lblResultado, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtConvertir9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtConvertir10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtConvertir4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtConvertir5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblConvertir9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lblConvertir10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblConvertir4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lblConvertir5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOpciones)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtUSD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtEUR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtGBP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtBRL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtPYG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtCOP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtUYU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtMXN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtJPY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtKRW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtARS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOpciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConvertir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConvertir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConvertir3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConvertir4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConvertir5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConvertir1)
                            .addComponent(lblConvertir2)
                            .addComponent(lblConvertir3)
                            .addComponent(lblConvertir4)
                            .addComponent(lblConvertir5))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtConvertir6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtConvertir7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtConvertir8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtConvertir9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtConvertir10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConvertir6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblConvertir8)
                                .addComponent(lblConvertir9)
                                .addComponent(lblConvertir10)
                                .addComponent(lblConvertir7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConvertir)
                            .addComponent(btnBorrar)
                            .addComponent(btnSalir))
                        .addGap(49, 49, 49)
                        .addComponent(lblDesarrollador))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtARS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtUSD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtEUR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtGBP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtBRL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtPYG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtCOP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtUYU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtMXN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtKRW)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtJPY)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        double ARS, USD, EUR, GBP, BRL, PYG, COP, UYU, MXN, KRW, JPY;
        DecimalFormat formato = new DecimalFormat("####.##");
        if (!txtCantidad.getText().equals("")) {

            btnBorrar.setEnabled(true);
            if (rbtARS.isSelected()) {
                ARS = Float.parseFloat(txtCantidad.getText());
                USD = ARS * 0.00816;
                EUR = ARS * 0.00786;
                GBP = ARS * 0.00674;
                BRL = ARS * 0.0418;
                PYG = ARS * 56.21;
                COP = ARS * 32.47;
                UYU = ARS * 0.3238;
                MXN = ARS * 0.1678;
                KRW = ARS * 10.55;
                JPY = ARS * 1.0999;
                txtConvertir1.setText(String.valueOf(formato.format(USD)));
                lblConvertir1.setText("Dolares");
                txtConvertir2.setText(String.valueOf(formato.format(EUR)));
                lblConvertir2.setText("Euros");
                txtConvertir3.setText(String.valueOf(formato.format(GBP)));
                lblConvertir3.setText("Libras Esterlinas");
                txtConvertir4.setText(String.valueOf(formato.format(BRL)));
                lblConvertir4.setText("Reales");
                txtConvertir5.setText(String.valueOf(formato.format(PYG)));
                lblConvertir5.setText("Guaranies");
                txtConvertir6.setText(String.valueOf(formato.format(COP)));
                lblConvertir6.setText("Pesos Colombianos");
                txtConvertir7.setText(String.valueOf(formato.format(UYU)));
                lblConvertir7.setText("Pesos Uruguayos");
                txtConvertir8.setText(String.valueOf(formato.format(MXN)));
                lblConvertir8.setText("Pesos Mexicanos");
                txtConvertir9.setText(String.valueOf(formato.format(KRW)));
                lblConvertir9.setText("Won SurCorea");
                txtConvertir10.setText(String.valueOf(formato.format(JPY)));
                lblConvertir10.setText("Yen Japon");
            } else if (rbtUSD.isSelected()) {
                USD = Float.parseFloat(txtCantidad.getText());
                ARS = USD * 122.48;
                EUR = USD * 0.96;
                GBP = USD * 0.83;
                BRL = USD * 5.13;
                PYG = USD * 6873.03;
                COP = USD * 3982.76;
                UYU = USD * 40.02;
                MXN = USD * 20.67;
                KRW = USD * 1291.29;
                JPY = USD * 134.94;
                txtConvertir1.setText(String.valueOf(formato.format(ARS)));
                lblConvertir1.setText("Pesos Argentinos");
                txtConvertir2.setText(String.valueOf(formato.format(EUR)));
                lblConvertir2.setText("Euros");
                txtConvertir3.setText(String.valueOf(formato.format(GBP)));
                lblConvertir3.setText("Libras Esterlinas");
                txtConvertir4.setText(String.valueOf(formato.format(BRL)));
                lblConvertir4.setText("Reales");
                txtConvertir5.setText(String.valueOf(formato.format(PYG)));
                lblConvertir5.setText("Guaranies");
                txtConvertir6.setText(String.valueOf(formato.format(COP)));
                lblConvertir6.setText("Pesos Colombianos");
                txtConvertir7.setText(String.valueOf(formato.format(UYU)));
                lblConvertir7.setText("Pesos Uruguayos");
                txtConvertir8.setText(String.valueOf(formato.format(MXN)));
                lblConvertir8.setText("Pesos Mexicanos");
                txtConvertir9.setText(String.valueOf(formato.format(KRW)));
                lblConvertir9.setText("Won SurCorea");
                txtConvertir10.setText(String.valueOf(formato.format(JPY)));
                lblConvertir10.setText("Yen Japon");
            } else if (rbtEUR.isSelected()) {
                EUR = Float.parseFloat(txtCantidad.getText());
                ARS = EUR * 127.53;
                USD = EUR * 1.04;
                GBP = EUR * 0.87;
                BRL = EUR * 5.34;
                PYG = EUR * 7156.66;
                COP = EUR * 4147.12;
                UYU = EUR * 41.67;
                MXN = EUR * 21.52;
                KRW = EUR * 1344.58;
                JPY = EUR * 140.51;
                txtConvertir1.setText(String.valueOf(formato.format(ARS)));
                lblConvertir1.setText("Pesos Argentinos");
                txtConvertir2.setText(String.valueOf(formato.format(USD)));
                lblConvertir2.setText("Dolares");
                txtConvertir3.setText(String.valueOf(formato.format(GBP)));
                lblConvertir3.setText("Libras Esterlinas");
                txtConvertir4.setText(String.valueOf(formato.format(BRL)));
                lblConvertir4.setText("Reales");
                txtConvertir5.setText(String.valueOf(formato.format(PYG)));
                lblConvertir5.setText("Guaranies");
                txtConvertir6.setText(String.valueOf(formato.format(COP)));
                lblConvertir6.setText("Pesos Colombianos");
                txtConvertir7.setText(String.valueOf(formato.format(UYU)));
                lblConvertir7.setText("Pesos Uruguayos");
                txtConvertir8.setText(String.valueOf(formato.format(MXN)));
                lblConvertir8.setText("Pesos Mexicanos");
                txtConvertir9.setText(String.valueOf(formato.format(KRW)));
                lblConvertir9.setText("Won SurCorea");
                txtConvertir10.setText(String.valueOf(formato.format(JPY)));
                lblConvertir10.setText("Yen Japon");
            } else if (rbtGBP.isSelected()) {
                GBP = Float.parseFloat(txtCantidad.getText());
                ARS = GBP * 146.99;
                USD = GBP * 1.20;
                EUR = GBP * 1.15;
                BRL = GBP * 6.16;
                PYG = GBP * 8248.67;
                COP = GBP * 4779.91;
                UYU = GBP * 48.03;
                MXN = GBP * 24.81;
                KRW = GBP * 1549.74;
                JPY = GBP * 161.95;
                txtConvertir1.setText(String.valueOf(formato.format(ARS)));
                lblConvertir1.setText("Pesos Argentinos");
                txtConvertir2.setText(String.valueOf(formato.format(USD)));
                lblConvertir2.setText("Dolares");
                txtConvertir3.setText(String.valueOf(formato.format(EUR)));
                lblConvertir3.setText("Euros");
                txtConvertir4.setText(String.valueOf(formato.format(BRL)));
                lblConvertir4.setText("Reales");
                txtConvertir5.setText(String.valueOf(formato.format(PYG)));
                lblConvertir5.setText("Guaranies");
                txtConvertir6.setText(String.valueOf(formato.format(COP)));
                lblConvertir6.setText("Pesos Colombianos");
                txtConvertir7.setText(String.valueOf(formato.format(UYU)));
                lblConvertir7.setText("Pesos Uruguayos");
                txtConvertir8.setText(String.valueOf(formato.format(MXN)));
                lblConvertir8.setText("Pesos Mexicanos");
                txtConvertir9.setText(String.valueOf(formato.format(KRW)));
                lblConvertir9.setText("Won SurCorea");
                txtConvertir10.setText(String.valueOf(formato.format(JPY)));
                lblConvertir10.setText("Yen Japon");
            } else if (rbtBRL.isSelected()) {
                BRL = Float.parseFloat(txtCantidad.getText());
                ARS = BRL * 23.8669;
                USD = BRL * 0.1949;
                EUR = BRL * 0.1871;
                GBP = BRL * 0.1624;
                PYG = BRL * 1339.30;
                COP = BRL * 776.0942;
                UYU = BRL * 7.80;
                MXN = BRL * 4.03;
                KRW = BRL * 251.63;
                JPY = BRL * 26.47228;
                txtConvertir1.setText(String.valueOf(formato.format(ARS)));
                lblConvertir1.setText("Pesos Argentinos");
                txtConvertir2.setText(String.valueOf(formato.format(USD)));
                lblConvertir2.setText("Dolares");
                txtConvertir3.setText(String.valueOf(formato.format(EUR)));
                lblConvertir3.setText("Euros");
                txtConvertir4.setText(String.valueOf(formato.format(GBP)));
                lblConvertir4.setText("Libras Esterlinas");
                txtConvertir5.setText(String.valueOf(formato.format(PYG)));
                lblConvertir5.setText("Guaranies");
                txtConvertir6.setText(String.valueOf(formato.format(COP)));
                lblConvertir6.setText("Pesos Colombianos");
                txtConvertir7.setText(String.valueOf(formato.format(UYU)));
                lblConvertir7.setText("Pesos Uruguayos");
                txtConvertir8.setText(String.valueOf(formato.format(MXN)));
                lblConvertir8.setText("Pesos Mexicanos");
                txtConvertir9.setText(String.valueOf(formato.format(KRW)));
                lblConvertir9.setText("Won SurCorea");
                txtConvertir10.setText(String.valueOf(formato.format(JPY)));
                lblConvertir10.setText("Yen Japon");
            } else if (rbtPYG.isSelected()) {
                PYG = Float.parseFloat(txtCantidad.getText());
                ARS = PYG * 0.01782041;
                USD = PYG * 0.0001455;
                EUR = PYG * 0.0001397;
                GBP = PYG * 0.00012123;
                BRL = PYG * 0.0007451;
                COP = PYG * 0.57948;
                UYU = PYG * 0.00582;
                MXN = PYG * 0.00301;
                KRW = PYG * 0.18788;
                JPY = PYG * 0.01963;
                txtConvertir1.setText(String.valueOf(formato.format(ARS)));
                lblConvertir1.setText("Pesos Argentinos");
                txtConvertir2.setText(String.valueOf(formato.format(USD)));
                lblConvertir2.setText("Dolares");
                txtConvertir3.setText(String.valueOf(formato.format(EUR)));
                lblConvertir3.setText("Euros");
                txtConvertir4.setText(String.valueOf(formato.format(GBP)));
                lblConvertir4.setText("Libras Esterlinas");
                txtConvertir5.setText(String.valueOf(formato.format(BRL)));
                lblConvertir5.setText("Reales");
                txtConvertir6.setText(String.valueOf(formato.format(COP)));
                lblConvertir6.setText("Pesos Colombianos");
                txtConvertir7.setText(String.valueOf(formato.format(UYU)));
                lblConvertir7.setText("Pesos Uruguayos");
                txtConvertir8.setText(String.valueOf(formato.format(MXN)));
                lblConvertir8.setText("Pesos Mexicanos");
                txtConvertir9.setText(String.valueOf(formato.format(KRW)));
                lblConvertir9.setText("Won SurCorea");
                txtConvertir10.setText(String.valueOf(formato.format(JPY)));
                lblConvertir10.setText("Yen Japon");
            } else if (rbtCOP.isSelected()) {
                COP = Float.parseFloat(txtCantidad.getText());
                ARS = COP * 0.0307526;
                USD = COP * 0.0002511;
                EUR = COP * 0.0002411;
                GBP = COP * 0.0002092;
                BRL = COP * 0.00129;
                PYG = COP * 1.72570;
                UYU = COP * 0.01005;
                MXN = COP * 0.00519;
                KRW = COP * 0.32422;
                JPY = COP * 0.03388;
                txtConvertir1.setText(String.valueOf(formato.format(ARS)));
                lblConvertir1.setText("Pesos Argentinos");
                txtConvertir2.setText(String.valueOf(formato.format(USD)));
                lblConvertir2.setText("Dolares");
                txtConvertir3.setText(String.valueOf(formato.format(EUR)));
                lblConvertir3.setText("Euros");
                txtConvertir4.setText(String.valueOf(formato.format(GBP)));
                lblConvertir4.setText("Libras Esterlinas");
                txtConvertir5.setText(String.valueOf(formato.format(BRL)));
                lblConvertir5.setText("Reales");
                txtConvertir6.setText(String.valueOf(formato.format(PYG)));
                lblConvertir6.setText("Guaranies");
                txtConvertir7.setText(String.valueOf(formato.format(UYU)));
                lblConvertir7.setText("Pesos Uruguayos");
                txtConvertir8.setText(String.valueOf(formato.format(MXN)));
                lblConvertir8.setText("Pesos Mexicanos");
                txtConvertir9.setText(String.valueOf(formato.format(KRW)));
                lblConvertir9.setText("Won SurCorea");
                txtConvertir10.setText(String.valueOf(formato.format(JPY)));
                lblConvertir10.setText("Yen Japon");
            } else if (rbtUYU.isSelected()) {
                UYU = Float.parseFloat(txtCantidad.getText());
                ARS = UYU * 3.0603;
                USD = UYU * 0.2499;
                EUR = UYU * 0.24;
                GBP = UYU * 0.2082;
                BRL = UYU * 0.12822;
                PYG = UYU * 171.730;
                COP = UYU * 99.51386;
                MXN = UYU * 0.51647;
                KRW = UYU * 32.26436;
                JPY = UYU * 3.37173;
                txtConvertir1.setText(String.valueOf(formato.format(ARS)));
                lblConvertir1.setText("Pesos Argentinos");
                txtConvertir2.setText(String.valueOf(formato.format(USD)));
                lblConvertir2.setText("Dolares");
                txtConvertir3.setText(String.valueOf(formato.format(EUR)));
                lblConvertir3.setText("Euros");
                txtConvertir4.setText(String.valueOf(formato.format(GBP)));
                lblConvertir4.setText("Libras Esterlinas");
                txtConvertir5.setText(String.valueOf(formato.format(BRL)));
                lblConvertir5.setText("Reales");
                txtConvertir6.setText(String.valueOf(formato.format(PYG)));
                lblConvertir6.setText("Guaranies");
                txtConvertir7.setText(String.valueOf(formato.format(COP)));
                lblConvertir7.setText("Pesos Colombianos");
                txtConvertir8.setText(String.valueOf(formato.format(MXN)));
                lblConvertir8.setText("Pesos Mexicanos");
                txtConvertir9.setText(String.valueOf(formato.format(KRW)));
                lblConvertir9.setText("Won SurCorea");
                txtConvertir10.setText(String.valueOf(formato.format(JPY)));
                lblConvertir10.setText("Yen Japon");
            } else if (rbtMXN.isSelected()) {
                MXN = Float.parseFloat(txtCantidad.getText());
                ARS = MXN * 5.92548;
                USD = MXN * 0.04838;
                EUR = MXN * 0.04646;
                GBP = MXN * 0.04031;
                BRL = MXN * 0.24827;
                PYG = MXN * 332.51098;
                COP = MXN * 192.68228;
                UYU = MXN * 1.93624;
                KRW = MXN * 62.4714;
                JPY = MXN * 6.52847;
                txtConvertir1.setText(String.valueOf(formato.format(ARS)));
                lblConvertir1.setText("Pesos Argentinos");
                txtConvertir2.setText(String.valueOf(formato.format(USD)));
                lblConvertir2.setText("Dolares");
                txtConvertir3.setText(String.valueOf(formato.format(EUR)));
                lblConvertir3.setText("Euros");
                txtConvertir4.setText(String.valueOf(formato.format(GBP)));
                lblConvertir4.setText("Libras Esterlinas");
                txtConvertir5.setText(String.valueOf(formato.format(BRL)));
                lblConvertir5.setText("Reales");
                txtConvertir6.setText(String.valueOf(formato.format(PYG)));
                lblConvertir6.setText("Guaranies");
                txtConvertir7.setText(String.valueOf(formato.format(COP)));
                lblConvertir7.setText("Pesos Colombianos");
                txtConvertir8.setText(String.valueOf(formato.format(UYU)));
                lblConvertir8.setText("Pesos Uruguayos");
                txtConvertir9.setText(String.valueOf(formato.format(KRW)));
                lblConvertir9.setText("Won SurCorea");
                txtConvertir10.setText(String.valueOf(formato.format(JPY)));
                lblConvertir10.setText("Yen Japon");
            } else if (rbtKRW.isSelected()) {
                KRW = Float.parseFloat(txtCantidad.getText());
                ARS = KRW * 0.09485;
                USD = KRW * 0.00077;
                EUR = KRW * 0.00074;
                GBP = KRW * 0.00065;
                BRL = KRW * 0.00397;
                PYG = KRW * 5.32261;
                COP = KRW * 3.08433;
                UYU = KRW * 0.03099;
                MXN = KRW * 0.01601;
                JPY = KRW * 0.10450;
                txtConvertir1.setText(String.valueOf(formato.format(ARS)));
                lblConvertir1.setText("Pesos Argentinos");
                txtConvertir2.setText(String.valueOf(formato.format(USD)));
                lblConvertir2.setText("Dolares");
                txtConvertir3.setText(String.valueOf(formato.format(EUR)));
                lblConvertir3.setText("Euros");
                txtConvertir4.setText(String.valueOf(formato.format(GBP)));
                lblConvertir4.setText("Libras Esterlinas");
                txtConvertir5.setText(String.valueOf(formato.format(BRL)));
                lblConvertir5.setText("Reales");
                txtConvertir6.setText(String.valueOf(formato.format(PYG)));
                lblConvertir6.setText("Guaranies");
                txtConvertir7.setText(String.valueOf(formato.format(COP)));
                lblConvertir7.setText("Pesos Colombianos");
                txtConvertir8.setText(String.valueOf(formato.format(UYU)));
                lblConvertir8.setText("Pesos Uruguayos");
                txtConvertir9.setText(String.valueOf(formato.format(MXN)));
                lblConvertir9.setText("Pesos Mexicanos");
                txtConvertir10.setText(String.valueOf(formato.format(JPY)));
                lblConvertir10.setText("Yen Japon");
            } else if (rbtJPY.isSelected()) {
                JPY = Float.parseFloat(txtCantidad.getText());
                ARS = JPY * 0.90764;
                USD = JPY * 0.00741;
                EUR = JPY * 0.00712;
                GBP = JPY * 0.00617;
                BRL = JPY * 0.03803;
                PYG = JPY * 50.93247;
                COP = JPY * 29.51417;
                UYU = JPY * 0.29658;
                MXN = JPY * 0.15318;
                KRW = JPY * 9.56908;
                txtConvertir1.setText(String.valueOf(formato.format(ARS)));
                lblConvertir1.setText("Pesos Argentinos");
                txtConvertir2.setText(String.valueOf(formato.format(USD)));
                lblConvertir2.setText("Dolares");
                txtConvertir3.setText(String.valueOf(formato.format(EUR)));
                lblConvertir3.setText("Euros");
                txtConvertir4.setText(String.valueOf(formato.format(GBP)));
                lblConvertir4.setText("Libras Esterlinas");
                txtConvertir5.setText(String.valueOf(formato.format(BRL)));
                lblConvertir5.setText("Reales");
                txtConvertir6.setText(String.valueOf(formato.format(PYG)));
                lblConvertir6.setText("Guaranies");
                txtConvertir7.setText(String.valueOf(formato.format(COP)));
                lblConvertir7.setText("Pesos Colombianos");
                txtConvertir8.setText(String.valueOf(formato.format(UYU)));
                lblConvertir8.setText("Pesos Uruguayos");
                txtConvertir9.setText(String.valueOf(formato.format(MXN)));
                lblConvertir9.setText("Pesos Mexicanos");
                txtConvertir10.setText(String.valueOf(formato.format(KRW)));
                lblConvertir10.setText("Won SurCorea");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Falta seleccionar la opcion a convertir", "Error de opcion!! ", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Falta el valor a convertir", "Error de Numero!!!", JOptionPane.ERROR_MESSAGE);
            txtCantidad.requestFocus();
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txtConvertir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConvertir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConvertir1ActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        boolean existe;
        if (!Character.isDigit(c) && Character.valueOf(c) != 46 && Character.valueOf(c) != 8) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa un numero", "Error de validacion", JOptionPane.ERROR_MESSAGE);
        } else {

            if (Character.valueOf(c) == 46) {
                con++;
            }
            if (Character.valueOf(c) == 8) {
                existe = valida();
                if (!existe) {
                    con = 0;
                }
            }
        }
        if (con > 1) {
            getToolkit().beep();
            evt.consume();
            JOPtionPane.showMessageDialog(rootPane, "No puede haber mas de un punto", "Error de validacion", JOptionPane.ERROR_MESSAGE);
            con = 1;
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtConvertir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConvertir5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConvertir5ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtCantidad.setText("");
        gruOpciones.clearSelection();
        txtConvertir1.setText("");
        lblConvertir1.setText("Tipo");
        txtConvertir2.setText("");
        lblConvertir2.setText("Tipo");
        txtConvertir3.setText("");
        lblConvertir3.setText("Tipo");
        txtConvertir4.setText("");
        lblConvertir4.setText("Tipo");
        txtConvertir5.setText("");
        lblConvertir5.setText("Tipo");
        txtConvertir6.setText("");
        lblConvertir6.setText("Tipo");
        txtConvertir7.setText("");
        lblConvertir7.setText("Tipo");
        txtConvertir8.setText("");
        lblConvertir8.setText("Tipo");
        txtConvertir9.setText("");
        lblConvertir9.setText("Tipo");
        txtConvertir10.setText("");
        lblConvertir10.setText("Tipo");
        btnBorrar.setEnabled(false);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtConvertir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConvertir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConvertir2ActionPerformed

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
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pantalla().setVisible(true);
            }
        });
    }

    public boolean valida() {
        boolean existe = false;
        String cad = txtCantidad.getText();
        for (int i = 0; i < txtCantidad.getText().length(); i++) {
            if (cad.charAt(i) == 46) {
                existe = true;
                break;
            }
        }
        if (!existe && con > 0) {
            con = 0;
        }
        return existe;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup gruOpciones;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblConvertir1;
    private javax.swing.JLabel lblConvertir10;
    private javax.swing.JLabel lblConvertir2;
    private javax.swing.JLabel lblConvertir3;
    private javax.swing.JLabel lblConvertir4;
    private javax.swing.JLabel lblConvertir5;
    private javax.swing.JLabel lblConvertir6;
    private javax.swing.JLabel lblConvertir7;
    private javax.swing.JLabel lblConvertir8;
    private javax.swing.JLabel lblConvertir9;
    private javax.swing.JLabel lblDesarrollador;
    private javax.swing.JLabel lblOpciones;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtARS;
    private javax.swing.JRadioButton rbtBRL;
    private javax.swing.JRadioButton rbtCOP;
    private javax.swing.JRadioButton rbtEUR;
    private javax.swing.JRadioButton rbtGBP;
    private javax.swing.JRadioButton rbtJPY;
    private javax.swing.JRadioButton rbtKRW;
    private javax.swing.JRadioButton rbtMXN;
    private javax.swing.JRadioButton rbtPYG;
    private javax.swing.JRadioButton rbtUSD;
    private javax.swing.JRadioButton rbtUYU;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtConvertir1;
    private javax.swing.JTextField txtConvertir10;
    private javax.swing.JTextField txtConvertir2;
    private javax.swing.JTextField txtConvertir3;
    private javax.swing.JTextField txtConvertir4;
    private javax.swing.JTextField txtConvertir5;
    private javax.swing.JTextField txtConvertir6;
    private javax.swing.JTextField txtConvertir7;
    private javax.swing.JTextField txtConvertir8;
    private javax.swing.JTextField txtConvertir9;
    // End of variables declaration//GEN-END:variables
}
