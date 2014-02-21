/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.drink.service.Impl;
import java.util.ArrayList;
import java.util.List;
import philaman.cput.drink.service.DrinkService;

/**
 *
 * @author student
 */
public class DrinkServiceempl implements DrinkService{

    String drinkType;
    String canSize;
    double price;
    static int qntyOH;

    public DrinkServiceempl(String drinkType, String canSize, double price, int qnty) {
        this.drinkType = drinkType;
        this.canSize = canSize;
        this.price = price;
        qntyOH=qnty;
    }  

    public DrinkServiceempl() {
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double sellDrink(double d, double b) {
        return d-b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addSOH(int i,int b) {
        
        return i+b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DrinkService addDrink(String item, String cola, String ml, double d, int i) {   
        return new DrinkServiceempl(item, ml, d, i)  ; //To change body of generated methods, choose Tools | Templates.
    }       

    

    
}
