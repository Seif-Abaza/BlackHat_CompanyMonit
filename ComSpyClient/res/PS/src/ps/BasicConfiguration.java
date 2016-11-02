/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BasicConfiguration.java
 *
 * Created on Mar 16, 2012, 12:01:59 AM
 */
package ps;

import Library.PSCaptor;
import javax.swing.JComboBox;

/**
 *
 * @author RAVI
 */
public class BasicConfiguration extends javax.swing.JFrame {
    
    public static int buffersize=10000,deviceno=3;
    public static boolean mode=true;
    MainGUI mg;
    /** Creates new form BasicConfiguration */
        public BasicConfiguration() {
        initComponents();
        String[] str=PSCaptor.getdevlist();
        
         for(String s: str)
        {
            comboDeviceList.addItem(s);
        }
        //comboDeviceList.addItem("hello");
        //System.out.println(str);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkMode = new javax.swing.JCheckBox();
        bufferSize = new javax.swing.JTextField();
        comboDeviceList = new javax.swing.JComboBox();
        okbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Startup Configuration");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14));
        jLabel1.setText("Buffer Size");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14));
        jLabel2.setText("Select Device");

        checkMode.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14));
        checkMode.setText("Enable Promiscus Mode");
        checkMode.setToolTipText("");
        checkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkModeActionPerformed(evt);
            }
        });

        bufferSize.setFont(new java.awt.Font("Verdana", 0, 12));
        bufferSize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        bufferSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bufferSizeActionPerformed(evt);
            }
        });
        bufferSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bufferSizeKeyTyped(evt);
            }
        });

        okbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13));
        okbtn.setText("OK");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        cancelbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13));
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkMode)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboDeviceList, 0, 158, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bufferSize, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bufferSize, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(comboDeviceList)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(checkMode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkModeActionPerformed

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        // TODO add your handling code here:
        buffersize=Integer.parseInt(bufferSize.getText());
        mode=checkMode.isSelected();
        deviceno=comboDeviceList.getSelectedIndex();
        //PScaptor obj=new PScaptor(deviceno,mode,buffersize);
        mg= new MainGUI(buffersize,mode,deviceno);
        mg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_okbtnActionPerformed

    private void bufferSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bufferSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bufferSizeActionPerformed

    private void bufferSizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bufferSizeKeyTyped
        // TODO add your handling code here:
        try{
            int int1 = Integer.parseInt(bufferSize.getText());   //This was a string coming from a resultset that I changed into and Int  
            bufferSize.requestFocusInWindow();  
       } 
       catch (Exception z) {   
            bufferSize.setText("");  
            bufferSize.requestFocusInWindow();  
       } 
    }//GEN-LAST:event_bufferSizeKeyTyped

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        mg= new MainGUI(buffersize,mode,deviceno);
        mg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BasicConfiguration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bufferSize;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JCheckBox checkMode;
    private javax.swing.JComboBox comboDeviceList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton okbtn;
    // End of variables declaration//GEN-END:variables
}
