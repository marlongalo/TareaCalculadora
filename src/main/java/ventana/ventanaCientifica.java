/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

/**
 *
 * @author Marlon Galo
 */
public class ventanaCientifica extends javax.swing.JFrame {
    private String numero="";
    private boolean punto = true;
    private String operacion = "null";
    double resultadoSeno=0;
    double resultadoCoseno=0;
    double resultadoTangente=0;
    private boolean activado = true;
    /**
     * Creates new form ventanaCientifica
     */
    public ventanaCientifica() {
        initComponents();
        setSize(300,450);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        etiquetaSeno = new javax.swing.JLabel();
        etiquetaGradoSeno = new javax.swing.JLabel();
        etiquetaCoseno = new javax.swing.JLabel();
        etiquetaGradoCoseno = new javax.swing.JLabel();
        etiquetaTangente = new javax.swing.JLabel();
        etiquetaGradoTangente = new javax.swing.JLabel();
        botonBorrar = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonRetroceso = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonCero = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        etiquetaIgualSeno = new javax.swing.JLabel();
        etiquetaIgualCoseno = new javax.swing.JLabel();
        etiquetaIgualTangente = new javax.swing.JLabel();
        etiquetaResultadoSeno = new javax.swing.JLabel();
        etiquetaResultadoCoseno = new javax.swing.JLabel();
        etiquetaResultadoTangente = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        CalculadoraEstandar = new javax.swing.JMenuItem();
        CalculadoraCientifica = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaSeno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaSeno.setText("Sen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 5, 0, 0);
        panel.add(etiquetaSeno, gridBagConstraints);

        etiquetaGradoSeno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiquetaGradoSeno, gridBagConstraints);

        etiquetaCoseno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaCoseno.setText("Cos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 5, 0, 0);
        panel.add(etiquetaCoseno, gridBagConstraints);

        etiquetaGradoCoseno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiquetaGradoCoseno, gridBagConstraints);

        etiquetaTangente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaTangente.setText("Tan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 5, 0, 0);
        panel.add(etiquetaTangente, gridBagConstraints);

        etiquetaGradoTangente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(etiquetaGradoTangente, gridBagConstraints);

        botonBorrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonBorrar.setText("C");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonBorrar, gridBagConstraints);

        botonPunto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonPunto, gridBagConstraints);

