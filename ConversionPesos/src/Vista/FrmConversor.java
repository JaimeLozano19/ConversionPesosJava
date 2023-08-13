
package Vista;

import org.edisoncor.gui.button.ButtonColoredAction;
import org.edisoncor.gui.textField.TextFieldRectIcon;


public class FrmConversor extends javax.swing.JFrame {

   
    public FrmConversor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public TextFieldRectIcon getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(TextFieldRectIcon txtValor) {
        this.txtValor = txtValor;
    }

    public ButtonColoredAction getBtnDolares() {
        return btnDolares;
    }

    public ButtonColoredAction getBtnPesos() {
        return btnPesos;
    }

    public ButtonColoredAction getBtnLimpiar() {
        return btnLimpiar;
    }

    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRect2 = new org.edisoncor.gui.label.LabelRect();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        labelRect1 = new org.edisoncor.gui.label.LabelRect();
        txtValor = new org.edisoncor.gui.textField.TextFieldRectIcon();
        btnDolares = new org.edisoncor.gui.button.ButtonColoredAction();
        btnPesos = new org.edisoncor.gui.button.ButtonColoredAction();
        btnLimpiar = new org.edisoncor.gui.button.ButtonColoredAction();

        labelRect2.setText("labelRect2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagen/descarga (1).jpg"))); // NOI18N

        labelRect1.setBackground(new java.awt.Color(102, 102, 102));
        labelRect1.setForeground(new java.awt.Color(204, 0, 0));
        labelRect1.setText("Ingrese el valor a convertir ");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        btnDolares.setBackground(new java.awt.Color(102, 102, 102));
        btnDolares.setForeground(new java.awt.Color(204, 0, 0));
        btnDolares.setText("A Dolares");
        btnDolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDolaresActionPerformed(evt);
            }
        });

        btnPesos.setBackground(new java.awt.Color(102, 102, 102));
        btnPesos.setForeground(new java.awt.Color(204, 0, 0));
        btnPesos.setText("A pesos");

        btnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(labelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(labelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnDolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDolaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDolaresActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonColoredAction btnDolares;
    private org.edisoncor.gui.button.ButtonColoredAction btnLimpiar;
    private org.edisoncor.gui.button.ButtonColoredAction btnPesos;
    private org.edisoncor.gui.label.LabelRect labelRect1;
    private org.edisoncor.gui.label.LabelRect labelRect2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.textField.TextFieldRectIcon txtValor;
    // End of variables declaration//GEN-END:variables
}
