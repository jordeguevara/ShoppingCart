/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingSysstem;

import java.awt.Button;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author jordeguevara
 */
public class CheckoutWindow extends javax.swing.JFrame {

    private int numberofOrders;
    private int currentOrder;
    List<Customer> customer_database = new ArrayList<>();
    ShoppingCartWindow shoppingWindow;
    private String title, firstname, lastname, address1, address2,state, postcode, city;
    private char[] pass;
    private int index;
    private double total_price;
  

    /**
     * Creates new form CheckoutWindow
     * @param shoppingWindow
     */
    public CheckoutWindow(ShoppingCartWindow shoppingWindow, List<Customer> customer_database, double total_price) {
        initComponents();
        this.customer_database = customer_database;
        this.total_price = total_price;
        this.shoppingWindow = shoppingWindow;
        shoppingWindow.setVisible(false);
        this.numberofOrders = shoppingWindow.getIncrementNumber();
        this.currentOrder =-1; 

    }
    
    private void setCustomerData(Customer customer) {
         first_name_input.setText(customer.getFirst_name());
        last_name_input.setText(customer.getLast_name());
        address1_input.setText(customer.getAddress1());
        address2_input.setText(customer.getAddress2());
        city_input.setText(customer.getCity());
        //visa_input.setText(customer.getVisa().toString());
       
       if(customer.getTitle()!= null) {
       String title = customer.getTitle();
       if(title.equals("Mr"))
          Mr.setSelected(true);
       else if(title.equals("mrs"))
           mrs.setSelected(true);
       else if(title.equals("Miss"))
           miss.setSelected(true);
       }

       
       String state = customer.getState();

       switch(state){
           case "California":
               state_drop_down.setSelectedIndex(0);
               break;
           case "Arizona":
                   state_drop_down.setSelectedIndex(1);
                   break;
           case "Oregon":
               state_drop_down.setSelectedIndex(2);
                   break;
           case "Washington":
                   state_drop_down.setSelectedIndex(3);
                   break;
           case "New York":
               state_drop_down.setSelectedIndex(4);
               break;
               default: 
               System.out.println("None selected");
               
               
       }
       
       
        
        postcode_input.setText(customer.getPostcode());
    }
    
    public Customer updateCustomer(List<Customer> customer_database, int  index) {
        Customer customer;
        customer = customer_database.get(index);
        setCustomerData(customer);
        this.currentOrder = customer.getOrder_number();

       return customer;
    }
    
    public void getCustomerInfo() {
        title = getSelectedButtonText(buttonGroup1);
        firstname = first_name_input.getText();
        lastname = last_name_input.getText();
        address1 = address1_input.getText();
        address2 = address2_input.getText();
        city = city_input.getText();
        state = state_drop_down.getSelectedItem().toString(); 
        postcode = postcode_input.getText();
        pass = visa_input.getPassword();

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
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Mr = new javax.swing.JRadioButton();
        mrs = new javax.swing.JRadioButton();
        miss = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        first_name_input = new javax.swing.JTextField();
        last_name_input = new javax.swing.JTextField();
        address1_input = new javax.swing.JTextField();
        address2_input = new javax.swing.JTextField();
        city_input = new javax.swing.JTextField();
        state_drop_down = new javax.swing.JComboBox<>();
        postcode_input = new javax.swing.JTextField();
        visa_input = new javax.swing.JPasswordField();
        cancelButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Title");

        buttonGroup1.add(Mr);
        Mr.setText("Mr");

        buttonGroup1.add(mrs);
        mrs.setText("Mrs");

        buttonGroup1.add(miss);
        miss.setText("Miss");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Address1:");

        jLabel5.setText("Address2:");

        jLabel6.setText("    City");

        jLabel7.setText("   State");

        jLabel8.setText("Postcode");

        jLabel9.setText("    Visa:");

        state_drop_down.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "California", "Arizona", "Oregon", "Washington", "New York" }));
        state_drop_down.setToolTipText("");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cancelButton)
                                .addGap(18, 18, 18)
                                .addComponent(SubmitButton)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel2))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address1_input)
                                    .addComponent(city_input)
                                    .addComponent(postcode_input)
                                    .addComponent(visa_input, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(state_drop_down, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(first_name_input, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(last_name_input))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(address2_input))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Mr)
                        .addGap(0, 0, 0)
                        .addComponent(mrs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(miss)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Mr)
                    .addComponent(mrs)
                    .addComponent(miss))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(first_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(address1_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(address2_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(city_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(state_drop_down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(postcode_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(visa_input, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(SubmitButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        shoppingWindow.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here: 
        Customer newCustomer;
        getCustomerInfo(); 
        
        if(currentOrder >= 0 && currentOrder != numberofOrders){

              int index = getCustomerDataByNumber(currentOrder);
              customer_database.remove(index);
              Customer updatedCustomer = new Customer(title, firstname, lastname, address1, address2, city, state, postcode, pass, currentOrder,total_price);  
              customer_database.add(index,updatedCustomer);
              shoppingWindow.addCustomerData(customer_database);
              updateConfrimation updatedorder = new updateConfrimation(currentOrder,this);
              updatedorder.setVisible(true);
              }
              
        else{
            newCustomer = new Customer(title, firstname, lastname, address1, address2, city, state, postcode, pass, numberofOrders,total_price);
            customer_database.add(newCustomer);
            ConfirmationWindow order = new ConfirmationWindow(numberofOrders, this, customer_database);
            order.createdText();
            order.setVisible(true);
            numberofOrders++;

        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CheckoutWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckoutWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckoutWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckoutWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new CheckoutWindow().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Mr;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField address1_input;
    private javax.swing.JTextField address2_input;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField city_input;
    private javax.swing.JTextField first_name_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField last_name_input;
    private javax.swing.JRadioButton miss;
    private javax.swing.JRadioButton mrs;
    private javax.swing.JTextField postcode_input;
    private javax.swing.JComboBox<String> state_drop_down;
    private javax.swing.JPasswordField visa_input;
    // End of variables declaration//GEN-END:variables

}