        botonRetroceso.setText("←");
        botonRetroceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocesoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonRetroceso, gridBagConstraints);

        botonIgual.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonIgual, gridBagConstraints);

        botonCero.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonCero.setText("0");
        botonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonCero, gridBagConstraints);

        boton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton1, gridBagConstraints);

        boton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton2, gridBagConstraints);

        boton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton3, gridBagConstraints);

        boton4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton4, gridBagConstraints);

        boton5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton5, gridBagConstraints);

        boton6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton6, gridBagConstraints);

        boton7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton7, gridBagConstraints);

        boton8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton8, gridBagConstraints);

        boton9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton9, gridBagConstraints);

        etiquetaIgualSeno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaIgualSeno.setText("=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(etiquetaIgualSeno, gridBagConstraints);

        etiquetaIgualCoseno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaIgualCoseno.setText("=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(etiquetaIgualCoseno, gridBagConstraints);

        etiquetaIgualTangente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaIgualTangente.setText("=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(etiquetaIgualTangente, gridBagConstraints);

        etiquetaResultadoSeno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(etiquetaResultadoSeno, gridBagConstraints);

        etiquetaResultadoCoseno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(etiquetaResultadoCoseno, gridBagConstraints);

        etiquetaResultadoTangente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(etiquetaResultadoTangente, gridBagConstraints);

        menu.setText("Calculadoras");
        menu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        CalculadoraEstandar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CalculadoraEstandar.setText("Calculadora Estandar");
        CalculadoraEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculadoraEstandarActionPerformed(evt);
            }
        });
        menu.add(CalculadoraEstandar);

        CalculadoraCientifica.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CalculadoraCientifica.setText("Conversion");
        CalculadoraCientifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculadoraCientificaActionPerformed(evt);
            }
        });
        menu.add(CalculadoraCientifica);

        Salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        menu.add(Salir);

        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
      System.exit(0);   // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_menuActionPerformed

    private void CalculadoraCientificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculadoraCientificaActionPerformed
        ventanaCientifica calculadora2 = new ventanaCientifica();// TODO add your handling code here:
        calculadora2.setVisible(true);
        dispose();
    }//GEN-LAST:event_CalculadoraCientificaActionPerformed

    private void CalculadoraEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculadoraEstandarActionPerformed
        ventanaCalculadora calculadora1 = new ventanaCalculadora();
        calculadora1.setVisible(true);//con este se hace visble la ventana
        dispose();//con este se cierra la ventana        // TODO add your handling code here:
    }//GEN-LAST:event_CalculadoraEstandarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        etiquetaGradoSeno.setText("");
        etiquetaGradoCoseno.setText("");
        etiquetaGradoTangente.setText("");
        etiquetaResultadoSeno.setText("");
        etiquetaResultadoCoseno.setText("");
        etiquetaResultadoTangente.setText("");
        numero="";
        operacion="nula";
        activado=true;
        punto=true; 
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        numero += "4";
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        numero += "1";
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
    }//GEN-LAST:event_boton1ActionPerformed

    private void botonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCeroActionPerformed
        if(numero!="")
        {
            numero += "0";
            etiquetaGradoSeno.setText(numero);
            etiquetaGradoCoseno.setText(numero);
            etiquetaGradoTangente.setText(numero);
        }
    }//GEN-LAST:event_botonCeroActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        numero += "2";
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        numero += "3";
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        numero += "5";
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        numero += "6";
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        numero += "7";
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        numero += "8";
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        numero += "9";
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
    }//GEN-LAST:event_boton9ActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if(punto==true){
            if(numero==""){
            numero+="0.";
             }
            else{
            numero+=".";
            }
        
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
        punto=false;
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
            double sin=Double.parseDouble(numero);
            double cos=Double.parseDouble(numero);
            double tan=Double.parseDouble(numero);
            resultadoSeno= Math.sin(sin);
            resultadoCoseno=Math.cos(cos);
            resultadoTangente=Math.tan(tan);
            etiquetaResultadoSeno.setText(String.format("%.2f",resultadoSeno));
            etiquetaResultadoCoseno.setText(String.format("%.2f",resultadoCoseno));
            etiquetaResultadoTangente.setText(String.format("%.2f",resultadoTangente));
                                           
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonRetrocesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocesoActionPerformed
        int tamano =numero.length();
        if(tamano>0){
            if(tamano==1)
            {
                numero="0";
            }
        else
            {
            numero=numero.substring(0, numero.length()-1);
            }
        etiquetaGradoSeno.setText(numero);
        etiquetaGradoCoseno.setText(numero);
        etiquetaGradoTangente.setText(numero);
        }
    }//GEN-LAST:event_botonRetrocesoActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaCientifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CalculadoraCientifica;
    private javax.swing.JMenuItem CalculadoraEstandar;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCero;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRetroceso;
    private javax.swing.JLabel etiquetaCoseno;
    private javax.swing.JLabel etiquetaGradoCoseno;
    private javax.swing.JLabel etiquetaGradoSeno;
    private javax.swing.JLabel etiquetaGradoTangente;
    private javax.swing.JLabel etiquetaIgualCoseno;
    private javax.swing.JLabel etiquetaIgualSeno;
    private javax.swing.JLabel etiquetaIgualTangente;
    private javax.swing.JLabel etiquetaResultadoCoseno;
    private javax.swing.JLabel etiquetaResultadoSeno;
    private javax.swing.JLabel etiquetaResultadoTangente;
    private javax.swing.JLabel etiquetaSeno;
    private javax.swing.JLabel etiquetaTangente;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
