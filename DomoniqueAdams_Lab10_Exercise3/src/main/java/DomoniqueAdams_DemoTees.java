/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */

import javax.swing.*;
public class DomoniqueAdams_DemoTees 
{
    public static void main(String[] args)
    {
        String entry;
        String size, color, slogan;
        String orderNumber;
        DomoniqueAdams_TeeShirt firstShirt = new DomoniqueAdams_TeeShirt();
        DomoniqueAdams_TeeShirt secondShirt = new DomoniqueAdams_TeeShirt();
        DomoniqueAdams_CustomTee firstCShirt = new DomoniqueAdams_CustomTee();
        DomoniqueAdams_CustomTee secondCShirt = new DomoniqueAdams_CustomTee();
        
        //Basic TeeShirt 1
        entry = JOptionPane.showInputDialog(null, "Please enter your desired size (e.g. XS or XXXL): ");
        size = entry.toUpperCase();
        firstShirt.setSize(size); 
                
        entry = JOptionPane.showInputDialog(null, "Please enter the color you would like your shirt to be: ");
        color = entry;
        firstShirt.setColor(color);
        
        entry = JOptionPane.showInputDialog(null, "Please enter your intials and last 4 digits of your phone number");
        orderNumber = entry.toUpperCase();
        firstShirt.setOrderNumber(orderNumber);
        
        JOptionPane.showMessageDialog(null, "You have ordered a " + firstShirt.getColor() + " shirt in size " + firstShirt.getSize() 
                + " for $" + firstShirt.getPrice() + "\nYour order number is: " + firstShirt.getOrderNumber());
        
        //Basic TeeShirt 2
        entry = JOptionPane.showInputDialog(null, "Please enter your desired size (e.g. XS or XXXL): ");
        size = entry.toUpperCase();
        secondShirt.setSize(size); 
                
        entry = JOptionPane.showInputDialog(null, "Please enter the color you would like your shirt to be: ");
        color = entry;
        secondShirt.setColor(color);
        
        entry = JOptionPane.showInputDialog(null, "Please enter your intials and last 4 digits of your phone number");
        orderNumber = entry.toUpperCase();
        secondShirt.setOrderNumber(orderNumber);
        
        JOptionPane.showMessageDialog(null, "You have ordered a " + secondShirt.getColor() + " shirt in size " + secondShirt.getSize() 
                + " for $" + secondShirt.getPrice() + "\nYour order number is: " + secondShirt.getOrderNumber());
        
        //Custom TeeShirt 1
        entry = JOptionPane.showInputDialog(null, "Please enter your desired size (e.g. XS or XXXL): ");
        size = entry.toUpperCase();
        firstCShirt.setSize(size); 
                
        entry = JOptionPane.showInputDialog(null, "Please enter the color you would like your shirt to be: ");
        color = entry;
        firstCShirt.setColor(color);
        
        entry = JOptionPane.showInputDialog(null, "Please enter your custom slogan: ");
        slogan = entry;
        firstCShirt.setSlogan(slogan);
        
        entry = JOptionPane.showInputDialog(null, "Please enter your intials and last 4 digits of your phone number");
        orderNumber = entry.toUpperCase();
        firstCShirt.setOrderNumber(orderNumber);            
        
        JOptionPane.showMessageDialog(null, "You have ordered a " + firstCShirt.getColor() + " shirt in size " 
                + firstCShirt.getSize() + " that says:\n" + "\"" + firstCShirt.getSloagn() + "\""
                + " for $" + firstCShirt.getPrice() + "\nYour order number is: " + firstCShirt.getOrderNumber());
        
        //Custom TeeShirt 2
        entry = JOptionPane.showInputDialog(null, "Please enter your desired size (e.g. XS or XXXL): ");
        size = entry.toUpperCase();
        secondCShirt.setSize(size); 
                
        entry = JOptionPane.showInputDialog(null, "Please enter the color you would like your shirt to be: ");
        color = entry;
        secondCShirt.setColor(color);
        
        entry = JOptionPane.showInputDialog(null, "Please enter your custom slogan: ");
        slogan = entry;
        secondCShirt.setSlogan(slogan);
        
        entry = JOptionPane.showInputDialog(null, "Please enter your intials and last 4 digits of your phone number");
        orderNumber = entry.toUpperCase();
        secondCShirt.setOrderNumber(orderNumber);            
        
        JOptionPane.showMessageDialog(null, "You have ordered a " + secondCShirt.getColor() + " shirt in size " 
                + secondCShirt.getSize() + " that says: \n" + "\"" + secondCShirt.getSloagn() + "\""
                + " for $" + secondCShirt.getPrice() + "\nYour order number is: " + secondCShirt.getOrderNumber());
       
        
        
    }
    
}
