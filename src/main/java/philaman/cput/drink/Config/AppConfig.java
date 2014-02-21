/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.drink.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import philaman.cput.drink.service.DrinkService;
import philaman.cput.drink.service.Impl.DrinkServiceempl;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    
    @Bean(name="DrinkServempl")
    public DrinkService getDrinkService()
    {
        return new DrinkServiceempl();
    }
        
}
