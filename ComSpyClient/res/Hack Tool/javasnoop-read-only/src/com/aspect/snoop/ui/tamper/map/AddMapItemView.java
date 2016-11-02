/*
 * Copyright, Aspect Security, Inc.
 *
 * This file is part of JavaSnoop.
 *
 * JavaSnoop is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JavaSnoop is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JavaSnoop.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aspect.snoop.ui.tamper.map;

public class AddMapItemView extends javax.swing.JDialog {

    private Object toReturn;
    private Object key;

    public Object getValue() {
        return toReturn;
    }

    public Object getKey() {
        return key;
    }

    public AddMapItemView(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        toReturn = null;
        key = null;
    }

    /*
    public AddMapItemView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        toReturn = null;
        key = null;
    }
    */

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lstKeyDataType = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        lstValueDataType = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.aspect.snoop.JavaSnoop.class).getContext().getResourceMap(AddMapItemView.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        lstKeyDataType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "String", "int", "boolean", "long", "double", "float", "byte" }));
        lstKeyDataType.setFocusable(false);
        lstKeyDataType.setName("lstKeyDataType"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        txtValue.setName("txtValue"); // NOI18N
        txtValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValueActionPerformed(evt);
            }
        });

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        btnAddItem.setFont(resourceMap.getFont("btnAddItem.font")); // NOI18N
        btnAddItem.setText(resourceMap.getString("btnAddItem.text")); // NOI18N
        btnAddItem.setName("btnAddItem"); // NOI18N
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        txtKey.setText(resourceMap.getString("txtKey.text")); // NOI18N
        txtKey.setName("txtKey"); // NOI18N

        lstValueDataType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "String", "int", "boolean", "long", "double", "float", "byte" }));
        lstValueDataType.setFocusable(false);
        lstValueDataType.setName("lstValueDataType"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddItem)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKey))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lstKeyDataType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValue))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lstValueDataType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lstKeyDataType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lstValueDataType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValueActionPerformed
        // user pressed enter -> click the save button
        btnAddItemActionPerformed(evt);
}//GEN-LAST:event_txtValueActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed

        String dataType = (String)lstValueDataType.getSelectedItem();

        try {
            if ( "String".equals(dataType) ) {
                toReturn = txtValue.getText();
            } else if ( "int".equals(dataType) ) {
                toReturn = Integer.parseInt(txtValue.getText());
            } else if ( "float".equals(dataType) ) {
                toReturn = Float.parseFloat(txtValue.getText());
            } else if ( "boolean".equals(dataType) ) {
                if ( ! "true".equalsIgnoreCase(txtValue.getText()) && ! "false".equalsIgnoreCase(txtValue.getText()) ) {
                    throw new Exception();
                }
                toReturn = Boolean.parseBoolean(txtValue.getText());
            } else if ( "double".equals(dataType) ) {
                toReturn = Double.parseDouble(txtValue.getText());
            } else if ( "long".equals(dataType) ) {
                toReturn = Long.parseLong(txtValue.getText());
            } else if ( "byte".equals(dataType) ) {
                toReturn = Byte.parseByte(txtValue.getText());
            }

            dataType = (String)lstKeyDataType.getSelectedItem();

            if ( "String".equals(dataType) ) {
                key = txtKey.getText();
            } else if ( "int".equals(dataType) ) {
                key = Integer.parseInt(txtKey.getText());
            } else if ( "float".equals(dataType) ) {
                key = Float.parseFloat(txtKey.getText());
            } else if ( "boolean".equals(dataType) ) {
                if ( ! "true".equalsIgnoreCase(txtKey.getText()) && ! "false".equalsIgnoreCase(txtKey.getText()) ) {
                    throw new Exception();
                }
                key = Boolean.parseBoolean(txtKey.getText());
            } else if ( "double".equals(dataType) ) {
                key = Double.parseDouble(txtKey.getText());
            } else if ( "long".equals(dataType) ) {
                key = Long.parseLong(txtKey.getText());
            } else if ( "byte".equals(dataType) ) {
                key = Byte.parseByte(txtKey.getText());
            }

            key = txtKey.getText();

            dispose();

        } catch (Exception e) {
            e.printStackTrace();
            toReturn = null;
            key = null;
        }
}//GEN-LAST:event_btnAddItemActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddMapItemView dialog = new AddMapItemView(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox lstKeyDataType;
    private javax.swing.JComboBox lstValueDataType;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables

}
