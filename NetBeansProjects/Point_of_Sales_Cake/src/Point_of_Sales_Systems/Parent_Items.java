/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point_of_Sales_Systems;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author joycezheng
 */
public class Parent_Items {
    
    public double BaseChocolate;
    public double BaseCarrot;
    public double BaseFruit;
    public double BaseStrawberryShort;
    public double BaseChocolateCheese;
    public double BaseStrawberryCheese;
    public double BaseCookie;
    public double BaseTiramisu;
    public double BaseLemon;
    public double BaseDarkChocolate;
    public double BaseCherry;
    
    public double Strawberry;
    public double Blueberries;
    public double Raspberries;
    public double Cherries;
    public double Fruit;
    public double Chocolate;
    public double ChocolateStrawberry;
    public double Candies;
    public double ReeseCups;
    
    public double WhippedCream;
    public double ChocolateDrizzle;
    public double Sprinkles;
    public double ChocolateShavings;
    public double Sugar;
    
    public double Vanilla;
    public double ChocCream;
    public double CreamCheese;
    public double Candy;
    public double ButterCream;
    public double Pumpkin; 
    public double Carrot;
    public double Coffee;
    public double DarkChocolate;
    public double Plain;
    public double IceCream;
    public double OreoCream;
    
    public double itemscost1;
    public double itemscost2;
    public double itemscost3;
    public double itemscost4;
    public double itemscost5;
    public double itemscost;
    
    public double GetAmount(){
        itemscost1 = Strawberry + Blueberries + Raspberries + Cherries + Fruit + Chocolate + ChocolateStrawberry + Candies + ReeseCups;
        itemscost2 = WhippedCream + ChocolateDrizzle + Sprinkles + ChocolateShavings + Sugar;
        itemscost3 = Vanilla + ChocCream + CreamCheese + Candy + ButterCream + Pumpkin + Carrot + Coffee + DarkChocolate + Plain + IceCream + OreoCream;
        
        itemscost = itemscost1 + itemscost2 + itemscost3 + itemscost4 + itemscost5;
        return (itemscost);
    }
    private JFrame frame;
    
    public void iExitSystem(){
        
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Inheritances", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    //Calculte Tax
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount){
        
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
}
