/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingSysstem;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jordeguevara
 */
public class SearchWindow extends javax.swing.JFrame {
    ShoppingCartWindow shoppingWindow;
    public  List<Customer> customer_database = new ArrayList<Customer>();
    
    /**
     * Creates new form SearchWindow
     */
    public SearchWindow(ShoppingCartWindow shoppingWindow ,List<Customer> customer_database ) {
        initComponents();
        this.customer_database =customer_database;
        this.shoppingWindow = shoppingWindow;
        shoppingWindow.setVisible(false);
    }
    
    public int getCustomerDataByNumber(int number){
             int j=-1;
         for(int i=0; i<customer_database.size();i++) {
            if(customer_database.get(i).getOrder_number() == number){
                j=i;
                break;
            }
        }
         return j;
    }
    
    public int getCustomerDataByName(String name){
             int j=-1;
        for(int i=0; i<customer_database.size();i++) {
            if(this.customer_database.get(i).getName().equals(name)){
                 j=i;
                break;
            }  
        }
        return j;
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
        jLabel2 = new javax.swing.JLabel();
        name_search_input = new javax.swing.JTextField();
        number_search_input = new javax.swing.JTextField();
        searchByName_button = new javax.swing.JButton();
        searchByNumber_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_input = new javax.swing.JTextArea();
        cancel_button = new javax.swing.JButton();
        modify_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search by name");

        jLabel2.setText("Search by number");

        searchByName_button.setText("Search");
        searchByName_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByName_buttonActionPerformed(evt);
            }
        });

        searchByNumber_button.setText("Search");
        searchByNumber_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNumber_buttonActionPerformed(evt);
            }
        });

        jLabel3.setText("Search Result");

        display_input.setColumns(20);
        display_input.setRows(5);
        jScrollPane1.setViewportView(display_input);

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        modify_button.setText("Modify");
        modify_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_buttonActionPerformed(evt);
            }
        });

        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name_search_input, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(number_search_input))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchByName_button)
                            .addComponent(searchByNumber_button)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modify_button)
                            .addComponent(delete_button))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(cancel_button)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_search_input, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(searchByName_button)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(number_search_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchByNumber_button)))
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modify_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(cancel_button)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchByNumber_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNumber_buttonActionPerformed
        // TODO add your handling code here:
        
           try{
          int number = Integer.parseInt(number_search_input.getText());
            int j = getCustomerDataByNumber(number);
           display_input.setText(customer_database.get(j).toString()); //if it's -1 it was not in database
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Not in Database", "WETHEBADDEST.com", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_searchByNumber_buttonActionPerformed

    private void modify_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_buttonActionPerformed
        // TODO add your handling code here:
           if(!number_search_input.getText().equals("")){
        try {
            int number = Integer.parseInt(number_search_input.getText());
            
            int j = getCustomerDataByNumber(number);
            shoppingWindow.checkout.updateCustomer(customer_database,j);
            this.setVisible(false);
            shoppingWindow.checkout.setVisible(true);
            
                
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not in Database", "WETHEBADDEST.com", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else if(!name_search_input.getText().equals("")){
             try {
                   String name = name_search_input.getText();
                   int i = getCustomerDataByName(name);
                   shoppingWindow.checkout.updateCustomer(customer_database,i);
                   this.setVisible(false);
                    shoppingWindow.checkout.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not in Database", "WETHEBADDEST.com", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else    
             System.out.println("Nothing to Modify");
        
        
        
        
        
        
    }//GEN-LAST:event_modify_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        // TODO add your handling code here:
        shoppingWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void searchByName_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByName_buttonActionPerformed
        // TODO add your handling code here:
       
         try{
              String name = name_search_input.getText();
                int i = getCustomerDataByName(name);
             display_input.setText(customer_database.get(i).toString()); //if it's -1 it was not in database
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Number not in Database", "WETHEBADDEST.com", JOptionPane.ERROR_MESSAGE);
         }
       
    }//GEN-LAST:event_searchByName_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed

        if(!number_search_input.getText().equals("")){
        try {
            int number = Integer.parseInt(number_search_input.getText());
            int j = getCustomerDataByNumber(number);
            customer_database.remove(j);
            shoppingWindow.addCustomerData(customer_database);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not in Database", "WETHEBADDEST.com", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else if(!name_search_input.getText().equals("")){
             try {
                   String name = name_search_input.getText();
                   int i = getCustomerDataByName(name);
                   customer_database.remove(i);
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Not in Database", "WETHEBADDEST.com", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else    
            JOptionPane.showMessageDialog(null, "Nothing to Delete", "WETHEBADDEST.com", JOptionPane.ERROR_MESSAGE);
        
        
        
    }//GEN-LAST:event_delete_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new SearchWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JTextArea display_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modify_button;
    private javax.swing.JTextField name_search_input;
    private javax.swing.JTextField number_search_input;
    private javax.swing.JButton searchByName_button;
    private javax.swing.JButton searchByNumber_button;
    // End of variables declaration//GEN-END:variables
}
