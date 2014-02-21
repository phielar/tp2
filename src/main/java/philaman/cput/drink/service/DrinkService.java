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
    
    public double sellDrink(double d, double b);
    public DrinkService addDrink(String item, String cola, String ml, double d, int i);    
    public int addSOH(int i, int i0);
   
}
