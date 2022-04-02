
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
import javax.swing.*;
public class DomoniqueAdams_TeeShirt 
{
    String entry, orderNumber, size, color;
    double price;
    
    public void setOrderNumber(String n)
    {
        orderNumber = n;
    }
    public void setSize(String s)
    {
        size = s;
    }
    public void setColor(String c)
    {
        color = c;
    }
    
    public String getOrderNumber()
    {
        return orderNumber;
    }
    public String getSize()
    {
        return size;
    }
    public String getColor()
    {
        return color;
    }
    public double getPrice()
    {
        if (size.equals("XXL") || size.equals("XXXL"))
        {
            price = 22.99;
        }
        else
        {
            price = 19.99;
        }
        
        return price;
    }
    
    
    
            

            
}
