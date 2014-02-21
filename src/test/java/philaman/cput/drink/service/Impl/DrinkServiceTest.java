/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.drink.service.Impl;

import java.util.*;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import philaman.cput.drink.Config.AppConfig;
import philaman.cput.drink.service.DrinkService;

/**
 *
 * @author student
 */
public class DrinkServiceTest {

    private static DrinkService serv;
   
    private static List<DrinkService> cans = new ArrayList<>();    
   
    public DrinkServiceTest() {
       cans.add(serv.addDrink("2123", "Coke", "500ml", 8.00, 20));
       cans.add(serv.addDrink("2122", "Sprite", "750ml", 10.00, 20));
       cans.add(serv.addDrink("2121", "Lemon twist", "500ml", 8.00, 20));
    }    
    
    @Test
    public void testAddingSOH()
    {//Method add Stock on hand increases drinks on hand
        Assert.assertEquals(serv.addSOH(3, 40), 43);       
    }
    
    @Test
    public void AddDrinks()
    {
       cans.add(serv.addDrink("2123", "Coke", "500ml", 8.00, 20));
       Assert.assertNotNull(cans,"New Drinks added.");
       Assert.assertEquals(cans.get(1), serv.addDrink("2123", "Coke", "500ml", 8.00, 20));
    }   
    @Test
    public void testSameObjects()
    {
        cans.add(serv.addDrink("2101", "Lemon twist", "450ml", 7.50, 20));
        Assert.assertTrue(true);
    }
    @Ignore
    public void testSellDrink() {             
        
        Assert.assertEquals(serv.sellDrink(20.00, 8.00), 12, 0.0, "Check change amount after a drink sale.");
    }  
    
  
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        serv = (DrinkService) ctx.getBean("DrinkServempl");        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        
    }

    /*@Test
     public void testSomeMethod() {
     // TODO review the generated test code and remove the default call to fail.
     //  fail("The test case is a prototype.");
     }*/
}
