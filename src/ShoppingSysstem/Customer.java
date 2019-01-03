/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingSysstem;

import java.awt.Button;

/**
 *
 * @author jordeguevara
 */
class Customer {
       private String title;
       private String first_name;
       private String last_name;
       private String address1;
       private String address2;
       private String city;
       private String state;
       private String postcode;
       private char[] visa;
       private int order_number;
       private double amount_paid;
       private Customer customer;
      
       
       public Customer(String title, String firstName, String lastName, String address1, 
               String address2, String city, String state, String postcode,char[] visa ,int orderNumber,double amount_paid) {
           this.title = title;
           this.first_name = firstName;
           this.last_name =lastName;
           this.address1 = address1;
           this.address2 = address2;
           this.city = city;
           this.state = state;
           this.postcode = postcode;
           this.visa = visa;
           this.order_number = orderNumber;
           this.amount_paid = amount_paid;
           
           
       }
       
      
       
       public String getName() {
           return getFirst_name() + " " +getLast_name();
       }
            
    /**
     * @return the title
     */
       
    public String getPostcode(){
        return postcode;
    }
    public String getTitle() {
        return title;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the visa
     */
    public char[] getVisa() {
        return visa;
    }

    /**
     * @return the order_number
     */
    public int getOrder_number() {
        return order_number;
    }

    /**
     * @return the amount_paid
     */
    public double getAmount_paid() {
        return amount_paid;
    }
        
       @Override
       public String toString() {
           String result;
           result = "Order Number: " + order_number +'\n' + "Customer: " + title +" " + getName() +'\n' + ""
                   + "Order Cost: $" + amount_paid;
           return result;
       }
    }
