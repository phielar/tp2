/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.drink.service;

import java.util.*;

/**
 *
 * @author student
 */
public interface DrinkService {
    
    String flavour[]={"Coke", "Sprite", "Lemon Twist", "Coke zero", "Fanta"};    
    
   public double sellDrink(double d, double b);
    public int addSOH(int i, int b);
    public DrinkService addDrink(String item, String cola, String ml, double d, int i);    
    public List uniqueFlavours();
}
